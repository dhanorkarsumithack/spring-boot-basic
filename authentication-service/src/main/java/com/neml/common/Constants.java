package com.neml.common;

public class Constants {
	public static interface ACTIVE_FLAGS {
		public String INACTIVE = "I";
		public String ACTIVE = "A";
	}
	
	public static interface YES_NO {
		public static final String YES = "Y";
		public static final String NO = "N";
	}

	public interface ERROR_CODES {
		public final static long NO_ERROR = 300000;
		public final static long USER_NOT_REGISTERED = 101; 
		public final static long SERVER_ERROR = 102; 
		public final static long UNAUTHORISED_ACTION = 103;
		public final static long EXCEPTION_OCCURED = 104;
		public final static long TRANSACTION_FAILED = 105;
		public final static long USER_ALREADY_EXIST = 106;
		long INVALID_FIELD_VALUE = 113;
	}
	
	public static interface MESSAGE_TRACKER {
		public String MESSAGE_TYPE = "S";
		public String MSG_STATUS = "P";
		public static final int NO_OF_ATTACHMENT = 1;
		public static final int ZERO_ATTACHMENT = 0;

	}
	public static interface SESSION_PREFIX {
		public String JWT_TOKEN = "JWT";
		public String IDLE_SESSION_DATA = "IDLE";
		public String REFRESH_JWT_TOKEN = "REFRESHJWT";

	}
}
