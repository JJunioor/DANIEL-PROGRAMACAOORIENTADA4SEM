package exe2;

import java.util.ArrayList;
import java.util.List;

public class LibraryUser {
    private int id;
    private String name;
    private List<LoanItem> itens;

    public LibraryUser() {
        this.itens = new ArrayList<LoanItem>();
    }

    public LibraryUser(int id, String name, List<LoanItem> itens) {
        this.id = id;
        this.name = name;
        this.itens = new ArrayList<LoanItem>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<LoanItem> getItens() {
        return itens;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addLoanItem(int id, int days, Book book){
        this.itens.add(new LoanItem(id, days, book));
        System.out.println("Livro emprestado com sucesso!")
    }

    public void removeLoanItem(int id){
        //percorer o vetor
        boolean removeu = false;
        for (LoanItem  item: itens ){
                //for específico percorrendo item por item
            if(item.getId() == id){
                this.itens.remove(item);
                removeu = true;
                System.out.println("Empréstimo de livrto removido com sucesso!");
                break;
            }
        }
        if (!removeu){
            System.out.println("Item não existe!");
        }
    }

    public void clearLoans(){
        this.itens.clear();
        System.out.println("Todos itens removidos!");
    }

    public boolean isEmpty(){
        return this.itens.isEmpty();
    }

    public int totalDaysBorroewed(){
        int soma = 0;
        for (LoanItem item:this.itens){
            soma += item.getDays();
        }
        return soma;
    }
    @Override
    public String toString() {
        return "LibraryUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itens=" + itens +
                '}';
    }
}
