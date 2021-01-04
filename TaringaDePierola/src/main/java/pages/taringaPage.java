package pages;
import driver.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class taringaPage {
    //Variables
    driver dv=null;
    public taringaPage(driver Driver){
        this.dv=Driver;
        PageFactory.initElements(this.dv.returnDriver(),this);
    }

    //Campos de estructura
    @FindBy(xpath = "//span[contains(text(),'Iniciar sesión')]")
    WebElement btnSeccion;

    //Ir a Seccion
    public void ingresar(){
        btnSeccion.click();
    }
}

