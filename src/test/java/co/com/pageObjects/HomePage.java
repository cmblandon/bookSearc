package co.com.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {
    @FindBy(name = "q")
    private WebElement googleSearch;

    @FindBy(name = "btnK")
    private WebElement googleSearchButton;

    @FindBy(id = "search")
    private WebElement resultSearch;

    @FindBy(xpath = "//*[@class='g']/div")
    private WebElement searchWord;

    @FindBy(xpath = "//*[@id=\"rso\"]/div/div/div[4]/div")
    private WebElement nameOfBook;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void googleSearch() {
        //Validate if input field is clickable
        waitForElementToBeClickable(By.name("q"));
        if(googleSearch.isEnabled()){
            this.googleSearch.click();
        }
    }

    public void inputWord(String word) {
        /* How input field is empty and the if is clickable so robot can send the word */
        assertThat("".isEmpty()).isTrue();
        this.googleSearch.sendKeys(word);
    }

    public void clickOnButton() {
        /* I wait for the button and it validates if is clickable */
        if(googleSearchButton.isEnabled()){
            this.googleSearchButton.click();
        }
    }

    public void resultSearch() {
        this.resultSearch.isDisplayed();
    }

    public void firstResultValidation(String nameBook) {
        List<WebElement> searchWord = driver.findElements(By.xpath("//*[@class='g']/div"));
        //System.out.println(counterWords.size());
        for (WebElement element : searchWord) {
            String name = element.getText();
            if (name.contains(this.getName(nameBook))) {
                System.out.println(element.getText());
                break;
            }
        }
    }

    public void goToFirstLink() {
        if(nameOfBook.isEnabled()){
            this.nameOfBook.click();
        }
    }

    public String getTextWord() {
        return resultSearch.getText();
    }

    public String getName(String nameBook) {
        return searchWord.getText();
    }
}
