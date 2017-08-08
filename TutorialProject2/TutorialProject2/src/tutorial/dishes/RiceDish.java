package tutorial.dishes;

/**
 * Terminology: When creating an object the word "new" is used. We say the class
 * has then been instantiated. Try and instantiate an interface and you will
 * realise it can not be done.
 * 
 * Notice the word abstract. Abstract classes can not be instantiated. Abstract
 * classes differ from interfaced in that they can have basic functionality.
 *
 * Advanced note: As the tutorials continue I will begin to talk about "Design
 * Patterns" these are ways of thinking about and designing code to efficient,
 * perform as intended and easy to extend.
 */
public abstract class RiceDish implements Dish {

	private final int minutesToCookRice;

	/**
	 * A constructor. Note: I have decided not to include a default constructor
	 * (one without parameters). This has been done to demonstrate an aspect of
	 * abstract classes.
	 * 
	 * Abstract classes can contain constructors. If you do not explicitly state
	 * a constructor a default constructor is assumed.
	 * 
	 * @param minutesToCookRice
	 *            the number of minutes to cook the rice
	 */
	public RiceDish(final int minutesToCookRice) {
		this.minutesToCookRice = minutesToCookRice;
	}

	/**
	 * An abstract method. Does not have its functionality implemented and
	 * instead relies on the "super" class to provide implementation.
	 * 
	 * Also notice that this is "protected", not public or private. Have a read
	 * about protected and default methods. Why is this method protected and not
	 * private?
	 * 
	 * @param sb
	 */
	protected abstract void produceTopping(StringBuilder sb);

	private void cookTheRice(final StringBuilder sb) {
		sb.append("Coook the rice for ");
		sb.append(minutesToCookRice).append(" minutes.");
		sb.append("\n"); // \n when in a string means "new line"
	}

	/**
	 * Lets consider what has occurred here. In the Pasta class we implemented
	 * the "makeDish" method, each direct implementation of the Dish interface
	 * must implement the makeDish method.
	 * 
	 * For rice dishes we have decided that all rice dishes must act in a
	 * similar fashion (making the rice then adding the topping). Rather than
	 * having to write the same code in every Rice dish, we have made an
	 * abstract class. The abstract class handles the basic functionality,
	 * meaning that each super class need only state which toppings to add.
	 */
	@Override
	public String makeDish() {
		final StringBuilder sb = new StringBuilder();
		cookTheRice(sb);
		produceTopping(sb);
		return sb.toString();
	}

	// Go have a look at PlainRice
}
