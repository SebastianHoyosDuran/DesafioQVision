package steps;

import driver.GoogleChromeDriver;
import pages.UICrearArticulo;
import pages.UIPrincipal;

public class CrearArticulo {

    UICrearArticulo uiCrearArticulo = new UICrearArticulo();
    UIPrincipal uiPrincipal = new UIPrincipal();

    public void crearArticulo() throws InterruptedException {
        GoogleChromeDriver.driver.findElement(uiCrearArticulo.getTxtTituloArticulo()).sendKeys("Titulo del Articulo " + (Math.random()*10+1));
        GoogleChromeDriver.driver.findElement(uiCrearArticulo.getTxtDescripcionArticulo()).sendKeys("Descripcion del Articulo");
        GoogleChromeDriver.driver.findElement(uiCrearArticulo.getTxtAreaDescripcionArticulo()).sendKeys("Area del Articulo");
        GoogleChromeDriver.driver.findElement(uiCrearArticulo.getBtnCrearArticulo()).click();
        Thread.sleep(3000);
    }

    public void validarCreacionArticulo() {
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnIrInicio()).click();
        GoogleChromeDriver.driver.findElement(uiPrincipal.getBtnIrGlobal()).click();
        GoogleChromeDriver.driver.findElement(uiPrincipal.getTxtPrimerTitulo()).isDisplayed();
    }

}
