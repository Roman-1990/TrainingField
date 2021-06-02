package github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class FrainingTest {


    @Test
    void firstContributorShouldBeSolnsev (){
        //отключает браузер с тестом, чтоб двигать мышкой
        Configuration.headless=true;
    //открыть страничку selenide
    open("https:github.com/selenide/selenide");

    //подвести мышку к первому элементу в области Contributors
    $(".BorderGrid").$(byText("Contributors"))
            .closest("div").$("li").hover();

    //проверка: в появившемся окне (overlay), которое исчезает при отводе мышки (F8 - стоп страницы)
       $$(".Popover-message").findBy(visible)
                .shouldHave(text("Andrei Solntsev"));
        sleep(5000);
}

}
