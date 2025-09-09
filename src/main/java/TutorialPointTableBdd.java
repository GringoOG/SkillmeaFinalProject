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

    @And("vek na druhem radku bude {string}")
    public void vekNaDruhemRadkuBude(String vek) {
        String age = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[3]")).getText();
        assertEquals(vek, age);
    }

    @And("mail na druhem radku bude {string}")
    public void mailNaDruhemRadkuBude(String mail) {
        String email = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[4]")).getText();
        assertEquals(mail, email);


    }

    @And("vyplata na druhe radku bude {string}")
    public void vyplataNaDruheRadkuBude(String vyplata) {
        String salary = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[5]")).getText();
        assertEquals(vyplata, salary);

    }

    @And("odvetvi na druhem radku {string}")
    public void odvetviNaDruhemRadku(String odvetvi) {
        String department = driver.findElement(By.xpath("/html/body/main/div/div/div[2]/form/div[2]/table/tbody/tr[2]/td[6]")).getText();
        assertEquals(odvetvi, department);


    }
}




