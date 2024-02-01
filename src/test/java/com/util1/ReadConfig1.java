package com.util1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import com.baseTest.FacebookLoginTest;

public class ReadConfig1 extends FacebookLoginTest{
	
	FileInputStream input ;
	Properties prop = new Properties();
	
	
	public ReadConfig1() throws IOException {
		
		input = new FileInputStream("C:\\Users\\Mohammad\\eclipse-workspace\\TryTestNG1\\src\\test\\resources\\Properties\\login.properties");
		prop.load(input);
		
	}

	public String getUrl() {
		String myUrl=prop.getProperty("url");
		return myUrl;
	}
	
	public String getUser() {
		String myUname=prop.getProperty("username");
		return myUname;
			
	}
	public String getPass() {
		String myPass=prop.getProperty("password");
		return myPass;
	}
}
