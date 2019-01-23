package com.nelioalves.cursomc.services.execptions;

public class ObjectNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFoundException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
