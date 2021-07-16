import java.util.Scanner;

public class Questao20 {

    public static void main(String[] args) {

        Agenda a = new Agenda();

        String opcao;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Escolha sua ação: ");
            System.out.println("1- Adicionar contato");
            System.out.println("2- Remover contato.");
            System.out.println("3- Mostrar todos.");
            System.out.println("4- Apagar todos.");
            System.out.println("0- Sair\n");


            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    Contato c = new Contato();
                    System.out.println("Digite o nome: ");
                    c.setNome(sc.nextLine());
                    System.out.println("Digite o número: ");
                    c.setNumero(sc.nextLine());
                    a.add(c);
                    break;
                case "2":
                    System.out.println("Qual contato você deseja remover: ");
                    a.mostrarTodos();
                    a.remove(sc.nextInt());
                    sc.nextLine();
                    break;
                case "3":
                    a.mostrarTodos();
                    break;
                case "4":
                    System.out.println("Você deseja remover todos os contatos? (Sim) (Não)");
                    String confirmacao = sc.nextLine();
                    if ("Sim".equalsIgnoreCase(confirmacao)) {
                        a.removeTodos();
                    }
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (!"0".equals(opcao));
    }
}
