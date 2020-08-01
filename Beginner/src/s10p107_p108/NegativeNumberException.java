package s10p107_p108;

/* Custom Exception.  */
@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {

	NegativeNumberException() {
		super();
	}
	
	NegativeNumberException(String message) {
		super(message);
	}
	
}
