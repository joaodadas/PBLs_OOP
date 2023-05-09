public class Jogador { //Jogador é uma classe pois foram adcionados a ela métodos abstratos
    private String name;
    protected int score;

    public Jogador(String name, int score) { //Construtor para criar objetos do tipo Jogador
        this.name = name;
        this.score = score;
    }

    public String getName() { //Função getter de nome, para que possa ser a busca por nome posterioremente
        return name;
    }

    public void imprimir() { // Metodo para imprimir todos os dados
        System.out.println("Jogador:" + name + '\'' + ", Pontuação=" + score + ", ");
    }
}
