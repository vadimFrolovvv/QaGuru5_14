package dom;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DOMTest {
    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.browserPosition = "-10x0";
    }

    @BeforeEach
    void beforeEach() {
        open("https://demoqa.com/");
    }

    @Test
    void depositAmount() {
        $$("div.card.mt-4.top-card div").first().parent().shouldHave(Condition.text("Elements"));
        $$("div.card.mt-4.top-card div").first().closest("div").shouldHave(Condition.text("Elements"));
        $$("div.card.mt-4.top-card div").first().click();
        $$("ul.menu-list li").first().sibling(0).click();
        $$("ul.menu-list li:not(.disabled)").findBy(Condition.text("Check Box")).preceding(0).click();
    }
}
