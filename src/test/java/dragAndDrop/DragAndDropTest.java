package dragAndDrop;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class DragAndDropTest {
    @Test
    void movingDragAndDrop() {
        open("https://the-internet.herokuapp.com/drag_and_drop");

        $("#column-a").dragAndDropTo("#column-b");

        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

    }
}