package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 /(double) numero02;
        System.out.println(resultado);

        // %
        int resto= 21 % 7;
                System.out.println(resto);

                // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezigualVinte = 10 == 20;
        boolean isDezigualdez = 10 == 10;
        boolean isDiferentedez = 10 != 10.0;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezmenorQueVinte "+isDezMenorQueVinte);
        System.out.println(" isDezigualVinte "+ isDezigualVinte);
        System.out.println(" isDezigualdez "+ isDezigualdez);
        System.out.println(" isDiferentedez "+ isDiferentedez);
    }
}
