public class Horista extends Temporario{
    private int horas_trabalhadas;
    private double valor_da_hora;

    public Horista(String nome, String funcao, int tempo_meses, int horas_trabalhadas, double valor_da_hora) {
        super(nome, funcao, tempo_meses); //chamando construtor da classe pai
        this.horas_trabalhadas = horas_trabalhadas; // informação específica da classe filha
        this.valor_da_hora = valor_da_hora; // informação específica da classe filha
    }

    @Override
    public String gerar_contra_cheque() { //sobrescrita do método abstrato (método possui mesma assinatura, mas implementação diferente)
        double salario = horas_trabalhadas * valor_da_hora; // cálculo do valor a ser pago
        return ("Nome: " + nome + "\nFunção: " + funcao + "\nTempo em Meses: " + tempo_meses + "\nHoras Trabalhadas: " + horas_trabalhadas +
                "\nValor da Hora: " + valor_da_hora + "\nValor a receber: " + salario); //retornando a string com todas as informações do horista
    }
}
