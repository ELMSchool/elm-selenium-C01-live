package utils;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfReader {
	
	
	private static Properties properties;
	
	static {
		
		
		
		try {
			String path = "configuration.properties";
			
			FileInputStream file = new FileInputStream(path);
			
			properties = new Properties();
			properties.load(file);
			
			file.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static String get(String key) {
		return properties.getProperty(key);
	}
}
