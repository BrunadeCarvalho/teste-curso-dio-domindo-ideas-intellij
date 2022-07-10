package MetodosJava;

import javax.management.MalformedObjectNameException;

public class Main {
    public static void main(String[] args) {

        // CALCULADORA:
        System.out.println("Exercicio calculadora");
        ExercicioCalculadora.soma(3,6);
        ExercicioCalculadora.subtracao(9, 1.8);
        ExercicioCalculadora.multiplicacao(7,8 );
        ExercicioCalculadora.divisao(5, 2.5);

        //MENSAGEM
        System.out.println("Exercicio mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        // EMPRÉSTIMO
        System.out.println("Exercicio empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

    }
}
