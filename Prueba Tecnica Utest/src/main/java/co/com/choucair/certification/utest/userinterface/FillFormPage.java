package co.com.choucair.certification.utest.userinterface;


import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

import org.openqa.selenium.By;


public class FillFormPage extends PageObject {
    public static final Target INPUT_FIRST = Target.the("Ingresa el primer nombre").located(By.id("firstName"));
    public static final Target INPUT_LAST = Target.the("Ingresa el segundo nombre").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Ingresa el correo electronico").located(By.id("email"));
    public static final Target SELECT_MONTH = Target.the("Selecciona el Mes").located(By.cssSelector("#birthMonth"));
    public static final Target SELECT_DAY = Target.the("Selecciona el Dia").located(By.cssSelector("#birthDay"));
    public static final Target SELECT_YEAR = Target.the("Selecciona el Año").located(By.xpath("//*[@id=\"birthYear\"]"));
    public static final Target SELECT_LANGUAGES = Target.the("Selecciona el Año").located(By.xpath("//*[@id=\"languages\"]/div[1]"));
    public static final Target BUTTON_NEXT = Target.the("Selecciona siguiente pagina").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
