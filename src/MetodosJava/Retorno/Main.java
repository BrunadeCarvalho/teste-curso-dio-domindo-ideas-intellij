package MetodosJava.Retorno;

public class Main {
    public static void main(String[] args){

        // RETORNOS:

        System.out.println("Exercicio retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Área do retangulo " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Área do trapézio  " + areaTrapezio);

    }

}
