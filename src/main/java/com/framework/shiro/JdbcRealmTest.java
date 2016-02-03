package com.framework.shiro;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;

/**
 * 例子2
 * <p>
 * 使用jdbcRealm 这个认证用到用户users表,表名必须是uesrs并且要有表中的三个字段。<br/>
 * 表在shiro库中
 * </p>
 */
public class JdbcRealmTest {

	public static void main(String[] args) {
		// 读取配置文件,初始化SecurityManager工厂用来获得登录信息
		Factory<SecurityManager> factory = new IniSecurityManagerFactory(
				"classpath:shiro/shirojdbc.ini");
		// 获取securityManager实例
		SecurityManager securityManager = factory.getInstance();
		// 绑定实例
		SecurityUtils.setSecurityManager(securityManager);
		// 得到当前执行用户
		Subject currentUser = SecurityUtils.getSubject();
		// 获取token令牌，根据用户名和密码。用于登录操作
		UsernamePasswordToken token = new UsernamePasswordToken("root",
				"123456");
		try {
			// 登录操作，进行身份认证
			currentUser.login(token);
			System.out.println("身份认证成功");
		} catch (AuthenticationException e) {
			e.printStackTrace();
			System.out.println("身份认证失败");
		}
		// 退出登录
		currentUser.logout();
		System.out.println("退出");
	}

}
