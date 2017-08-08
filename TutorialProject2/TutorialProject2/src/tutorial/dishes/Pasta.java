// Notice the different namespace or "package" partially its for neatness. Packages should have an overall task, in this case this package handles everything to do with dishes. While you can put everything in a single package, well laid out code is god send
package tutorial.dishes;

/**
 * Description of a pasta dish
 * 
 * The class Pasta implements the interface Dish. Pasta "IS A" Dish It MUST have
 * the methods associated with Dish.
 */
public class Pasta implements Dish {

	// These are member variables. They belong to the object.
	private String pastaType;
	private String sauce;
	private String toppings;
	private int numberOfHelpings;

	/**
	 * Constructor like before
	 */
	public Pasta() {
	}

	/**
	 * Overloaded constructor
	 * 
	 * @param sauce
	 *            the sauce
	 * @param pastaType
	 *            the type of pasta
	 * @param seasonings
	 *            the seasonings on the dish
	 * @param numberOfHelpings
	 *            the number of helpings requested
	 */
	public Pasta(String sauce, String pastaType, String seasonings, int numberOfHelpings) {
		// This too is a constructor. Notice that it does not return anything
		// and the name matches the class name.

		// This refers to well....this object. Notice how the variable being
		// passed in
		// have the same name as the member variables. To differentiate between
		// the items passed in and the item passed through to the constructor or
		// method use "this".
		this.sauce = sauce;
		this.pastaType = pastaType;

		// Try removing "this." and see what happens. Notice how it just tries
		// to reassign the value of the variable passed through.
		this.numberOfHelpings = numberOfHelpings;

		// The names don't match. "this" is not required.
		toppings = seasonings;
	}

	// Notice the @Ovveride flag. This lets you know that the method you are
	// writing is overridding a method in interface, sub-class or abstract class
	// (more on the later two later)
	@Override
	public String makeDish() {

		// Strings are immutable objects. Even when it looks like it, you are
		// not actually changing the String, you are ALWAYS returning another
		// string with the changes you requested.
		String one = "String one";
		// Up to this point how many objects are there?
		String two = one + " two";
		// The answer it three.
		// This is the replace function. I am changing lower cases g's for upper
		// case.
		String three = two.replace("g", "G");
		// System.out.println("Old " + two);
		// System.out.println("New " + three);

		// Despite replace being called on the object "two" it has not actually
		// changed. The changes have been propogated to the object "three".
		// *Outside reading*

		/**
		 * StringBuilders are an effective way of making long Strings. Do some
		 * reading around this subject, but the basic rule of thumb is this. If
		 * you are making a long composite string like are about to do so. Use a
		 * StringBuilder.
		 * 
		 */
		StringBuilder sb = new StringBuilder();
		// Remember that public static final variable. Look at how we are
		// calling it. You can do more reading around this.
		sb.append(Dish.DISH);
		sb.append(sauce);
		sb.append(" ");
		// Have you noticed the difference to what happened with the String
		// object. With the StringBuilder we are adding to the object, rather
		// than making a new one for each time we need to make changes.
		sb.append(pastaType);
		// This enables us to chain methods like this. They happen from left to
		// right.
		sb.append(Dish.WITH).append(toppings).append(FOR).append(numberOfHelpings);

		// With the StringBuilder having done its job we can now make the
		// String.
		return sb.toString();

		// Once you have read this, return to MyRestraunt and continue reading
		// where you left off.
	}

}
