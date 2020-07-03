package co.com.banistmo.retoautomatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import static net.serenitybdd.screenplay.Tasks.instrumented;


import static co.com.banistmo.retoautomatizacion.userinterfaces.BanistmoHomePage.TARIFARIO_BUTTON;

public class GoToTarifarioPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Hit.the(Keys.END).into(),
                Click.on(TARIFARIO_BUTTON)
        );
    }

    public static GoToTarifarioPage goToTarifarioPage(){
        return instrumented(GoToTarifarioPage.class);
    }
}
