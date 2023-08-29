public class Turista {

        //atributos
        private String nome;
        private String cpf;
        //contrutor padrão
        Turista(){}
        //construtor personalizado
        Turista(String _nome){
            this.nome = _nome;
        }
        //métodos dependencia pro sts: @Lombok @Data

    public String viajar() {
        return "Viajou!!!";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
