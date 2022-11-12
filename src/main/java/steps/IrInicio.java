package steps;

import driver.GoogleChromeDriver;
import org.openqa.selenium.By;

public  class IrInicio {

    public static void   abrirNavegador(String url){
        GoogleChromeDriver.ChromeDriver(url);
    }

}
