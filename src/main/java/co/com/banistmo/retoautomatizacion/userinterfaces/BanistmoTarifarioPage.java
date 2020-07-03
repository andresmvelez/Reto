package co.com.banistmo.retoautomatizacion.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.banistmo.com/wps/portal/banistmo/acerca-de/tarifario/")
public class BanistmoTarifarioPage extends PageObject {
    public static final Target NAME_OF_DOCUMENT = Target.the("Document").locatedBy("//span[contains(text(),'Tarifas de Cuentas de Depósitos')]");
    public static final Target PDF_DOWNLOAD = Target.the("PDF icon").locatedBy("//tr[2]//td[2]//span[1]//a[1]//img[1]");
}
