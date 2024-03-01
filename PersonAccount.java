package demo4;

public class PersonAccount extends Account{
    private double fee;

    private PersonAccount() {
    }

    public PersonAccount(String accountNo, String customerName, double balance, double fee) {
        super(accountNo, customerName, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
    public void withDraw(double amount){
        setBalance(getBalance()-amount-fee);
    }
    public void deposite(double amount){
        setBalance(getBalance()+amount);
    }

    @Override
    public String toString() {
        return super.toString()+", fee= "+fee;
    }
}
