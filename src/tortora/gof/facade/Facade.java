package tortora.gof.facade;

import api.crm.CRMService;
import sistema.cep.CEPAPI;

public class Facade {

    public void migrarCliente(String nome, String cep) {
        String cidade = CEPAPI.getInstancia().recuperarCidade(cep);
        String estado = CEPAPI.getInstancia().recuperarEstado(cep);

        CRMService.gravarCliente(nome, cep, cidade, estado);
    }

}
