package pages;

import org.openqa.selenium.By;

public class UICrearArticulo{
        By btnCrearArticulo = By.xpath("//button[contains(text(),' Publish Article ')]");

        By txtTituloArticulo = By.xpath("//input[@placeholder='Article Title']");

        By txtDescripcionArticulo = By.xpath("//input[@formcontrolname='description']");

        By txtAreaDescripcionArticulo = By.xpath("//textarea[@formcontrolname='body']");

        public By getBtnCrearArticulo() {
                return btnCrearArticulo;
        }

        public By getTxtTituloArticulo() {
                return txtTituloArticulo;
        }

        public By getTxtDescripcionArticulo() {
                return txtDescripcionArticulo;
        }

        public By getTxtAreaDescripcionArticulo() {
                return txtAreaDescripcionArticulo;
        }
}
