package Project;

/*
A MONTHLY REPORT has:
* A month
* A table cross referencing the producer's products with the countries; 
* the table data are integers*/


public class MonthlyReport {
  int month;
  int numCountries;
  int numProducts;
  int[][] salesData;
  
  public MonthlyReport(int m, int nC, int nP){
	  month = m;
	  numCountries = nC;
	  numProducts = nP;
	  salesData = new int[nC][nP];	  
  }
  
  public void setSalesData(int c, int p, int sv){
	  salesData[c][p] = sv;
  }
  
}
