public abstract class Temporario  extends  Funcionario{
    // Como temporário serve apenas de base para horista e mensalista, mas não implementa o método abstrato da classe pai ela também deve ser uma classe abstrata
    protected int tempo_meses;

    public Temporario(String nome, String funcao, int tempo_meses) { //mesmo sendo abstrata ela possui construtor pois as classes filhas precisam que esse construtor exista
        super(nome, funcao); //chamando construtor da classe pai
        this.tempo_meses = tempo_meses; // informação específica da classe filha
    }
}
