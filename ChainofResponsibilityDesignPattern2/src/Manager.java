public class Manager extends ExpenseHandlerBase{
    @Override
    public void handleExpense(Expense expense) {
        if (expense.Amount <= 100){
            System.out.println("Manager handled the expense");
        } else if (expenseHandlerBase != null) {
            expenseHandlerBase.handleExpense(expense);
        }
    }
}
