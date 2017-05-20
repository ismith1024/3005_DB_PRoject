package Project;

public class Controller {
  Model data;
  View v;	
	
  public Controller(Model m){
	data = m;
    v = new View(m);
    
    /*v.add(this and that);*/
    // add event handlers to v
  }
	
}
