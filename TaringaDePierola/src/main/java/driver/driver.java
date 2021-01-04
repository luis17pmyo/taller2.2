package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class driver {
    //Variable
    public WebDriver driver;

    //Retornar
    public WebDriver returnDriver()
    {
        return driver;
    }

    //Activar el Navegador
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    public void setupTest() {
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    //Linea de Url
    public void goto_url(String url_address) throws InterruptedException{
        driver.get(url_address);
        driver.manage().window().maximize();
        Thread.sleep(1000);
    }
    //Espera Implícita
    public void implicitwait() {

        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
    }
    //Ejecucion de los Metodos
    public driver(){
        setupClass();
        setupTest();
    }

    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}
