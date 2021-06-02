package gitHubWiki;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CoolSelenideWikiTest {

    @Test
    void selenideWikiGitHubUsingJUnit5() {
        //открывается страница
        open("https://github.com/selenide/selenide");
        //Переход в раздел Wiki
        $("[data-content = Wiki]").click();
        //Проверка, что в списке страниц (Pages) есть страница SoftAssertions и переход
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $(byText("SoftAssertions")).click();
        //Проверка, что внутри есть пример кода для JUnit5
        $("#wiki-body").shouldHave(text("Using JUnit5 extend test class"));

    }

}
