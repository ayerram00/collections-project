/**
 *   File Name: TrendingTags.java<br>
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
 * TrendingTags A Twitter type software. This software captures popular tags and
 * collects the top ten most popular words.
 * <p>
 * The application contains a String[] array to represent the top words which
 * should be converted to a valid collection type to satisfy user requirements:
 * > Optimal performance while satisfying requirements > The words are entered
 * in insertion order. There CAN BE duplicate words although other logic in
 * application prevents this from happening. Words will be accessed from within
 * the middle of the collection performing a large amount of additions and
 * removals from within the middle of the collection.
 * <p>
 * There are methods to add, remove, and display collection
 * 
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class TrendingTags {

	String[] words = { "Money", "SQA", "Solutions", "Java", "Learn", "Collections" };

	private LinkedList<String> llist;

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		TrendingTags tags = new TrendingTags();
		// Display Elements
		tags.displayElements();
		// Add and remove few elements to the collection
		tags.addElement("Testing");
		tags.displayElements();

		tags.addElement("Testing");
		tags.displayElements();

		tags.removeElement("Sashi");

		tags.removeElement("Testing");
		tags.displayElements();

		// Use a staic method version to view elements
		displayElements(tags);
	}

	/**
	 * A static method to display a TrendingTags's elements
	 * 
	 * @param tags
	 *            TrendingTags instance to work with
	 */
	public static void displayElements(TrendingTags tags) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		tags.displayElements();

	}

	/**
	 * An instance method to display elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		System.out.println(llist);
	}

	/**
	 * Default Constructor
	 */
	public TrendingTags() {
		// Either overload this class or make this default default constructor
		// interactive.

		System.out.println("Welcome to Trending Tags system");
		llist = new LinkedList<String>();

		llist.addAll(Arrays.asList(words));

	}

	/**
	 * Method to add an element
	 */
	public void addElement(String val) {
		// provide logic to add an element

		llist.add(val);
		System.out.println("Added a new tag: " + val);

	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		// provide logic to remove an element

		if (llist.contains(val)) {
			llist.remove(val);
			System.out.println("Removed tag " + val);
		} else
			System.out.println("Such a tag doesnot exist : " + val);

	}

}
