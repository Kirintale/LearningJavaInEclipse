package tutorial.dishes;

/**
 * Welcome to your first interface.
 * 
 * An interface is partly like a blueprint for classes. Imagine you had several
 * types of objects, all with the same task but different implementations. For
 * instance in this case we are cooking our dish. Each dish class must be "made"
 * therefore there is a method called "makeDish", each class will return a
 * different dish. Likewise each dish class MUST contain the method "makeDish".
 *
 * Here are the major advantages of interfaces
 * 
 * 1 - Lets say there are two different companies, who are working on the same
 * project. By having a common interface and agreeing on it, they can both
 * create code that is comparable without sharing their entire code till they
 * need to be merged. You can physically give people an interface without
 * revealing any of your code. This helps with planning.
 * 
 * 2 - It helps with testing. (I'll show you this later)
 * 
 * 3 - You can program to an interface, without caring what the solid classes
 * are. (More on this later)
 * 
 * 4 - There are more reasons, but you will find these out as we go along
 *
 */
public interface Dish {

	/**
	 * Interfaces can have member variables declared on them. They must be
	 * public, static and final. So they can always be seen, but never changed.
	 * 
	 * Notice how the name of the variable is all in capitals. This enables
	 * anyone writing more code to know that the variable they are using is
	 * public static and final.
	 */
	public static final String DISH = "Dish: ";
	public final String WITH = " with ";
	String FOR = " for ";
	// Notice how the bottom two member variables I have not specified public
	// static or final. Because this is an interface member variables are ALWAYS
	// public static and final and you don't need to explicitly declare it. It
	// is however good form to be explicit. Try writing a private member
	// variable. What happens?

	/**
	 * Makes the dish
	 * 
	 * @return the details of the dish
	 */
	public String makeDish();

	/**
	 * Notice the difference that there is no implementation of the method. It
	 * is just the declaration of what the method will look like. There are no
	 * "{}"
	 * 
	 * Also interface methods MUST be public (Note: Since Java 7 they do a bit
	 * more but that is beyond this tutorial).
	 */

}
