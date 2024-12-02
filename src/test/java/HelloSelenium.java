package dev.selenium.hello;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class HelloSelenium {

    public static void main(String[] args) {
        // Configura el path del controlador de Chrome
        System.setProperty("webdriver.chrome.driver", "ruta/a/tu/chromedriver"); // Asegúrate de cambiar el path

        // Inicializa el WebDriver para Chrome
        WebDriver driver = new ChromeDriver();

        // Accede a la página
        driver.get("https://selenium.dev");

        // Imprime el título de la página
        System.out.println("Título de la página: " + driver.getTitle());

        // Ejemplo de búsqueda en Bing (similar a tu test en C#)
        driver.get("http://www.bing.com/");
        driver.findElement(By.id("sb_form_q")).sendKeys("Azure Pipelines");
        driver.findElement(By.id("sb_form_go")).click();
        
        // Verifica que la página contiene "Azure Pipelines" en su título
        if (driver.getTitle().contains("Azure Pipelines")) {
            System.out.println("Prueba exitosa: El título contiene 'Azure Pipelines'");
        } else {
            System.out.println("Prueba fallida: El título no contiene 'Azure Pipelines'");
        }

        // Cierra el navegador
        driver.quit();
    }
}
