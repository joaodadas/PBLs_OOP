public class Mensalista extends Temporario {
    private double salario_mensal;

    public Mensalista(String nome, String funcao, int tempo_meses, double salario_mensal) {
        super(nome, funcao, tempo_meses); //chamando construtor da classe pai
        this.salario_mensal = salario_mensal; // informação específica da classe filha
    }

    @Override //sobrescrita do método abstrato (método possui mesma assinatura, mas implementação diferente)
    public String gerar_contra_cheque() {
        return ("Nome: " + nome + "\nFunção: " + funcao + "\nTempo em Meses: " + tempo_meses + "\nSalário Mensal: " + salario_mensal +
                "\nValor a receber: " + salario_mensal); //retornando a string com todas as informações do mensalista
    }
}
