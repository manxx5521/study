package com.xiaoshabao.wechat.webservice.server;

import org.junit.Test;

public class TwsTest {
	@Test
	public void test(){
		TokenServerWSImplService service=new TokenServerWSImplService();
		TokenServerWS tokenws=service.getTokenServerWSImplPort();
        System.out.println(tokenws.getToken(100001).getAccessToken());
	}

}
