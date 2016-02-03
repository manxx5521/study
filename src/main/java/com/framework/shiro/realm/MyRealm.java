package com.framework.shiro.realm;

import java.sql.Connection;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.framework.shiro.dao.UserDao;
import com.framework.shiro.entity.User;
import com.framework.shiro.util.DbUtil;

/**
 * 先身份认证 后授权
 */
public class MyRealm extends AuthorizingRealm{
	private UserDao userDao=new UserDao();
	private DbUtil dbUtil=new DbUtil();
	/**
	 * 为当权登录用户授权
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(
			PrincipalCollection principals) {
		String userName=(String)principals.getPrimaryPrincipal();
		
		//用来存放认证信息，并返回
		SimpleAuthorizationInfo authorizationInfo=new SimpleAuthorizationInfo();
		Connection con=null;
		try{
			con=dbUtil.getCon();
			authorizationInfo.setRoles(userDao.getRoles(con,userName));
			authorizationInfo.setStringPermissions(userDao.getPermissions(con,userName));
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return authorizationInfo;
	}
	
	
	/**
	 * 身份认证，验证当前登录用户	
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(
			AuthenticationToken token) throws AuthenticationException {
		//获取用户名
		String userName=(String) token.getPrincipal();
		Connection con=null;
		try{
			con=dbUtil.getCon();
			//数据库获得user信息
			User user=userDao.getByUserName(con, userName);
			if(user!=null){
				//将数据库信息，和token信息比较
				AuthenticationInfo authcInfo=new SimpleAuthenticationInfo(user.getUserName(),user.getPassword(),"xx");
				return authcInfo;
			}else{
				return null;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try {
				dbUtil.closeCon(con);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
	}

}
