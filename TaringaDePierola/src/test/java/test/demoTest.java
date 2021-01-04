package test;

import driver.driver;
import POM.taringaPOM;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demoTest {
    //instanciar
    driver dv=new driver();
    taringaPOM a2p=null;

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Inicio de prueba de demostración Taringa");
    }
    @Test(priority = 0)
    public void Autenticar() throws InterruptedException{
        this.a2p=new taringaPOM(dv);
        a2p.ingresarUsuario();
    }
    @Test(priority = 1)
    public void IngresoGmail() throws InterruptedException{
        this.a2p=new taringaPOM(dv);
        a2p.ingresaUsario2();
    }
    @Test(priority = 2)
    public void IngresoTop() throws InterruptedException{
        this.a2p=new taringaPOM(dv);
        a2p.ingresaUsario3();
    }


    @AfterClass
    public void teardown()
    {
        dv.teardown();
    }
}
