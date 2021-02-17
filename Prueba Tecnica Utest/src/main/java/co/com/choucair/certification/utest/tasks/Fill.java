package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.FillFormPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Fill implements Task {

    public static Fill onThePage() {
        return Tasks.instrumented(Fill.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Jonnathan").into(FillFormPage.INPUT_FIRST),
                Enter.theValue("Arevalo").into(FillFormPage.INPUT_LAST),
                Enter.theValue("jonnathan@gmail.com").into(FillFormPage.INPUT_EMAIL),
                Click.on(FillFormPage.SELECT_MONTH)
                //Click.on(FillFormPage.SELECT_DAY),
                //Click.on(FillFormPage.SELECT_YEAR),
                //Click.on(FillFormPage.BUTTON_NEXT)
                );



    }
}
