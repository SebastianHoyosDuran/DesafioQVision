package steps;


import driver.GoogleChromeDriver;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import pages.UIPrincipal;
import pages.UIRegistro;

public class Registrarse {

    UIPrincipal uiPrincipal = new UIPrincipal();
    UIRegistro uiRegistro = new UIRegistro();

    public  String nombre  ;
    public  String contrasenia;
    public  String correo;

    public String generarTexto(int tamanioCaracteres){
        String texto = RandomStringUtils.randomAlphabetic(tamanioCaracteres);
        return texto;
    }
    //public void registrarse(String nombre , String contrasenia , String correo){
    public void registrarse(){

        nombre = generarTexto(6);
        contrasenia = generarTexto(12);
        correo = nombre + "@gmail.com";
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnIrRegistrase()).click();
        GoogleChromeDriver.driver.findElement(uiRegistro.getTxtUsername()).sendKeys(nombre);
        GoogleChromeDriver.driver.findElement(uiRegistro.getTxtPassword()).sendKeys(contrasenia);
        GoogleChromeDriver.driver.findElement(uiRegistro.getTxtEmail()).sendKeys(correo);
        GoogleChromeDriver.driver.findElement(uiRegistro.getBtnSingUp()).click();
    }

    public void validarRegistro() throws InterruptedException {
        Thread.sleep(1000);
        GoogleChromeDriver.driver.findElement(uiPrincipal.getLblNombre()).isDisplayed();
        GoogleChromeDriver.driver.close();
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

}
