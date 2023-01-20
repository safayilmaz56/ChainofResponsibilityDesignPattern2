public class Main {
    public static void main(String[] args) {


        ExpenseHandlerBase managerHandler = new Manager();
        ExpenseHandlerBase vicePresidentHandler = new VicePresident();
        ExpenseHandlerBase presidentHandler = new President();

        managerHandler.setExpenseHandlerBase(vicePresidentHandler);
        vicePresidentHandler.setExpenseHandlerBase(presidentHandler);

        Expense expense = new Expense("Training",1100);
        managerHandler.handleExpense(expense);
    }
}