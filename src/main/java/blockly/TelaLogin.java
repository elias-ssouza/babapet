package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public", delete = "Public", put = "Public")
public class TelaLogin {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// TelaLogin
public static Var CadastroUsuario() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    if (Var.valueOf(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input2510")).equals(cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input2511")))).getObjectAsBoolean()) {
        cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input2510"))),Var.valueOf("name",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3568"))),Var.valueOf("login",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input3560"))),Var.valueOf("email",cronapi.screen.Operations.getValueOfField(Var.valueOf("vars.input1057"))));
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Usuário cadastrado com sucesso"));
    } else {
        cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("error"), Var.valueOf("Senha não confere"));
    }
    return Var.VAR_NULL;
   }
 }.call();
}

}

