package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class GithubTest extends BaseTest{
    @Test
    public void testGithub() {
        $("[data-test-selector=nav-search-input]").setValue("Selenide").pressEnter();
        $$("ul.repo-list li").first().$("a").click();
        $("#wiki-tab").click();
        $(".f6.Link--muted").click();
        $$("ul.list-style-none.m-0.p-0 li").findBy(text("SoftAssertions")).click();
        $$(".markdown-body h4").findBy(exactTextCaseSensitive("Using JUnit5 extend test class"));
        sleep(5000);
    }
}
