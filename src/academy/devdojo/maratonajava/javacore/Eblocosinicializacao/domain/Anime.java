package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    //1 - Alocada espaco em memória pra objeto
    //2 -cada atributo de classe é criado e inicializado com valores default ou o que for passado
    //3 - bloco de inicializacao é executado
    //4 - construtor é executado
    {
        System.out.println("Dentro do bloco de inicializaçao");
        episodios = new int [100];
        for (int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;

        }
    }
    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime(){


        for(int episodio: this.episodios){
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }
}
