package tutorial;

/**
 * Disclaimer
 *
 *
 * This project contains some...sub optimal code practices. While I try to
 * highlight some code practices which are good, I am ultimately trying to
 * demonstrate things you can do with code and tools. I may be taking certain
 * liberties and writing sub-optimal code. As you program you will learn to
 * improve your coding practices.
 */
public class Application {
	/**
	 * Before be begin lets talk about debugging. Firstly set up this project as
	 * you did the previous one.
	 * 
	 * Debugging is a way of stepping through through your code, line by line if
	 * necessary. This is such a useful practice it would be mad not to talk
	 * about it.
	 * 
	 * How to debug:
	 * 
	 * Go to the line "MyRestaurant restaurant = new MyRestaurant();" in this
	 * code and double click on the bar between the code and the package
	 * explorer (just to the left of the line number)
	 * 
	 * You should see a blue circle appear.
	 * 
	 * Remember how you ran an application? Rather than click the "play" button,
	 * click the bug icon to the left of it and do the same as you did
	 * previously. Now run the code using the bug icon.
	 * 
	 * Notice how the code stopped at the break point. Hover your mouse over
	 * variables before the line you just reached, hover it on variables
	 * afterwards. Investigate the values you see. Now go to the "Run" option at
	 * the top the controls this presents helps you debug. Resume - continue to
	 * next break point. Terminate - Stop the process. Step Into - If you are
	 * running a method/class, it steps you into it so you can look to see what
	 * it does. Step over- just continue line by line. Step Return - Have a play
	 * with this button. See if you can find out when it becomes active and what
	 * it does. "Clue you need to Step Into something first"
	 * 
	 * I highly encourage you to have a play with break points and debugging.
	 * When writing your own code it will help you fix breaks. When looking at
	 * other peoples code it will help you understnad it.
	 */

	public static void main(String[] args) {
		// Remember how I said that writing everything in main is a bad idea.
		// Lets address that. First thing is first though. I mentioned static.
		// Static means that it persists and there is (in most cases) only one
		// instance of it. This means it will take up on your computers
		// resources. Static classes (covered shortly) are VERY useful, but
		// should not be over used. Consider carefully if you need them any way.

		{
			// Local variables have a limited life span. Once they are outside
			// of that lifespan they can be garbage collected and the memory of
			// your machine freed up. Naturally if you have information that
			// does not need to persist make sure it a local variable
			// The life span of many local variables is within {} or within a
			// method.
			String outputMessage = "This is a local variable";

			System.out.println(outputMessage);
		}

		// Try to print that outputMessage here.

		// With that done lets get cooking.

		// What the hell is this?! I'll talk more about this later, but for now.
		// I have a class called Restaurant, I have made a new instance of it to
		// manipulate. That instance is referred to as an object.
		MyRestaurant restaurant = new MyRestaurant();
		restaurant.setNumberOfServings(2);

		// This is a second restaurant. I can change its values without
		// affecting the first one, despite them both being Restaurants. So they
		// are the same class, but different objects
		MyRestaurant restaurant2 = new MyRestaurant();
		restaurant2.setNumberOfServings(6);

		// Lets show you. Notice "==", Remember in the last lesson we wrote int
		// number = 1; This set the value of the number to 1. So what if I want
		// to find out if two values are equal? "==" will do the job.
		if (restaurant.getNumberOfServings() == restaurant2.getNumberOfServings()) {
			// If true
			System.out.println("They are the same restaurant");
		} else {
			// If false
			System.out.println("They are different restaurants");
		}

		// Ok lets print out this message.
		System.out.println("Number of servings from 1: " + restaurant.getNumberOfServings());
		System.out.println("Number of servings from 2: " + restaurant2.getNumberOfServings());

		// Having printed out the message did you notice anything weird? The
		// number of servings was wrong. Lets find out why. Either click on the
		// Restaurant class on the left hand Package Explorer. Hold Ctrl and
		// left click on the class name in this code.

	}

}
