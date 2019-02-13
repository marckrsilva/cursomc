package com.nelioalves.cursomc.resources.execption;

import java.util.ArrayList;
import java.util.List;

public class validationError extends StandardError {
	private static final long serialVersionUID = 1L;
	
	private List<FieldMessage> errors = new ArrayList<>();

	public validationError(Integer status, String msg, Long timeStamp) {
		super(status, msg, timeStamp);
	}
	
	public List<FieldMessage> getErrors(){
		return errors;
	}
	
	public void addError(String fieldName, String message) {
		errors.add(new FieldMessage(fieldName, message));
	}


}
