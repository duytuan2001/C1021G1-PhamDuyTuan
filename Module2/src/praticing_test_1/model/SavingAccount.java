package praticing_test_1.model;

public class SavingAccount extends BankAccount {

    // Số tiền gửi tiết kiệm
    private String savingsDepositAmount;

    // Ngày gửi tiết kiệm,
    private String dateSaving;

    // Lãi suất
    private String interestRate;

    // Kì hạn
    private String Period;

    public SavingAccount() {
    }

    public SavingAccount(String codeAccount,
                         String nameAccount,
                         String dateAccount,
                         String savingsDepositAmount,
                         String dateSaving,
                         String interestRate,
                         String period) {
        super(codeAccount, nameAccount, dateAccount);
        this.savingsDepositAmount = savingsDepositAmount;
        this.dateSaving = dateSaving;
        this.interestRate = interestRate;
        Period = period;
    }

    public String getSavingsDepositAmount() {
        return savingsDepositAmount;
    }

    public void setSavingsDepositAmount(String savingsDepositAmount) {
        this.savingsDepositAmount = savingsDepositAmount;
    }

    public String getDateSaving() {
        return dateSaving;
    }

    public void setDateSaving(String dateSaving) {
        this.dateSaving = dateSaving;
    }

    public String getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(String interestRate) {
        this.interestRate = interestRate;
    }

    public String getPeriod() {
        return Period;
    }

    public void setPeriod(String period) {
        Period = period;
    }

    @Override
    public String toString() {
        return "SavingAccount{" + super.toString() +
                "savingsDepositAmount='" + savingsDepositAmount + '\'' +
                ", dateSaving='" + dateSaving + '\'' +
                ", interestRate='" + interestRate + '\'' +
                ", Period='" + Period + '\'' +
                '}';
    }
}
