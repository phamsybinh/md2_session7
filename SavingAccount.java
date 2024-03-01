package demo4;

public class SavingAccount extends Account{
    private double rate;
    private double period;

    public SavingAccount() {
    }

    public SavingAccount(String accountNo, String customerName, double balance, double rate, int period) {
        super(accountNo, customerName, balance);
        this.rate = rate;
        this.period = period;
    }

    public double getRate() {
        switch ((int) period){
            case 1:
                return 5.0;
            case 3:
                return 5.5;
            case 6:
                return 6.0;
            case 12:
                return 7.0;
            case 24:
                return 7.5;
            case 36:
                return 8.0;
            default:
                return 1.8;

        }
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public int getPeriod() {
        return (int) period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }
    public double checkInterest(){
        return getBalance()*(getRate()/100)*(period/12.0);
    }

    @Override
    public String toString() {
        return super.toString()+",rate= "+rate+",period= "+period;
    }
}
