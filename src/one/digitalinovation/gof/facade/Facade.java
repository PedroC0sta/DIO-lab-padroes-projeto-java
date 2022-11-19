package one.digitalinovation.gof.facade;

import one.digitalinovation.gof.subsistema1.crm.CrmService;
import one.digitalinovation.gof.subsistema2.crm.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarClient(nome,cep, cidade, estado);
    }
}
