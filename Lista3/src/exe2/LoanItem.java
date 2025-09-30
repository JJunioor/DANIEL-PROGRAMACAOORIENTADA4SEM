package exe2;

public class LoanItem {
    //ID do empréstimo do livo
    private int id;
    private int days;
    private Book book;
    //Variavel com nome maiusculo é a clsse
    // que criamos anteriormente.


    public LoanItem() {
    }
    // agregação o livro pode vir pronto, não é necessário criar-lo
    public LoanItem(Book book, int days, int id) {
        this.book = book;
        this.days = days;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "LoanItem{" +
                "id=" + id +
                ", days=" + days +
                ", book=" + book +
                "}\n";
    }
}
