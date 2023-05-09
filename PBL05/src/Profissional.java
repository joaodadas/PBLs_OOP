public class Profissional extends Jogador{
    private double capital;

    public Profissional(String name, int score, double capital) { //Metodo construtor
        super(name, score); //Para instanciar um Professional, primeiro é preciso instanciar um jogador
        this.capital = capital;
    }

    public double getCapital() { //Função getter para que a classe filho possa acessar esse atributo caso necessário
        return capital;
    }

    public void imprimir() { // Metodo para imprimir todos os dados
        String name = this.getName(); // como nome é um atributo privado preciso utilizar o getter para poder pegar esse valor
        System.out.println("Jogador:" + name + ", Pontuação=" + score + ", Capital: " + capital);
    }

    public void ganhar(int p){
        this.score += p; //Acrescenta o valor de p no score
        this.capital += p*4; //Acrescente p*4 no capital
    }

    public void perder(int p){
        this.score -= p; //Subtrai o valor de p no score
        this.capital -= p*4; //Subtrai p*4 no capital
    }
}
