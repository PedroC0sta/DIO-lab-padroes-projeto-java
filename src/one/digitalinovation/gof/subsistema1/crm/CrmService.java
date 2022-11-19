package one.digitalinovation.gof.subsistema1.crm;

public class CrmService {
    public static void gravarClient(String nome,String cep, String cidade, String estado){
        System.out.println("Cliente salvo o sistema CRM");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
