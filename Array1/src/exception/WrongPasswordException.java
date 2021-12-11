package exception;

	public class WrongPasswordException extends RuntimeException {

		public String getMessage()
		{
		
			return "invalid password";
		}

	}


