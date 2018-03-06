import org.apache.commons.validator.routines.*;
public class EmailClient {
	public static boolean Valid(String email) {
		EmailValidator validator = EmailValidator.getInstance();
		return validator.isValid(email);
	}
}
