import java.util.Scanner;

public class displayAllExpenses {
    public static void main(String[] arg){
    	Scanner in = new Scanner( System.in );
    	recordExpense expenseL = new recordExpense();
    	expenseL.expensesList.display(true);
    	linkedList.Node currentE = expenseL.expensesList.head;
    	double totExp = 0;
    	while(currentE != null) {    
            //Calculates total expenses.  
            totExp = toExp + currentE.money;    
            currentE = currentE.next;    
        }
    	System.out.println("Your total expenses are: $" + totExp);
    	lab2.askPrompt(in);
    	System.exit(0);
    }
}
