import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

import static java.util.Objects.isNull;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Principiante("Kunigame",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador2 = new Principiante("Isagi",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador3 = new Principiante("Chigiri",0,0); //Instanciação de um objeto do tipo principiante
        Jogador jogador4 = new Profissional("Bachira",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador5 = new Profissional("Barou",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador6 = new Profissional("Reo",0,0); //Instanciação de um objeto do tipo profissional
        Jogador jogador7 = new Senior("Rin",0,0,0); //Instanciação de um objeto do tipo senior
        Jogador jogador8 = new Senior("Nagi",0,0,0); //Instanciação de um objeto do tipo senior
        Jogador jogador9 = new Senior("Shidou",0,0,0); //Instanciação de um objeto do tipo senior
        //Criação da coleção com os objetos criados anteirormente
        ArrayList<Jogador> jogadores = new ArrayList<>(Arrays.asList(jogador1,jogador2,jogador3,jogador4,jogador5,jogador6,jogador7,jogador8,jogador9));
        Scanner teclado = new Scanner(System.in); //Criando um scanner
        Menu(jogadores, teclado);
        teclado.close();
    }

    public static void Menu(ArrayList<Jogador> jogadores, Scanner teclado){
        ArrayList<Jogador> newjogadores;
        System.out.println("1-Adicionar Jogador Principiante");
        System.out.println("2-Adicionar Jogador Profissional");
        System.out.println("3-Adicionar Jogador Sênior");
        System.out.println("4-Definir ganhador");
        System.out.println("5-Definir Perdedor");
        System.out.println("6-Buscar um jogador");
        System.out.println("7-Listar todos os jogadores");
        System.out.println("8-Sair");
        int option = teclado.nextInt();
        teclado.nextLine(); //Preciso dessa linha pois o nextint não "consome" o /n e como sempre uso mesmo scanner é preciso fazer esse "consumo"
        switch (option) {
            case 1 -> {
                newjogadores = addprin(jogadores, teclado);
                Menu(newjogadores, teclado);
            }
            case 2 -> {
                newjogadores = addprof(jogadores, teclado);
                Menu(newjogadores, teclado);
            }
            case 3 -> {
                newjogadores = addsen(jogadores, teclado);
                Menu(newjogadores, teclado);
            }
            case 4 -> {
                defganhador(jogadores, teclado);
                Menu(jogadores, teclado);
            }
            case 5 -> {
                defperdedor(jogadores, teclado);
                Menu(jogadores, teclado);
            }
            case 6 -> {
                findplayer(jogadores, teclado);
                Menu(jogadores, teclado);
            }
            case 7 -> {
                findall(jogadores);
                Menu(jogadores, teclado);
            }
            case 8 -> System.out.println("Obrigado, Até próxima");
        }
    }

    public static ArrayList<Jogador> addprin(ArrayList<Jogador> jogadores, Scanner teclado){ //Função para criação de um objeto do tipo principiante
        System.out.println("Diga o nome deste Jogador");
        String nome = teclado.nextLine(); //Scanner que recebeu uma string e salva para criação do objeto posteriormente
        System.out.println("Diga a pontuação inicial do jogador");
        int score = teclado.nextInt();//Scanner que recebeu um inteiro e salva para criação do objeto posteriormente
        System.out.println("Diga o bônus incial do jogador");
        double bonus = teclado.nextDouble(); //Scanner que recebeu um double e salva para criação do objeto posteriormente
        Jogador principiante = new Principiante(nome,score,bonus);
        jogadores.add(principiante);
        return jogadores;
    }

    public static ArrayList<Jogador> addprof(ArrayList<Jogador> jogadores, Scanner teclado){ //Função com o mesmo principio da anterior porém para um objeto do tipo profissional
        System.out.println("Diga o nome deste Jogador");
        String nome = teclado.nextLine();
        System.out.println("Diga a pontuação inicial do jogador");
        int score = teclado.nextInt();
        System.out.println("Diga o bônus incial do jogador");
        double capital = teclado.nextDouble();
        Jogador profissional = new Profissional(nome,score,capital);
        jogadores.add(profissional);
        return jogadores;
    }

    public static ArrayList<Jogador> addsen(ArrayList<Jogador> jogadores, Scanner teclado){ //Função com o mesmo principio das anteriores porém para um objeto do tipo sênior
        System.out.println("Diga o nome deste Jogador");
        String nome = teclado.nextLine();
        System.out.println("Diga a pontuação inicial do jogador");
        int score = teclado.nextInt();
        System.out.println("Diga o bônus incial do jogador");
        double capital = teclado.nextDouble();
        System.out.println("Diga o valor recebido em prêmios incial do jogador");
        double premio = teclado.nextDouble();
        Jogador senior = new Senior(nome,score,capital,premio);
        jogadores.add(senior);
        return jogadores;
    }

    public static Jogador findplayer(ArrayList<Jogador> jogadores, Scanner teclado){
        System.out.println("Que é o jogador?"); //Pergunte o nome pelo qual devo buscar
        String find = teclado.nextLine();
        Jogador j; // Variavel para utilização nos métodos de defganhador e defperdedor
        for (Jogador jogador : jogadores) { // for que percorre a coleção
            if (Objects.equals((jogador.getName()).toLowerCase(), find.toLowerCase())) { // Comparando cada objeto com o nome recebido
                j = jogador; //Caso encontrado o nome buscado salvo no objeto criado anteriormente
                j.imprimir(); //Chamando o método imprimir
                return j;
            }
        }
        System.out.println("Jogador não encontrado");
        System.out.println("Tentar novamente ?");
        String again = teclado.nextLine();
        if (again.equalsIgnoreCase("sim")){ // Comparação da resposta do usuário, ignorando case sensitibity
            return findplayer(jogadores,teclado); // Chamando a função novamente para evitar erros
        } else{
            return null;
        }
    }

    public static void findall(ArrayList<Jogador> jogadores){ //Função que percorre toda a coleção e chama o método imprimir do
        for (Jogador jogador : jogadores) { // for que percorre a coleção
            jogador.imprimir(); //Chamando o método imprimir do objeto
        }
    }

    public static void defganhador(ArrayList<Jogador> jogadores, Scanner teclado){ // Funcão void, pois assim que o objeto é alterado ele também será "alterado" dentro da coleção
        Jogador j = findplayer(jogadores,teclado); // Chamo a função findplayer para fazer a busca do jogador
        if (!isNull(j)) {
            System.out.println("Quantos pontos esse jogador ganhou ?"); // Pergunto quantos pontos foram recebidos
            int p = teclado.nextInt();
            if (j instanceof Principiante pr1){ //Testando qual o tipo de jogador para poder chamar o método da classe já que a classe jogador não possui esse método não se pode charma por ele diretamente
                pr1.ganhar(p);
            }
            if ((j instanceof Profissional pf1)) {
                pf1.ganhar(p);
            }
            if ((j instanceof Senior s1)) {
                s1.ganhar(p);
            }
            System.out.println("Operação realizada com sucesso");
        }else {
            System.out.println("Abortando operação...");
        }
    }

    public static void defperdedor(ArrayList<Jogador> jogadores,Scanner teclado){ // Função semelhante a anterior porém com o método perder
        Jogador j = findplayer(jogadores,teclado);
        if (!isNull(j)) {
            System.out.println("Quantos pontos esse jogador perdeu ?");
            int p = teclado.nextInt();
            if (j instanceof Principiante pr1){
                pr1.perder(p);
            }
            if ((j instanceof Profissional pf1)) {
                pf1.perder(p);
            }
            if ((j instanceof Senior s1)) {
                s1.perder(p);
            }
            System.out.println("Operação realizada com sucesso");
        } else{
            System.out.println("Abortando operação...");
        }
    }
}