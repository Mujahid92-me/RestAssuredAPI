package Java.RestAssured;

import org.apache.commons.lang3.RandomStringUtils;

public class RestUtils {
	
	public static String getName()
	{
		String str =RandomStringUtils.randomAlphabetic(5);
		
		return ("Mujahid "+str);
		 
	}
	
	public static String job()
	{
		String str =RandomStringUtils.randomAlphabetic(4);
		
		return ("job "+str);
		
	}
	
	
}
