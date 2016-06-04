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
		sim.addElement("Ore", "30.7");
		sim.removeElement("Ore");
		// Use a staic method version to view elements
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

	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance

	}

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		// Either overload this class or make this default default constructor
		// interactive.
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String... val) {
		// provide logic to add an element
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String... val) {
		// provide logic to remove an element
	}

}
