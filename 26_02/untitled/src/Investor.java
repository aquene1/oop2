import java.util.Scanner;

public class Investor extends Person {
    private int investition;

    public int getInvestition() {
        return investition;
    }

    public void setInvestition(int investition) {
        this.investition = investition;
    }

    public Investor(int bankId, int phoneNumber, String eMail, String date, int investition) {
        super(bankId, phoneNumber, eMail, date);
        this.investition = investition;
    }

    public void invest() {
        Scanner scam = new Scanner(System.in);
        System.out.println("Did id invested recently?\n1 - Yes 2 - No");
        int choise2 = scam.nextInt();
        while (choise2 <= 0 || choise2 >= 3) {
            System.out.println("Error! Try again!");
            choise2 = scam.nextInt();
        }
        if (choise2 == 1) {
            System.out.println("How much did he invested?");
            int g = scam.nextInt();
            this.investition += g;
        }
    }
}
