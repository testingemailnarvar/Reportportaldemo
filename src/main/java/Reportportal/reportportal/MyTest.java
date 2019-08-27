package Reportportal.reportportal;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class MyTest extends BaseTest{
	 
	    
	    @Test
	    public void testMySimpleTest() {
	    	  try {
				Log test_log=new Log("log.txt");
				
		         //String schema_json="{\"$schema\":\"http://json-schema.org/draft-04/schema\",\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		      //  String newString=schema_json.replace("\",", "");
		        //.out.println(">>"+newString);
		       // String expected= "{\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		       int a=5;
		       int b=6;
                Assert.assertEquals(a, b );
		        test_log.logger.info("Failed");
		        
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	       


	    }
	    
	    @Test
	    public void testMySimpleTest1() {
	    	  try {
				Log test_log=new Log("log.txt");
				
		         //String schema_json="{\"$schema\":\"http://json-schema.org/draft-04/schema\",\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		      //  String newString=schema_json.replace("\",", "");
		        //.out.println(">>"+newString);
		       // String expected= "{\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		       int a=5;
		       int b=6;
                Assert.assertEquals(a, b );
		        test_log.logger.info("Failed");
		        
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	       


	    }
	    @Test
	    public void testMySimpleTest2() {
	    	  try {
				Log test_log=new Log("log.txt");
				
		         //String schema_json="{\"$schema\":\"http://json-schema.org/draft-04/schema\",\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		      //  String newString=schema_json.replace("\",", "");
		        //.out.println(">>"+newString);
		       // String expected= "{\"type\":\"object\",\"properties\":{\"order_info\":{\"requiredNonNull\":[\"order_date\",\"order_number\"],\"requiredAnyOf\":[\"order_number\",\"billing\"],\"type\":\"object\",\"properties\":{\"order_date\":{\"minLength\":12,\"type\":\"string\",\"maxLength\":255},\"order_number\":{\"type\":\"object\",\"properties\":{}}},\"dependencies\":{\"order_number\":[\"order_date\"]}}}}";
		       int a=5;
		       int b=5;
                Assert.assertEquals(a, b );
		        test_log.logger.info("Failed");
		        
			} catch (SecurityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        
	       


	    }
}
