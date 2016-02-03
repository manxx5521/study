package com.framework.shiro;

import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.framework.shiro.util.ShiroUtil;

/**
 * 例子4，验证权限
 */
public class PermissionTest {
	
	/**
	 * 验证是否有指定权限，返回boolean
	 */
	@Test
	public void testIsPermitted (){
		//获得当前用户
		Subject currentUser=ShiroUtil.login("classpath:shiro/shiroPermission.ini", "root", "123456");
		
		boolean b=currentUser.isPermitted("user:select");
		System.out.println(b?"有user:select的权限":"没有user:select的权限");
		b=currentUser.isPermitted("user:delete");
		System.out.println(b?"有user:delete的权限":"没有user:delete的权限");
		
		System.out.println("--------------");
		//多个一起验证返回数组
		boolean[] bs=currentUser.isPermitted("user:select","user:delete");
		System.out.println(bs[0]?"有user:select的权限":"没有user:select的权限");
		System.out.println(bs[1]?"有user:delete的权限":"没有user:delete的权限");
		
		System.out.println("--------------");
		//是否拥有所有权限，全部都有才为真
		boolean ba=currentUser.isPermittedAll("user:select","user:delete");
		System.out.println(ba?"user:select和user:delete的权限全有":"user:select和user:delete的权限不全有");
		
		currentUser.logout();
	}
	
	/**
	 * 验证是否有指定权限，不过通过返回异常AuthorizationException
	 */
	@Test
	public void testCheckPermitted (){
		try {
			//获得当前用户
			Subject currentUser=ShiroUtil.login("classpath:shiro/shiroPermission.ini", "root", "123456");
			
			currentUser.checkPermission("user:select");
			
			//多个一起验证
			currentUser.checkPermissions("user:select","user:delete");
			
			currentUser.logout();
			
		} catch (AuthorizationException e) {
			e.printStackTrace();
		}
	}
	
}
