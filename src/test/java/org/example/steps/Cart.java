package org.example.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.Home_page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Cart {
    public static WebDriver driver;
    Home_page homeObj = new Home_page();
    SoftAssert soft = new SoftAssert();

    @Given("The user adds a product to the cart")
    public void theUserAddsAProductToTheCart() throws InterruptedException {
        Maain_test.driver.get("https://homzmart.com/en/c/furniture");

//        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        WebElement furniture = driver.findElement(By.cssSelector("a.router-link-active router-link-exact-active siteMenu__item"));
//        Actions action = new Actions(driver);
//        action.moveToElement(furniture).perform();
     Thread.sleep(5000);
        homeObj.outdoorset.click();
        Thread.sleep(2000);
        homeObj.openProduct.click();
        Thread.sleep(2000);
        homeObj.add_to_cart_button.click();
        Thread.sleep(2000);

}

    @When("The user opens the summary page")
    public void theUserOpensTheSummaryPage() {
        homeObj.open_the_cart_icon.click();
       homeObj.goToTheCart_button.click();

    }

    @Then("The product price is correct")
    public void theProductPriceIsCorrect() {
        String actualPrice=
                driver.findElement(By.cssSelector("div[class=\"summary__subtotal\"] b")).getText();
        String expectedPrice = "9500 EGP";
        System.out.println(actualPrice);
        soft.assertEquals(actualPrice,expectedPrice);
        soft.assertAll();
    }
}
