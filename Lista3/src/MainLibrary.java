import exe2.Book;
import exe2.LibraryUser;

public class MainLibrary {
    public static void main(String[] args) {
        //Criação dos books
        Book objBook1 = new Book (1,"Crespúsculo","Stephenie Meyer", 2005);
        Book objBook2= new Book (2,"Harry Potter","J. K. Rowling", 1997);
        Book objBook3= new Book (3,"Dom Casmurro","Machado de Assis", 1899);

        System.out.println("\n" + "-".repeat(80) + "\n");

        // Criar um usuário
        LibraryUser user1 = new LibraryUser(1, "Jalisson Junior");


        System.out.println("\n" + "-".repeat(80) + "\n");

        // 3. Adicionar empréstimos
        user1.addLoanItem(objBook1, 10, 1);
        user1.addLoanItem(objBook2, 20, 2);
        user1.addLoanItem(objBook3, 33, 3);

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 4. Mostrar lista de empréstimos
        System.out.println("\nEmpréstimos atuais:");
        System.out.println(user1.toString());

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 5. Remover um empréstimo
        user1.removeLoanItem(1);
        System.out.println(user1.toString());

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 7. Total de dias emprestados
        System.out.println("\nTotal de dias emprestados: " + user1.totalDaysBorroewed());

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 8. Listar só os títulos dos livros
        System.out.println("\nLivros ainda emprestados:");
        user1.listBrooks();

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 9. Esvaziar lista
        user1.clearLoans();
        System.out.println(user1.toString());

        System.out.println("\n" + "-".repeat(80) + "\n");

        // 10. Verificar se está vazio
        if (user1.isEmpty()) {
            System.out.println("Nenhum empréstimo ativo.");
        } else System.out.println("Ainda existem empréstimos ativo!");

    }
}