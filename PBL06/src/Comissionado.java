public class Comissionado extends Concursado{
    private double comissao;
    private String cargo;

    public Comissionado(String nome, String funcao, int ano_ingresso, double salario_mensal, double comissao, String cargo) {
        super(nome, funcao, ano_ingresso, salario_mensal); //chamando construtor da classe pai
        this.comissao = comissao; // informação específica da classe filha
        this.cargo = cargo; // informação específica da classe filha
    }

    @Override //sobrescrita do método abstrato (método possui mesma assinatura, mas implementação diferente)
    public String gerar_contra_cheque() {
        double pagamento = salario_mensal + comissao; // cálculo do valor a ser pago
        return ("Nome: " + nome + "\nFunção: " + funcao + "\nAno de ingresso: " + ano_ingresso + "\nCargo: " + cargo  +"\nSalário mensal: " + salario_mensal +
                "\nComissão: " + comissao + "\nValor a receber: " + pagamento); //retornando a string com todas as informações do comissionado
    }
}
