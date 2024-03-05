import java.io.FileWriter;
import java.io.IOException;

import static java.lang.Integer.parseInt;

public class Person {
    private int bankId;
    private int phoneNumber;
    private String eMail;
    private String date;

    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Person(int bankId, int phoneNumber, String eMail, String date) {
        this.bankId = bankId;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.date = date;
    }
    public void ChangeCart(){
        String year = date.substring(6);
        int n = Integer.parseInt(year);
        System.out.println(n - 2024 + " gadi līdz kartu maiņa");
    }
    public String printInfo(){
        return("\nId : " + bankId + "\nPhone number : " + phoneNumber + "\nEmail : " + eMail + "\nDate of card expire : " + date);
    }
    public void writeFile(){
        try {
            FileWriter fw = new FileWriter("usersData.txt",true);
            String str = printInfo();
            fw.write(str);
            fw.close();
            System.out.printf("\nSuccsess for " + bankId);

        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
