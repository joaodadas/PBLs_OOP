public class Senior extends Profissional{
    private double premio;

    public Senior(String name, int score, double capital, double premio) { //Metodo construtor
        super(name, score, capital); //Para instanciar um Senior, primeiro é preciso instanciar um Jogador
        this.premio = premio;
    }

    public void imprimir() { // Metodo para imprimir todos os dados
        String name = this.getName(); // como nome é um atributo privado preciso utilizar o getter para poder pegar esse valor
        double capital = this.getCapital(); // como nome é um atributo privado preciso utilizar o getter para poder pegar esse valor
        System.out.println("Jogador:" + name + ", Pontuação=" + score + ", Capital: " + capital + ", Prêmio: " + premio);
    }

    public void ganhar(int p) { // Sobrescreve o método ganhar da classe Pai Profissional
        super.ganhar(p); //Chama o método com mesmo nome da classe pai
        premio *= 2; //Dobra o valor do prêmio
    }

    public void perder(int p) { // Sobrescreve o método perder da classe Pai Profissional
        super.perder(p); //Chama o método com mesmo nome da classe pai
        premio /= 2; //Reduz o valor do prêmio pela metade
    }
}
