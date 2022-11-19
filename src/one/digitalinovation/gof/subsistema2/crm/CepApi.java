    package one.digitalinovation.gof.subsistema2.crm;

    public class CepApi {
        private static CepApi instancia = new CepApi();
        private CepApi(){
            super();
        }
        public static CepApi getInstance(){
            return instancia;
        }
        public String recuperarCidade(String cep){
            return "São José do Rio Preto";
        }

        public String recuperarEstado(String cep){
            return "São Paulo";
        }
    }
