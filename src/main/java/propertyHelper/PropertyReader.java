package propertyHelper;

import lombok.extern.log4j.Log4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
@Log4j
public class PropertyReader {
    private static Properties properties;

    public PropertyReader(String propertyName) {
        properties = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream("src/main/resources/" + propertyName + ".properties");
            properties.load(inputStream);
            log.debug("src/main/resources/" + propertyName + ".properties");
        } catch (IOException e)
    {
        e.printStackTrace();
    }
}
    public static Properties getProperties() {
        return properties;
    }
}