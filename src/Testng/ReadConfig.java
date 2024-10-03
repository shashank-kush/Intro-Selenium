package Testng;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {             //PropertyFiles main class             and config.properties

	Properties pro;        //class
	
	String path = "C:\\Eclipse Workspaces\\selenium\\introselenium\\src\\Testng\\config.properties";  // this is the path from config.properties file 
	
	//Constructor
	public ReadConfig() {
		pro = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(path);
			try {
				pro.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public String getURL() {
		String url = pro.getProperty("url");
		return url;
	}
	public String getUserName() {
		String userName = pro.getProperty("username");
		return userName;
	}
	public String getPassword() {
		String Password = pro.getProperty("password");
		return Password;
	}
	
	
}
