package com.nelioalves.cursomc.services.execptions;

public class DataIntregrityException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public DataIntregrityException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
