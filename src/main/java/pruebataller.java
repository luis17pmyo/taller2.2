import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pruebataller {

public static void main(String[] args)
{
    /*
    * tc 1
    *
    * */
    WebDriver driver = null;
    WebDriverManager.chromedriver().version("87.0.4280.88").setup();
    driver = new ChromeDriver();
    //abrimos el browser
    driver.get("https://www.google.com/");

    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    //seleccionamos el textbox de busqueda y colocamos un criterio

   String localizadorXpath = "//*[@id='tsf']/div[2]/div[1]/div[1]/div/div[2]/input";

    WebElement inputBusqueda = null;

    //driver al colocarle un xpath se convierte en un webelemnt
    inputBusqueda = driver.findElement(By.xpath(localizadorXpath));
    inputBusqueda.sendKeys("wikipedia");
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    inputBusqueda.sendKeys(Keys.ENTER);
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }

    String wikilinkPath = "//*[@id='rso']/div[1]/div/div/div/div[1]/a/h3/span";
    WebElement wikiElement = driver.findElement(By.xpath(wikilinkPath));
    wikiElement.click();
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    String esferaPath = "//*[@id='p-logo']/a";
    WebElement esferaElement = driver.findElement(By.xpath(esferaPath));
    try {
        Thread.sleep(3000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    Boolean respuesta = esferaElement.isEnabled() && esferaElement.isDisplayed();
    System.out.println(respuesta);

    driver.close();

}


}
