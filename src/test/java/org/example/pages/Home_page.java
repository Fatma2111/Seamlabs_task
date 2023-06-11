package org.example.pages;

import org.example.steps.Maain_test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
    public Home_page(){
        PageFactory.initElements(Maain_test.driver,this);

    }
//    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/header/div[2]/div/div[1]/div/a")
//    public WebElement furnitureHover;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/section/div[3]/div/section/div[1]/ol/li[8]/div/a/div[1]/img")
    public WebElement outdoorset;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/a/div/div[2]/div[1]/div[1]/a/p")
    public WebElement openProduct;
    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div[2]/div/section/div[2]/div[2]/div[1]/div[2]/div/div/button/div")
    public WebElement add_to_cart_button;
    @FindBy(id = "HEADER_CART_BRIEF_ITEMS_NUMBER")
    public WebElement open_the_cart_icon;
    @FindBy(id = "HEADER_CART_BRIEF_GO_TO_CART_BUTTON")
    public WebElement goToTheCart_button;

//    @FindBy(css = "div.AR_discount")
//    public WebElement actualPrice;

//    By openProduct = By.cssSelector("p.productCard__nameText");
//    By add_to_cart_button = By.cssSelector("button.button-with-icon second-bg sm");
//    By open_the_cart_icon = By.xpath("/html/body/div[1]/div[1]/div[1]/header/div[1]/div[2]/div[4]/div[1]/svg");
//    By goToTheCart_button = By.id("HEADER_CART_BRIEF_GO_TO_CART_BUTTON");
//    By actualPrice = By.cssSelector("div.AR_discount");

//    public void select_the_product() {
//        Actions actions = new Actions(driver);
//        actions.moveToElement((WebElement) furnitureHover).perform();
//
//        // actions.moveToElement(furnitureHover).perform();
//        //driver.findElement(furnitureHover).click();//hover
//    }
//    public void go_to_the_cart() {
//        driver.findElement(outdoorset).click();
//        driver.findElement(openProduct).click();
//        driver.findElement(add_to_cart_button).click();
//    }
//    public void assert_the_price(){
//        driver.findElement(open_the_cart_icon).click();
//        driver.findElement(goToTheCart_button).click();
//    }
}
