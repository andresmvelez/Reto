package co.com.banistmo.retoautomatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/personas/")
public class BanistmoHomePage extends PageObject {
    public static final Target TARIFARIO_BUTTON = Target.the("Tarifario")
            .locatedBy("//a[contains(text(),'Tarifario')]");

}
