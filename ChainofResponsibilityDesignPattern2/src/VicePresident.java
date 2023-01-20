public class VicePresident extends ExpenseHandlerBase{
    @Override
    public void handleExpense(Expense expense) {
        if(expense.Amount > 100 && expense.Amount <= 1000){
            System.out.println("Vice president handled the expense");
        } else if (expenseHandlerBase != null) {
            expenseHandlerBase.handleExpense(expense);
        }
    }
}
