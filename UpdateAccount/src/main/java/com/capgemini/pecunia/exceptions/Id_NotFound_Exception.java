package com.capgemini.pecunia.exceptions;

@SuppressWarnings("serial")
public class Id_NotFound_Exception extends Exception {
	public Id_NotFound_Exception(String errorMsg){
		super(errorMsg);
	}
}
