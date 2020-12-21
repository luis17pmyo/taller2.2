import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejercicio1 {

    public static void main(String[] args)
    {
        //abrir el navegador de google
        WebDriver driver = null;
        WebDriverManager.chromedriver().driverVersion("87.0.4280.88").setup();
        driver = new ChromeDriver();
        //abrimos el browser
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //seleccionamos el textbox de busqueda y colocamos un criterio
        String localizadorXpath = "//input[@id='twotabsearchtextbox']";
        WebElement inputBusqueda = null;
        inputBusqueda = driver.findElement(By.xpath(localizadorXpath));
        inputBusqueda.sendKeys("Zapatillas para hombres");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        inputBusqueda.sendKeys(Keys.ENTER);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //selecciona el elemento
        String seleElemento = "//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]/a[1]/span[1]";
        WebElement seleElement = null;
        driver.findElement(By.xpath(seleElemento)).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //Imprimir por consola la descripcion
        String strDescripcion = "//h1[@id='title']";
        String respuestaD= driver.findElement(By.xpath(strDescripcion)).getText();
        System.out.println("Descripción :"+respuestaD);

        //Imprimir por consola el precio
        String respuestaP ="";
        String strPrecio ="";
        try {
            strPrecio ="//span[@id='priceblock_ourprice']";
        }catch (Exception e){strPrecio ="//span[@id='priceblock_saleprice']";}
        respuestaP=driver.findElement(By.xpath(strPrecio)).getText();
        System.out.println("Precio :"+respuestaP);

        //Imprimir por consola el ahorro
        String strAhorra="";
        String respuestaA="";
        try {
            respuestaA="No Existe";
        }catch (Exception e){
            strAhorra="/html[1]/body[1]/div[3]/div[2]/div[3]/div[3]/div[2]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]";
            respuestaA=driver.findElement(By.xpath(strAhorra)).getText();}
            System.out.println("Ahorro :"+respuestaA);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }
}
