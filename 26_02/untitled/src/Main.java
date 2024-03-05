import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person Nikita = new Person(1,27400992,"tobromgam@gmail.com","05.12.2027");
        Debtor Georgij = new Debtor(2,22332233,"sosamusic@mail.ru","04.03.2028", 5, 0.03, 2200);
        Investor Mihail = new Investor(3, 27334000,"nagibatel228@gmail.com","04.03.2025",2000);
        ArrayList<Person> persons = new ArrayList<>();
        persons.add(Nikita);
        persons.add(Georgij);
        persons.add(Mihail);
        ArrayList<Debtor> debtors = new ArrayList<>();
        debtors.add(Georgij);
        ArrayList<Investor> investors = new ArrayList<>();
        investors.add(Mihail);



        System.out.println("What is your user id?");
        Scanner scam = new Scanner(System.in);
        int idq = scam.nextInt();
        for (Person i:persons){
            int n = i.getBankId();
            if (n == idq) {
                System.out.println("Do you want to check your cart expire date?\n 1 - Yes 2 - No");
                int choise = scam.nextInt();
                while (choise <= 0 || choise >= 3) {
                    System.out.println("Error! Try again!");
                    choise = scam.nextInt();
                }
                if (choise == 1){
                    i.ChangeCart();
                }
            }
        }
        String str = "";
//        for (Person i:persons){
//            str = str + i.printInfo();
//        }
//        System.out.println(str);
//        str = "";
        for (Person i: persons) {
            for (Debtor p: debtors){
                if (i.getBankId() == p.getBankId()){
                    System.out.println("\nThis id " + i.getBankId() +" is debtor his sum of debt : " + p.getSumOfDebt() + "\nPercantage in year for Debt is : " + p.getPercentage() + "\nYears to pay Debt : " + p.getTimeToPay());
                    p.payForBill();
                }
            }
            for (Investor j: investors){
                if (i.getBankId() == j.getBankId()){
                    System.out.println("\nThis id " + i.getBankId() +" is Investor his sum of investition : " + j.getInvestition());
                    j.invest();
                }
            }
            i.writeFile();
        }

    }
}