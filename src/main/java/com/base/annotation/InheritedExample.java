package com.base.annotation;

import java.lang.annotation.Inherited;

public class InheritedExample {
	//@Inherited Ԫע����һ�����ע�⣬@Inherited������ĳ������ע�������Ǳ��̳еġ�
	
	@Inherited
	public @interface Greeting {
	    public enum FontColor{ BULE,RED,GREEN};
	    String name();
	    FontColor fontColor() default FontColor.GREEN;
	}

}
