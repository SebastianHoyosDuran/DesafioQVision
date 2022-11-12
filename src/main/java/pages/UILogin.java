package pages;

import org.openqa.selenium.By;

public class UILogin {

    By txtEmail = By.xpath("//input[@placeholder='Email']");

    By txtContrasenia = By.xpath("//input[@placeholder='Password']");

    By btnIngresar = By.xpath("//button[@type='submit']");


    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtContrasenia() {
        return txtContrasenia;
    }

    public By getBtnIngresar() {
        return btnIngresar;
    }
}
