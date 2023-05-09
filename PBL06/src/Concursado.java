public class Concursado extends Funcionario {
    protected int ano_ingresso;
    protected double salario_mensal;

    public Concursado(String nome, String funcao, int ano_ingresso, double salario_mensal) {
        super(nome, funcao); //chamando construtor da classe pai
        this.ano_ingresso = ano_ingresso; // informação específica da classe filha
        this.salario_mensal = salario_mensal; // informação específica da classe filha
    }

    @Override //sobrescrita do método abstrato (método possui mesma assinatura, mas implementação diferente)
    public String gerar_contra_cheque() {
        return ("Nome: " + nome + "\nFunção: " + funcao + "\nAno de ingresso: " + ano_ingresso + "\nSalário mensal: " + salario_mensal +
                "\nValor a receber: " + salario_mensal); //retornando a string com todas as informações do concursado
    }
}
