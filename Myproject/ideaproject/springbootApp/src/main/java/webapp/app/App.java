package webapp.app;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 
 * 
 * 
 * @author lenovo
 *
 */
@SpringBootApplication
public class App 
{
	
	static
	{
		try {
			FileInputStream  fin  = new FileInputStream("./src/main/resources/db.properties");
		
		     Properties  p = new Properties();
		     
		     p.load(fin);
		     
		     System.out.println(p.getProperty("dbname"));
		     
		     
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
