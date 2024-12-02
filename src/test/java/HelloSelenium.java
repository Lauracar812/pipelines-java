package dev.selenium.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {
    public static void main(String[] args) {
        // Configura el path del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "ruta/a/tu/chromedriver");

        // Inicializa el WebDriver para Chrome
        WebDriver driver = new ChromeDriver();

        // Accede a la página
        driver.get("https://selenium.dev");

        // Imprime el título de la página
        System.out.println("Título de la página: " + driver.getTitle());

        // Cierra el navegador
        driver.quit();
    }
}
