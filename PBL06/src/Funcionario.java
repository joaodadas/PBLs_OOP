public abstract class Funcionario { //classe abstrata pois serve de base para as classes filhas
    protected String nome;
    protected String funcao;

    public Funcionario(String nome, String funcao) { //mesmo sendo abstrata ela possui construtor pois as classes filhas precisam que esse construtor exista
        this.nome = nome;
        this.funcao = funcao;
    }

    abstract public String gerar_contra_cheque(); //método abstrato pois deve ser implementado por todas as classes filhas
}
