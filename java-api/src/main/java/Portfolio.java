import java.util.ArrayList;
import java.util.List;
import java.time.temporal.ChronoUnit;
import java.time.LocalDate;
public class Portfolio {
    //holds the collection of bonds and displays them
    private List<Book> bonds;

    public Portfolio() {
        this.bonds = new ArrayList<>();
    }

    public void addBond(Book bond) {
        bonds.add(bond);
    }

    public List<Book> getBondsDueForMaturity() {
        List<Book> dueBonds = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for(Book bond : bonds) {
            //Calculate the difference in business days between today and the bond's maturity date
            long businessDaysDifference = calculateBusinessDays(today, bond.getMaturityDate());

            //Check if the bond is due for maturity within the last 5 days or the next 5 days
            if (businessDaysDifference >= -5 && businessDaysDifference <= 5) {
                dueBonds.add(bond);
            }
        }
        return dueBonds;
    }

    //calculates business days M-F
    private long calculateBusinessDays(LocalDate start, LocalDate end) {
        long days = ChronoUnit.DAYS.between(start, end);
        long weekends = days / 7 * 2;
        if(start.getDayOfWeek().getValue() > end.getDayOfWeek().getValue()) {
            weekends += 2;
        } else if (start.getDayOfWeek().getValue() <= end.getDayOfWeek().getValue() && start.getDayOfWeek.getValue() + days % 7 >= 6) {
            weekends += 1;
        }
        return days - weekends;
    }

    public void displayBonds() {
        System.out.println("Active Bonds in the Portfolio");
        for (Book bond : bonds) {
            System.out.println(bond.getName());
        }
    }
}
