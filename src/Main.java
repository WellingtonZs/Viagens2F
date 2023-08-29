import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Classe Objeto = Construtor
        Turista mochileiro = new Turista("aaa");
        Turista mochileira = new Turista();
        //definir forma de cada turista
        mochileiro.setCpf(Validacao.cpf("123"));
        mochileira.setNome("Namor");
        mochileira.setCpf("456");
        //definir comportamento
        String retorno = mochileira.viajar();
        System.out.println(retorno);
        JOptionPane.showMessageDialog(null,retorno);
    }
}