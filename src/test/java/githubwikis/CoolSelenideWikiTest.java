package githubwikis;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CoolSelenideWikiTest {

    @Test
    void shouldSelenideWikiGitHub() {
        //открывается страница
        open("https://github.com");
        //заполняем строку поиска
        $("[name='q']").setValue("selenide").pressEnter();
        //Переходим на Wikis
        $("a.menu-item", 8).click();
        //Переход на  SoftAssertions
        $("#wiki_search_results").$(byText("SoftAssertions")).click();
        //Переход в раздел Wiki
        $("li.d-flex", 12).click();
        //Проверка, что в списке страниц (Pages) есть страница SoftAssertions и переход
        $(".Box-title").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("li.Box-row", 1).click();
        //Проверка, что внутри есть пример кода для JUnit5
        $$("code").get(2).shouldHave(text("com.codeborne.selenide.junit5.SoftAssertsExtension"));
        sleep(5000);

    }


}