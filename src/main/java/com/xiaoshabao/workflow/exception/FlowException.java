package com.xiaoshabao.workflow.exception;

/**
 * jdbc异常信息类
 */
public class FlowException extends Exception {

	private static final long serialVersionUID = 1L;

	public FlowException(String mess) {
		super(mess);
	}
	
	public FlowException(String message, Throwable cause) {
		super(message, cause);
	}

}
