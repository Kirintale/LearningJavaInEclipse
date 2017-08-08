package tutorial.dishes;

/**
 * Note: Classes extend other classes. The class you need not be an abstract
 * class. Classes "implement" interfaces Interfaces "extend" interfaces
 *
 */
public class PlainRice extends RiceDish {

	/**
	 * See the word "super". Super classes must call a constructor of a class
	 * they are extending. Since RiceDish only has a single constructor, there
	 * is only one choice. Remove the variable from within "super" and see what
	 * happens. Why is this?
	 * 
	 * Now create a default constructor in RiceDish and try again.
	 * 
	 * @param minutesToCookRice
	 */
	public PlainRice(int minutesToCookRice) {
		super(minutesToCookRice);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void produceTopping(StringBuilder sb) {
		sb.append("Nothing is added");
	}

	// Try deleting all the code in this class. Note the red line under the word
	// PlainRice. Follow the instructions until you can get this class to build
	// again. Once you have done this, go to RedRice.
}
