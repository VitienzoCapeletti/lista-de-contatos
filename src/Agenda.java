import java.util.ArrayList;
import java.util.List;

public class Agenda {

    private List<Contato> contatos;

    public Agenda(){
        this.contatos = new ArrayList<>();
    }

    public void add(Contato c){
        contatos.add(c);
        this.mostrarTodos();
    }

    public void mostrarTodos(){
        System.out.println("-------------- Agenda Telefonica: -------------\n");

        for (int i=0 ; i<this.contatos.size() ; i++){

            System.out.println("Id: "+ (i+1));
            contatos.get(i).print();
            System.out.println();
        }
        System.out.println("-----------------------------------------------");

//        contatos.forEach(contato -> {
//            contato.print();
//            System.out.println("---------------------------------");
//        });

//        for(Contato contato : contatos){
//            contato.print();
//            System.out.println();
//        }
    }

    public void remove(int indice){
        contatos.remove(indice -1 );
        this.mostrarTodos();
    }

    public void removeTodos(){
        contatos.clear();
        System.out.println("Todos os contatos foram apagados!");
    }


}
