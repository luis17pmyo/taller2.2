package pages;
import driver.driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class taringaSeccionPage {
    driver dv;
    public taringaSeccionPage(driver Driver){
        this.dv=Driver;
        PageFactory.initElements(this.dv.returnDriver(),this);
    }

    //Campos de estructura
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/section/form/div[2]/div/label/div/input")
    WebElement texUsuario;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/section/form/div[3]/div/label/div/input")
    WebElement texContra;
    @FindBy(xpath = "/html/body/div[1]/div/header/nav/div/div[2]/ul[1]")
    WebElement texMostrar;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/section/form/button")
    WebElement btnIngresar;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div[1]/section[1]/div[1]/div/div[1]/div/div/button")
    WebElement btnCrearArticulo;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/main/div/div[2]/div[2]/input")
    WebElement texTitulo;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/main/div/div[2]/div[4]/div/div[2]/div/div/div[2]/div/div/div/div")
    WebElement texDocumento;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/main/div/aside/div[1]/div[2]/form[1]/input")
    WebElement texEtiqueta;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/aside/div[1]/div[2]/form[2]/div/input")
    WebElement texFuente;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div/aside/div[1]/div[2]/button[1]")
    WebElement btnPublicar;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div[5]/div/main/div[1]/div[3]/div/div/div[2]/div/a/div/h2")
    WebElement texMostrarPublic;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/div/div[4]")
    WebElement btnMes;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/main/div[1]/section[1]/div[2]/div/section[1]/ul/li[1]/a/div[2]")
    WebElement btnSeleccion;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/div/main/div[1]/section/div/div[2]/div/div[1]/div/textarea")
    WebElement texComentario;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/div/main/div[1]/section/div/div[2]/div/div[2]/button")
    WebElement btnComentario;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/div/main/div[1]/section/div/header/div[2]/ul/li[1]/a")
    WebElement btnReciente;
    @FindBy(xpath = "/html/body/div[1]/div/div[5]/div/main/div[1]/section/div/div[3]/div[1]/article/div[2]/div[2]/div[2]/div/div[1]/div[1]/button")
    WebElement btnUpvote;

    //Entrar Usuario
    public void IngresarUsuarios(String value,String value2) {
        texUsuario.sendKeys(value);
        texContra.sendKeys(value2);
        btnIngresar.click();
    }
    //Entrar Articulo
    public void IngresarArticulo(String value,String value1,String value2, String value3){
        btnCrearArticulo.click();
        texTitulo.sendKeys(value);
        texDocumento.sendKeys(value1);
        texEtiqueta.sendKeys(value2);
        texFuente.sendKeys(value3);
        btnPublicar.click();
    }
    //Entrada Mes
    public void IngresarMes(String value){
        btnMes.click();
        btnSeleccion.click();
        texComentario.sendKeys(value);
        btnComentario.click();
        btnReciente.click();
        btnUpvote.click();
    }
    //Mostrar Elemento
    public String getElementos() {
        return texMostrar.getText();
    }
    //Mostrar Elemento Publicacion
    public String getPublicacion() {
        return texMostrarPublic.getText();
    }
}



