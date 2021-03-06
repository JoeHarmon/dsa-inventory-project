/** 
  * Application to read in product data from individual text files for each
  * product, store these in memory for access to decrement as sales are made
  * and to order more of a product when a threshold is reached for sales
  * velocity and number of item in stock.
  *
  * Data structures used are the ItemRecord, a single node containing fields
  * for product data and stock levels, and the StockList, which is a container
  * class holding all of the ItemRecords, allowing search, insertion, and 
  * deletion
  *
  * Written for the Fall 2014 Data Structure and Algorithms Course at
  * Empire State College, a joint collaboration between Adam Acosta, 
  * Junko Kotake, Stephanie Fuschetti, Kevin Leonas, and Michael Scarpace.
  */

package inventory;

public class InventoryApp{

public static void main(String[] args) {

	ItemRecord first = new ItemRecord("data.txt");
	System.out.println("Welcome to ABC Stores POS Software\n");
	first.displayItem();

}

}
