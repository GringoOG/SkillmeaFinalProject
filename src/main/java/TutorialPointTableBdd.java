import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TutorialPointTableBdd {

    private WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void cleanUp() {
        driver.close(); //u firefoxu problem, kdyz jsou oba prikazy. Nechat jen .quit
        driver.quit();
    }




    @Given("uzivatel se nachazi na strance {string}")
    public void uzivatelSeNachaziNaStrance(String url) {
        driver.get(url);
    }

    @Then("jmeno na druhem radku tabulky bude {string}")
    public void jmenoNaDruhemRadkuTavbulkyBude(String jmeno) {
        String name = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[1]")).getText();
        assertEquals(jmeno, name);

    }

    @And("prijmeni na druhem radku tabulky bude {string}")
    public void prijmeniNaDruhemRadkuTabulkyBude(String prijmeni) {
        String lastName = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[2]")).getText();
        assertEquals(prijmeni, lastName);

    }
}
