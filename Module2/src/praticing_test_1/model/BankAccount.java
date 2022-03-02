package praticing_test_1.model;

public abstract class BankAccount {
    private int id;
    static int bankId = 0;
    private String codeAccount;
    private String nameAccount;
    private String dateAccount;

    public BankAccount() {
    }

    public BankAccount(String codeAccount, String nameAccount, String dateAccount) {
        bankId++;
        this.id = bankId;
        this.codeAccount = codeAccount;
        this.nameAccount = nameAccount;
        this.dateAccount = dateAccount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getBankId() {
        return bankId;
    }

    public static void setBankId(int bankId) {
        BankAccount.bankId = bankId;
    }

    public String getCodeAccount() {
        return codeAccount;
    }

    public void setCodeAccount(String codeAccount) {
        this.codeAccount = codeAccount;
    }

    public String getNameAccount() {
        return nameAccount;
    }

    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }

    public String getDateAccount() {
        return dateAccount;
    }

    public void setDateAccount(String dateAccount) {
        this.dateAccount = dateAccount;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                ", codeAccount='" + codeAccount + '\'' +
                ", nameAccount='" + nameAccount + '\'' +
                ", dateAccount='" + dateAccount + '\'';
    }
}
