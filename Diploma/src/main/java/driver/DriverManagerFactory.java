package driver;

import io.github.bonigarcia.wdm.config.DriverManagerType;


public class DriverManagerFactory {

    public static DriverManager getManager(DriverManagerType driverManagerType) {
        DriverManager driverManager = null;
        if (driverManagerType == DriverManagerType.CHROME) {
            driverManager = new ChromeDriverManager();
        }
        return driverManager;
    }
}