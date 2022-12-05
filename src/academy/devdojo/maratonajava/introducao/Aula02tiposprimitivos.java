package academy.devdojo.maratonajava.introducao;

public class Aula02tiposprimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrrande =(long) 155.23;
        double salarioDouble =2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041' ;
        String nome = "Gorila";

        System.out.println("A idade é "+idade+" anos");
        System.out.println("falso");
        System.out.println("char "+caractere);
        System.out.println( numeroGrrande);
        System.out.println( "oi meu nome é " +nome);

    }
}
