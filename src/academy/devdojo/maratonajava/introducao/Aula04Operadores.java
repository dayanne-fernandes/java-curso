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

        // && (AND) // (or) !
        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorqueTrinta = idade > 30 && salario >= 4612;
        boolean isDentrodaLeiMenorqueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentrodaLeiMaiorqueTrinta "+isDentrodaLeiMaiorqueTrinta);
        System.out.println("isDentrodaLeiMenorqueTrinta "+isDentrodaLeiMenorqueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -=1000;
        bonus *=2;
        bonus /=2;
        bonus %=2;
        System.out.println(bonus);

        //
        int contador =0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;
        System.out.println(++contador2);



    }
}
