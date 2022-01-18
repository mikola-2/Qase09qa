import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class LoginTest extends BaseTest{

    @Test
    public void login() {
        open("/login");
        $("#inputEmail").sendKeys("mikola-2@yandex.ru");
        $(By.xpath("//*[@id='inputPassword']")).setValue("Mikola202!").submit();
        $(By.id("createButton")).shouldBe(visible, Duration.ofSeconds(60));
    }

    @Test
    public void login2() {
        open("/login");
        $("#inputEmail").sendKeys("mikola-2@yandex.ru");
        $(By.xpath("//*[@id='inputPassword']")).setValue("Mikola202!").submit();
        $(By.id("createButton")).shouldBe(visible);
    }
}
