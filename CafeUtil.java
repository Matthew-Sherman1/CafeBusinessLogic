import java.util.ArrayList;
// import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for (int i = 0; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }


    public double getOrderTotal(double[] prices){
        double sum = 0;
        for ( int i = 0; i < prices.length; i++){
        sum += prices[i];
    }
    return sum;
    }


    public void displayMenu(ArrayList<String>menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i +" "+ menuItems.get(i));
        }
    }


    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello"+ userName );
        System.out.println("There are " + customers.size() + "people in front of you");
        customers.add(userName);
    }
}