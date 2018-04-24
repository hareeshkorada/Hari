package po;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.standardchartered.genie.model.GenieScenario;

import cucumber.api.Scenario;

public class GeniePropertyFile {

	private GenieScenario genieScenario;
	public static String Value;
    public static File propFile=new File("src/test/resources/Testdata.properties");
    private static Properties seleniumProperties = new Properties(); 
    public GeniePropertyFile(Scenario scenario) throws FileNotFoundException 
	{
		this.genieScenario = (GenieScenario) scenario;
        
    }

	
    public String propertyMethod(String Constants) throws IOException
    {
           FileInputStream file = new FileInputStream(propFile);
           try
           {
           seleniumProperties.load(file);
           Value=seleniumProperties.getProperty(Constants);
           }
           catch(Exception e)
           {
           e.printStackTrace(); 
           }
           finally
           {      
           file.close();    
           }
           return Value;
    }

}
