import java.util.Scanner;

public class Debtor extends Person{
    private int sumOfDebt;
    private double percentage;
    private int timeToPay;
    public Debtor(int bankId, int phoneNumber, String eMail, String date, int timeToPay, double percentage, int sumOfDebt) {
        super(bankId, phoneNumber, eMail, date);
        this.timeToPay = timeToPay;
        this.percentage = percentage;
        this.sumOfDebt = sumOfDebt;
    }

    public int getSumOfDebt() {
        return sumOfDebt;
    }

    public void setSumOfDebt(int sumOfDebt) {
        this.sumOfDebt = sumOfDebt;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public int getTimeToPay() {
        return timeToPay;
    }

    public void setTimeToPay(int timeToPay) {
        this.timeToPay = timeToPay;
    }

    public void payForBill(){
        Scanner scam = new Scanner(System.in);
        System.out.println("Did id paid for Debt recently?\n1 - Yes 2 - No");
        int choise1 = scam.nextInt();
        while (choise1 <= 0 || choise1 >= 3) {
            System.out.println("Error! Try again!");
            choise1 = scam.nextInt();
        }
        if (choise1 == 1) {
            System.out.println("How much did he return?");
            int sumdebt = scam.nextInt();
            this.sumOfDebt = sumOfDebt - sumdebt;
        }
    }

}
