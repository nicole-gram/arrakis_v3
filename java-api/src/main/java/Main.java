//import java.time.LocalDate;
//import java.util.List;
//public class Main {
//    public static void main(String[] args) {
//        //utilizes the Book and Portfolio to simulate the login and display the active bonds
//
//        //Simulate login (idk if that actually will) and create the user's portfolio
//        Portfolio userPortfolio = new Portfolio();
//
//        //Adding the bonds to the user's portfolio
//        userPortfolio.addBond(new Book("Bond 1"));
//        userPortfolio.addBond(new Book("Bond 2"));
//        userPortfolio.addBond(new Book("Bond 3"));
//
//        //Create bonds with maturity dates
//        LocalDate today = LocalDate.now();
//        Book bond1 = new Book("Bond 1", today.minusDays(6));
//        Book bond2 = new Book("Bond 2", today.minusDays(5));
//        Book bond3 = new Book("Bond 3", today);
//        Book bond4 = new Book("Bond 4", today.minusDays(5));
//        Book bond5 = new Book("Bond 5", today.minusDays(6));
//
//        //Add these bonds ^^ to the portfolio
//        userPortfolio.addBond(bond1);
//        userPortfolio.addBond(bond2);
//        userPortfolio.addBond(bond3);
//        userPortfolio.addBond(bond4);
//        userPortfolio.addBond(bond5);
//
//        //Display bonds due for maturity within last and next 5 days
//        List<Book> dueBonds = userPortfolio.getBondsDueForMaturity();
//        System.out.println("Bonds Due for Maturity within Last and Next 5 Days");
//        for (Book bond: dueBonds) {
//            System.out.println(bond.getName());
//        }
//
//        //Display the active bonds for the logged-in user
//        userPortfolio.displayBonds();
//    }
//
//
//
//}
