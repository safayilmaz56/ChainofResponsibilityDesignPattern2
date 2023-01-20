public class Expense {
    public String detail;
    public int Amount;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getAmount() {
        return Amount;
    }

    public Expense(String detail, int amount) {
        this.detail = detail;
        this.Amount = amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
