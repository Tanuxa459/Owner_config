package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest extends BaseTest{

    @Test
    public void Githubtest() {
        open("/");
        $("#hero-section-brand-heading").shouldHave(text("Build and ship software on a single, collaborative platform"));
    }
}