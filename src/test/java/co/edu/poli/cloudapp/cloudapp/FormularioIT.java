package co.edu.poli.cloudapp.cloudapp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

import io.github.bonigarcia.wdm.WebDriverManager;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FormularioIT {
	
	@LocalServerPort
    private int port; 
    private WebDriver driver;

    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit(); 
        }
    }

    @Test
    public void verificarTituloDePagina() {
      
        driver.get("http://localhost:" + port + "/");

    
        String titulo = driver.getTitle();
        assertEquals("Inicio - Mi App Spring", titulo);
    }
    
    @Test
    public void testLogin() {
        driver.get("http://localhost:" + port + "/login");
        
     
        WebElement inputUser = driver.findElement(By.id("username"));
        inputUser.sendKeys("admin");
        
        WebElement botonSubmit = driver.findElement(By.tagName("button"));
        botonSubmit.click();
        
       
    }

}
