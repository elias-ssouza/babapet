package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;


@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Avaliacao {

public static final int TIMEOUT = 300;

/**
 *
 * @param nota
 * @param comentario
 * @param id_abastecimento
 * @return Var
 */
// Avaliação
public static Var insere_avaliacao(Var nota, Var comentario, Var id_abastecimento) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.insert(Var.valueOf("app.entity.Avaliacao"),Var.valueOf("texto",comentario),Var.valueOf("atendimento",cronapi.database.Operations.newEntity(Var.valueOf("app.entity.Atendimento"),Var.valueOf("id",id_abastecimento))),Var.valueOf("nota",nota));
    cronapi.database.Operations.execute(Var.valueOf("app.entity.Atendimento"), Var.valueOf("update Atendimento set status = :status"),Var.valueOf("status",Var.VAR_NULL));
    return Var.VAR_NULL;
   }
 }.call();
}

}

