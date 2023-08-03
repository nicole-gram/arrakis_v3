import java.time.LocalDate;
public class Book {
    //this represents each bond with its properties (1 and 2)
    private String name;
    private LocalDate maturityDate;
    public Book(String name, LocalDate maturityDate) {
        this.name = name;
        this.maturityDate = maturityDate;
    }
    public String getName() {
        return name;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }
}
