package StepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepsTest {
	private WebDriver driver;

	@Given("Abrir Chrome")
	public void abrir_Chrome() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--no-sandbox");
		driver = new ChromeDriver(options);
		driver.get("http://localhost:8080/BancoJSP/");
	}

	@When("el usuario ingresa Username {string} y Password {string} correctos.")
	public void el_usuario_ingresa_Username_y_Password_correctos(String string, String string2) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.cssSelector(".button")).click();
	}

	@Then("Entonces se le da la bienvenida al sitio {string}")
	public void entonces_se_le_da_la_bienvenida_al_sitio(String string) {
		// Write code here that turns the phrase above into concrete actions
		;

		assertEquals(string, driver.getTitle());
	}

	@When("el usuario ingresa Username {string} y Password {string} incorrectos")
	public void el_usuario_ingresa_username_y_password_incorrectos(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys(string);
		driver.findElement(By.id("password")).sendKeys(string2);
		driver.findElement(By.cssSelector(".button")).click();
	}

	@When("el usuario ingresa ingresa Username y Password vacios")
	public void el_usuario_ingresa_ingresa_Username_y_Password_vacios() {
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("");
		driver.findElement(By.id("password")).sendKeys("");
		driver.findElement(By.cssSelector(".button")).click();
	}

	@Then("Entonces mostrar error de {string}")
	public void entonces_mostrar_error_de(String string) {
		String error = driver.findElement(By.cssSelector(".notification")).getText();
		assertEquals("Mensaje de error", string, error);
	}
	
	@Then("Cierra el navegador")
	public void cierra_el_navegador() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}
}
