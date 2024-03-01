package demo4;

public class Test {
    public static void main(String[] args) {
        PersonAccount personAccount = new PersonAccount("123456","ha",5000,20);
        personAccount.withDraw(200);
        personAccount.deposite(500);
        System.out.println("Thong tin tai khoan nguoi gui: "+personAccount);
        SavingAccount savingAccount = new SavingAccount("654321","long",6000,0,0);
        savingAccount.setRate(6.5);
        System.out.println("Thong tin tai khoan gui tiet kiem: "+savingAccount);
        System.out.println("Lai suat sau 12 thang: "+savingAccount.checkInterest());
    }
}
