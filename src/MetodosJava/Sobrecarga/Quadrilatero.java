package MetodosJava.Sobrecarga;

public class Quadrilatero {

    // sobrecarga de area:

    public static void area (double lado){

        System.out.println("Área do quadrado: " + lado * lado);
    }

    public static void area (double lado1, double lado2){

        System.out.println("Área do retêngulo: " + lado1 * lado2);
    }

    public static void area (double baseMaior, double baseMenor, double altura){

        System.out.println("Área do trapézio: " + ((baseMaior+baseMenor)*altura)/2);

    }


}
