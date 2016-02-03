package com.framework.shiro;

import java.util.Arrays;

import org.apache.shiro.subject.Subject;
import org.junit.Test;

import com.framework.shiro.util.ShiroUtil;

/**
 * 例子3，验证角色
 */
public class RoleTest {
	
	/**
	 * 验证是否有角色，返回boolean
	 */
	@Test
	public void testRole(){
		//获得当前用户
		Subject currentUser=ShiroUtil.login("classpath:shiro/shiroRole.ini", "root", "123456");
		
		boolean b=currentUser.hasRole("role1");
		System.out.println(b?"有role1这个角色":"没有role1这个角色");
		
		boolean[] bs=currentUser.hasRoles(Arrays.asList("role2","role3"));
		System.out.println(bs[0]?"有role2这个角色":"没有role2这个角色");
		System.out.println(bs[1]?"有role3这个角色":"没有role3这个角色");
		
		 boolean ba=currentUser.hasAllRoles(Arrays.asList("role2","role3"));
		 System.out.println(ba?"role2和role3两个角色都有":"role2和role3两个角色不全有");
	}
	
	/**
	 * 检查是否有角色，没有返回一个异常UnauthorizedException
	 */
	@Test
	public void checkRole(){
		try {
			//获得当前用户
			Subject currentUser=ShiroUtil.login("classpath:shiro/shiroRole.ini", "root", "123456");
			
			currentUser.checkRole("role1");
			System.out.println("有role1这个角色");
			
			//以下两个方法一样,验证多个角色
			currentUser.checkRoles(Arrays.asList("role2","role3"));
			currentUser.checkRoles("role2","role3");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("角色验证失败");
			
		}
		
	}
	
}
