package com.boot.aatral.exception;

public class ResourceNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	String resourceName;
	String fieldName;
	String fieldValue;
	
	long fieldValue1;

	public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
		super(String.format("%s not found with %s : %s", resourceName, fieldName, fieldValue));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}
	
	public ResourceNotFoundException(String resourceName, String fieldName, long fieldValue1) {
		super(String.format("%s not found with %s :%l", resourceName,fieldName,fieldValue1 ));
		this.resourceName = resourceName;
		this.fieldName = fieldName;
		this.fieldValue1 = fieldValue1;
	  }
}
