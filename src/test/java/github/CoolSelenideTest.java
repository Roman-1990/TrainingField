package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class CoolSelenideTest {
@Test
    void shouldCoolSelenideOnGitHub(){
    //открыть страничку гитхаба
    open("https:github.com");

    //ввести в поле поиска selenide
    //нажать enter
    $("[name='q']").setValue("selenide").pressEnter();

    //выбрать первый найденный проект из списка (кликнуть)
    var firstRepositoryFound= $$("ul.repo-list li").first().$("a");
    firstRepositoryFound.click();
    //проверка: в заголовке встречаются selenide/selenide
    $("h1").shouldHave(text("selenide / selenide"));

    //ожидание в мс
    sleep(5000);

    //ARRANGE
    //ACT (действия, клики)
    //ASSERT (ожидание)(не всегда нужно его добавлять в промежутках)(всегда быть завершающим)
    //ACT
    //ASSERT
    //ACT
    //ASSERT
    }
}
