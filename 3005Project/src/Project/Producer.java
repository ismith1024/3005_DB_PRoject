package Project;
import java.util.ArrayList;


/*A PRODUCER has:
* Producer ID Number
* Name
* Some number of Product IDs (These are unique to a producer - by law a product must be traceable to a single producer)
* A MONTHLY REPORT, for each month
*/

public class Producer {
  String prodID;
  String name;
  ArrayList<Product> products;
  ArrayList<MonthlyReport> reports;	
  
  public Producer(String id, String n){
	  prodID = id;
	  name = n;
	  products = new ArrayList<Product>();
	  reports = new ArrayList<MonthlyReport>();
  }
}
