import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class ejercicio2 {

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
        //Elemento1
        //Descripcion
      /*  String elementoD="";
        elementoD="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span";
        WebElement respuestaD=driver.findElement(By.xpath(elementoD));
        System.out.println("dato1 :"+respuestaD.getText());*/

        //Precio
        String elementoP="";
        WebElement respuestaP;
        int precio=0;
        elementoP="//body/div[@id='a-page']/div[@id='search']/div[1]/div[2]/div[1]/span[3]/div[2]/div[3]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/a[1]/span[1]/span[2]/span[2]";
        respuestaP=driver.findElement(By.xpath(elementoP));
        System.out.println("precio 1:"+respuestaP.getText());
        precio=Integer.parseInt(respuestaP.getText());

        //Elemento2
        //Descripcion
       /* String elementoD2="";
        WebElement respuestaD2;
        elementoD2="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a/span";
        respuestaD2=driver.findElement(By.xpath(elementoD2));
        System.out.println("dato2 :"+respuestaD2.getText());*/

        //Precio
        String elementoP2="";
        WebElement respuestaP2;
        int precio2=0;
        elementoP2="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[4]/div/div/div/a/span/span[2]/span[2]";
        respuestaP2=driver.findElement(By.xpath(elementoP2));
        System.out.println("precio 2:"+respuestaP2.getText());
        precio2=Integer.parseInt(respuestaP2.getText());

          String irelemento="";
         if (precio<=precio2) {

            String elementoD="";
            elementoD="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/h2/a/span";
             irelemento=elementoD;
            WebElement respuestaD=driver.findElement(By.xpath(elementoD));
            System.out.println("La mejor opción de compra es "+respuestaD.getText()+",cuesta US$ "+Integer.toString(precio));

        }else{

             String elementoD2="";
             elementoD2="//*[@id='search']/div[1]/div[2]/div/span[3]/div[2]/div[4]/div/span/div/div/div/div/div[2]/h2/a/span";
             WebElement respuestaD2=driver.findElement(By.xpath(elementoD2));
             System.out.println("La mejor opción de compra es "+respuestaD2.getText()+",cuesta US$ "+Integer.toString(precio2));
             irelemento=elementoD2;
        }

        //selecciona el elemento con menor Precio para Mostrar
        String seleElemento=irelemento;
        WebElement seleElement = null;
        driver.findElement(By.xpath(seleElemento)).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
       // driver.close();
    }
}
