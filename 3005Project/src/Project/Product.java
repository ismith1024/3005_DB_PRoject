package Project;

/*
A PRODUCT has: 
* Product ID
* Name
* Mass
* EEE Category
*/

public class Product {
  String prodID;
  String name;
  float mass;
  int category;
  
  public Product(String pid, String n, float m, int c){
	  prodID = pid;
	  name = n;
	  mass = m;
	  category = c;
  }
}
