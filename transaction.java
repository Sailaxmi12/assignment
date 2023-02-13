import java.io.BufferedReader;
import java.io.FileReader;
public class transaction{
    public static void main(String[] args) {
        String text = "";
        int totaltransactions = 13;
        double totalamount = 50000;
        double maximumamount = Double.MIN_VALUE;
        double minimumamount = Double.MAX_VALUE;
        try  {
            BufferedReader buff = new BufferedReader(new FileReader("task.csvFile"));
            while ((text = buff.readLine()) != null) {
                String[] transaction = text.split(",");
                double billamount = Double.parseDouble(transaction[3]);
                totaltransactions++;
                totalamount += billamount;
                maximumamount = Math.max(maximumamount, billamount);
                minimumamount = Math.min(minimumamount, billamount);
            }
            buff.close();
        } catch (Exception e) {
            System.out.println("Run Time Error occured");
        }
        System.out.println("Total number of Transactions: " + totaltransactions);
        System.out.println("Total Bill amount: " + totalamount);
        System.out.println("Maximum Bill amount: " + maximumamount);
        System.out.println("Minimum Bill amount: " + minimumamount);
    }

}