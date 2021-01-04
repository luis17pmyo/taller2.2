package POM;

import driver.driver;
import pages.variables;
import pages.taringaPage;
import pages.taringaSeccionPage;

public class taringaPOM {

    //instanciar
    driver dv;
    taringaPage ap2;
    taringaSeccionPage ap3;
    variables v=new variables();
    public taringaPOM(driver Driver){
        this.dv= Driver;
        this.ap2=new taringaPage(this.dv);
        this.ap3=new taringaSeccionPage(this.dv);
    }

    public void irApagina() throws InterruptedException {
        dv.goto_url(v.url);
        dv.implicitwait();
    }
    public void irIngreso(){ap2.ingresar();}
    public void irArticulo(String value,String value1,String value2, String value3)
    {
        ap3.IngresarArticulo(value,value1,value2,value3);
    }
    public void irMes(String value){
        ap3.IngresarMes(value);
    }

    public void irUsuario(String value,String value2){
        ap3.IngresarUsuarios(value,value2);
    }

    public void ingresarUsuario()throws InterruptedException {

        irApagina();
        dv.implicitwait();
        irIngreso();
        irUsuario(v.usuario,v.pass);
        dv.implicitwait();
        System.out.println("Validacion de la Barra");
        if (v.BarraSuperior.equals(ap3.getElementos()))
        {
            System.out.println("Es igual a la variable");
        }else{
            System.out.println("Barra de Web \n"+ap3.getElementos()+"\n no es igual a la variable \n"+v.BarraSuperior);
        }
        dv.implicitwait();

    }

    public void ingresaUsario2()throws InterruptedException{
        irApagina();
        dv.implicitwait();
        irIngreso();
        irUsuario(v.usuario,v.pass);
        dv.implicitwait();
        irArticulo(v.titulo,v.documento,v.etiqueta,v.fuente);
        dv.implicitwait();
        System.out.println("Validacion De la publicacion");
        dv.implicitwait();
       /* System.out.println(ap3.getPublicacion());
        dv.implicitwait();*/
    }
    public void ingresaUsario3()throws InterruptedException{
        irApagina();
        dv.implicitwait();
        irIngreso();
        irUsuario(v.usuario,v.pass);
        dv.implicitwait();
        irMes(v.comentario);
        dv.implicitwait();
        dv.implicitwait();

    }


}
