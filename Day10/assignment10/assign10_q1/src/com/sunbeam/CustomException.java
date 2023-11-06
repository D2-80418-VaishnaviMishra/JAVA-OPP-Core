package com.sunbeam;

public class CustomException extends RuntimeException{
	private String field;
	private int value;
	
	public CustomException() {
		super("Invalid Input");
	}

	public CustomException(String field, int value) {
		super("Invalid "+field+": "+value);
		this.field = field;
		this.value = value;
	}
	
	public CustomException(String field, String value) {
		super("Invalid "+field+": "+value);
	}
	
	public CustomException(String field, double value) {
		super("Invalid "+field+": "+value);
	}

	public String getField() {
		return field;
	}

	public void setField(String field) {
		this.field = field;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}
