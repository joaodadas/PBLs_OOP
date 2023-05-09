import java.util.ArrayList;

public class Empresa {
    private String nome;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void gerar_folha(){
        for (Funcionario f : funcionarios){
            System.out.println("==================================================");
            System.out.println(f.gerar_contra_cheque());;
        }
    }

    public void incluir(Funcionario f){
        this.funcionarios.add(f); // adiciona um objeto do tipo funcionário a arraylist do objeto empresa
    }
}
