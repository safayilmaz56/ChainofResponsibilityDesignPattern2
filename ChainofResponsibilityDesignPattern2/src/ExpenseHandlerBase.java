public abstract class ExpenseHandlerBase {
    protected ExpenseHandlerBase expenseHandlerBase;
    public abstract void handleExpense(Expense expense);

    public void setExpenseHandlerBase(ExpenseHandlerBase expenseHandlerBase){
        this.expenseHandlerBase = expenseHandlerBase;
    }
}
