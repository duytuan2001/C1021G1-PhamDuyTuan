package praticing_test_1.model;

public class PaymentAccount extends BankAccount {
    // số thẻ
    private String cardNumber;
    // Số tiền trong ngân hàng
    private String numberBank;

    public PaymentAccount() {
    }

    public PaymentAccount( String codeAccount,
                           String nameAccount,
                           String dateAccount,
                           String  cardNumber,
                           String numberBank) {
        super(codeAccount, nameAccount, dateAccount);
        this.cardNumber = cardNumber;
        this.numberBank = numberBank;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getNumberBank() {
        return numberBank;
    }

    public void setNumberBank(String numberBank) {
        this.numberBank = numberBank;
    }

    @Override
    public String toString() {
        return "PaymentAccount{" + super.toString() +
                "cardNumber=" + cardNumber +
                ", numberBank='" + numberBank + '\'' +
                '}';
    }
}
