package steps;

import driver.GoogleChromeDriver;
import pages.UICrearArticulo;
import pages.UILogin;
import pages.UIPrincipal;

public class Loguearse {

    UIPrincipal uiPrincipal = new UIPrincipal();
    UILogin uiLoguin = new UILogin();
    UICrearArticulo uiCrearArticulo = new UICrearArticulo();

    Registrarse registrarse = new Registrarse();

    public void loguearse(){
        String correo = "faYcRq@gmail.com";
        String contrasenia = "PruebaQA";
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnLogin()).click();
        GoogleChromeDriver.driver.findElement(uiLoguin.getTxtEmail()).sendKeys(correo);
        GoogleChromeDriver.driver.findElement(uiLoguin.getTxtContrasenia()).sendKeys(contrasenia);
        GoogleChromeDriver.driver.findElement(uiLoguin.getBtnIngresar()).click();
    }

    public void validarLogueo() throws InterruptedException {
        Thread.sleep(2000);
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnIrCrearArticulo()).isDisplayed();
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnIrCrearArticulo()).click();
        GoogleChromeDriver.driver.findElement(uiCrearArticulo.getBtnCrearArticulo()).isDisplayed();

    }

}
