package pages;

import org.openqa.selenium.By;

public class UIPrincipal {
    By BtnIrRegistrase = By.xpath("//a[@class='nav-link' and @routerlink='/register'] ");

    By lblNombre = By.xpath("(//a[@class='nav-link' and @routerlinkactive='active'])[3]");


    By btnLogin = By.xpath("/html/body/app-root/app-layout-header/nav/div/ul/li[2]/a");

    By btnIrCrearArticulo = By.xpath("//a[@routerlink='/editor']");

    By btnIrInicio = By.xpath("//a[@routerlink='/' and contains(.,'Home')]");

    By btnIrGlobal = By.xpath("////a[@class='nav-link active' and contains(.,' Global Feed ')]");

    By txtPrimerTitulo = By.xpath("(//h1)[1]");

    public By getBtnIrRegistrase() {
        return BtnIrRegistrase;
    }

    public By getLblNombre() {
        return lblNombre;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getBtnIrCrearArticulo() {
        return btnIrCrearArticulo;
    }

    public By getBtnIrInicio() {
        return btnIrInicio;
    }

    public By getBtnIrGlobal() {
        return btnIrGlobal;
    }

    public By getTxtPrimerTitulo() {
        return txtPrimerTitulo;
    }
}
