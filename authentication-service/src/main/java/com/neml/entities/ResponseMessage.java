package com.neml.entities;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ResponseMessage {
	public static final long NO_ERROR = 500000L;
	private String message;
	private long errorCode;
	public ResponseMessage() {
		setErrorCode(NO_ERROR);
	}
}
