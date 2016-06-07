/**
 *   File Name: StockSimulation.java<br>
 *
 *   Nepton, Jean-francois<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Aug 1, 2015
 *   
 */

package collection;

import java.util.*;

/**
 * StockSimulation A Stock Simulation software. This software shows securities
 * for a stock simulation where securities are trading amongst traders. A
 * Security represents an element which has a value that changes during the
 * simulation.
 * <p>
 * The application contains two String[] fields which should be converted to a
 * valid collection type to satisfy user requirements: > Optimal performance
 * while satisfying requirements > There CAN NOT be more than one Security with
 * the same name > All securities should remain in natural order based on their
 * security name.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class StockSimulation {

	String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper", "Iron" };
	double[] securityValues = { 89.6, 48.39, 24.9, 12.1, 4.0, 24.9 };
	private Map<String, Double> tmap;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StockSimulation sim = new StockSimulation();
		// Display Elements
		sim.displayElements();
		// Add and remove few elements to the collection
		sim.addElement("Ore", 30.7);
		sim.displayElements();

		sim.addElement("Ore", 55.7);
		sim.displayElements();

		sim.removeElement("Ore");
		sim.displayElements();

		sim.removeElement("Ore");

		// Use a static method version to view elements
		displayElements(sim);
	}

	/**
	 * A static method to display a StockSimulation's elements
	 * 
	 * @param sim
	 *            StockSimulation instance to work with
	 */
	public static void displayElements(StockSimulation sim) {
		// Provide logic to view elements in collection for StockSimilation
		// instance
		sim.displayElements();
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		System.out.println("There are currently " + tmap.size() + " no of elements");
		for (String str : tmap.keySet()) {
			System.out.println(str + " has value " + tmap.get(str));
		}

	}

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		// Either overload this class or make this default default constructor
		// interactive.

		System.out.println("Welcome to Stocks simulation system");
		tmap = new TreeMap<String, Double>();
		for (int i = 0; i < securityNames.length; i++) {
			tmap.put(securityNames[i], securityValues[i]);

		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String key, Double point) {
		// provide logic to add an element

		boolean present = tmap.containsKey(key);
		if (present == true) {
			System.out.println("Updating the stock value for : " + key);
		} else {
			System.out.println("Successfully added an element : " + key);
		}
		tmap.put(key, point);
		// System.out.println("Successfully added an element : " + val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		// provide logic to remove an element

		boolean present = tmap.containsKey(val);
		if (present == true) {
			tmap.remove(val);
			System.out.println("removed the key successfully : " + val);
		} else {
			System.out.println("key not present: " + val);
		}
	}

}
