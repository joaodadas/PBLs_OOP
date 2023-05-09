public class Principiante extends Jogador{

    private double bonus;

    public Principiante(String name, int score, double bonus) {
        super(name, score);
        this.bonus = bonus;
    }

    public void imprimir() { // Metodo To String, para imprimir todos
        String name = this.getName(); // como nome é um atributo privado preciso utilizar o getter para poder pegar esse valor
        System.out.println("Jogador:" + name + ", Pontuação=" + score + ", Bônus: " + bonus);
    }

    public void ganhar(int p){
        this.score += p;
        this.bonus += (p*0.1); // bônus é incrementado em 10% do valor de p
    }

    public void perder(int p){
        this.score -= p;
        this.bonus -= p*0.1; // bônus é diminuido em 10% do valor de p
    }
}
