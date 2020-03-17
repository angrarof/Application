package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesFile {
    private static String username;
    private static String password;

    Properties properties = new Properties();
    InputStream inputStream = null;

    public PropertiesFile(){
        loadBrowserProperties();
    }

    private void loadBrowserProperties(){
        try {
            inputStream = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config\\config.properties");
            properties.load(inputStream);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public String readBrowserProperty(){
        return properties.getProperty("browser");
    }

    public void setCredentials(String user){
        username = properties.getProperty(user);
        password = properties.getProperty("pass");
    }

    public static String getUsername(){
        return username;
    }

    public static String getPassword(){
        return password;
    }

}
