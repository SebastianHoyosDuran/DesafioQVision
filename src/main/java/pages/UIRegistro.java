package pages;

import org.openqa.selenium.By;

public class UIRegistro {
     By txtUsername = By.xpath("//input[@placeholder='Username']");
     By txtEmail = By.xpath("//input[@placeholder='Email']");
     By txtPassword = By.xpath("//input[@placeholder='Password']");
     By btnSingUp = By.xpath("//button[@type='submit']");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtEmail() {
        return txtEmail;
    }

    public By getTxtPassword() {
        return txtPassword;
    }

    public By getBtnSingUp() {
        return btnSingUp;
    }
}
