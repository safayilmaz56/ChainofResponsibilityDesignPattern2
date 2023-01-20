public class President extends ExpenseHandlerBase{
    @Override
    public void handleExpense(Expense expense) {
        if (expense.Amount > 1000){
            System.out.println("President handled the expense ");
        } else if (expenseHandlerBase != null) {
            expenseHandlerBase.handleExpense(expense);
        }
    }
}
