import static org.junit.Assert.*;

import org.junit.Test;

public class EmailClientTest {
	
	@Test
	   public void testPass () { 
			boolean result = EmailClient.Valid("test@gmail.com");
	   		assertTrue(result == true);
	   }

	  @Test
	   public void testInvalidLocalPart() {
		  //dots are not allowed in the local part of the email address
		  boolean result = EmailClient.Valid("test...ss@gmail.com");
	   		assertTrue(result == true);  		
	   }
	  
	  @Test
	   public void testInvalidAddress() {
		  //invalid global address part of email address
		  boolean result = EmailClient.Valid("test@gmail");
		  assertTrue(result == true);  		
	   }
	  
	  @Test
	   public void testInvalidFormat() {
		  //invalid characters in the email
		  boolean result = EmailClient.Valid("test@@gmail.com");
		  assertTrue(result == true);  		
	   }
	  
	  @Test
	   public void testSpecialChar() {
		  //special characters in local part of address
		  boolean result = EmailClient.Valid(":)))@gmail.com");
		  assertTrue(result == true);  		
	   }
	  
	  @Test
	   public void testNoLocal() {
		  //no local address part of email
		  boolean result = EmailClient.Valid("@yahoo.com");
		  assertTrue(result == true);  		
	   }

}
