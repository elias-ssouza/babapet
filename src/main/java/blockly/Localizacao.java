package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Localizacao {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Localização
public static Var obter_endere_C3_A7o() throws Exception {
 return new Callable<Var>() {

   private Var url = Var.VAR_NULL;
   private Var Results = Var.VAR_NULL;

   public Var call() throws Exception {
    url = Var.valueOf(Var.valueOf("https://maps.googleapis.com/maps/api/geocode/json?").toString() + Var.valueOf("&location_type=ROOFTOP&result_type=street_address&key=AIzaSyBp1O6tfe6zaiL6eTgQlfoaGBnxmAB2Aks").toString());
    Results = cronapi.json.Operations.toJson(cronapi.util.Operations.getHeadersFromExternalURL(Var.valueOf("GET"), Var.valueOf("application/json"), Var.VAR_NULL, Var.VAR_NULL, Var.VAR_NULL));
    Results = Var.VAR_NULL;
    Results = Var.VAR_NULL;
    return Var.VAR_NULL;
   }
 }.call();
}

}

