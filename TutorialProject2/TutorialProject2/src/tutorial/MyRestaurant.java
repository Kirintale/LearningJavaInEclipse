// This package is otherwise referred to as a namespace more on them later.
package tutorial;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import tutorial.dishes.Dish;
import tutorial.dishes.Pasta;
import tutorial.dishes.PlainRice;
import tutorial.dishes.RedRice;

/*
 * Welcome to a class, technically Application and Main were classes but here I will begin to try to describe them. Classes you can think of as blueprint of an object. I'll show you what I mean here.
 * I appreciate I am throwing words at you but hopefully you will begin to understand them more as time goes on.
 * 
 */

// public can be seen elsewhere
// class - what this is
// ObjectiveTutorial notice the HumpCase in comparison to the camelCase of variables. Using a different case enables you and others to quickly identify what is a class and what is a variable.
public class MyRestaurant {
	// This is a private member variable, it can be seen by any method in an
	// instance of this class, but not outside of it. You can have public member
	// variables. This is considered bad form (more on this later).
	private int numberOfCustomers;

	/**
	 * Welcome to a Constructor. A Constructor is called when the object is
	 * initially created. If you need to initialise anything or perform initial
	 * functions this is the location.
	 */
	public MyRestaurant() {
		numberOfCustomers = 0;
	}

	// Remember how I said public member variables are a bad thing. There are
	// two reasons why. The first is that it means you lose control of the
	// variable, anyone can change it at any thing. The second issue is that you
	// may want to do extra operations on the information the user provides you.
	// Avoid public member variables all the time (there are few exceptions).
	public void setNumberOfServings(int numberOfServings) {
		// e.g. James the head chef knows that no matter how many customers he
		// has, they are always hungrier than they expect, so he decides to add
		// one more serving to every dish
		this.numberOfCustomers = numberOfServings + 1;
	}

	/**
	 * Since the member variable is private and hidden from the outside world.
	 * You way to get access to it.
	 * 
	 * @return the number of servings
	 */
	public int getNumberOfServings() {
		// Oh no this variable is mislablled. It should read, "numberOfServings"
		// to match the getter and setter. We could change its name all the way
		// through the class by copy pasting or.....
		// Select the variable, right click, Refactor, rename. Change the name.
		// Notice how all instances of the name have changed.
		return numberOfCustomers;
	}

	/**
	 * This is a method (you have seen lots of them already). Methods "Do
	 * stuff", the bulk of operations can be put into methods. If you write a
	 * long piece of code and a specific part of it does a specific operation.
	 * Put it in a method. It makes your code easier to read. IF you notice that
	 * you use the same code again and again. Put it in a method, rather than
	 * copy and pasting the same code.
	 * 
	 * @return Put a description here as to what is being returned. In this
	 *         case, a description of the dinner that is made is being returns
	 */
	private List<Dish> createPastaDishes() {
		// This is an object.
		Pasta carbonara = new Pasta("Cream", "fusceli", "bacon", numberOfCustomers);
		// This is a separate object. They are both of the same class, but they
		// have different variables. They are made of different stuff.
		// Lets pause for a minute. See the "Dish" interface on the left hand
		// "Package Explorer", lets go have a look at that, then lets have a
		// look at the "Pasta" class.
		Pasta spagBol = new Pasta("Tomato", "spagetti", "coriander", numberOfCustomers);

		// Wow wow. What has happened here. Pasta objects "IS A" Pasta object.
		// Therefore the varaible I assign to hold it was of the Pasta class. If
		// you have not already look at the Pasta class. Notice the "implements
		// Dish". This means Pasta IS A dish. As such we can do this.
		Dish plain = new Pasta("Butter", "ravioli", "cheese", numberOfCustomers);

		// This is an ArrayList. It can be used to hold a list of objects, which
		// can be duplicates.
		List<Dish> dishes = new ArrayList<Dish>();
		// There are many types of List's. ArrayList IS A List. This
		// ArrayList<Object Type>, holds Dish objects.
		dishes.add(carbonara);
		dishes.add(spagBol);
		dishes.add(plain);

		// Run the code in debug mode. Put a break point before the return
		// statement and have a play.

		return dishes;
	}

	/**
	 * So previously I mentioned abstract classes and sub classes. Time to teach
	 * you about those.
	 * 
	 * This method gets a list of rice based dishes
	 * 
	 * @return rice based dishes
	 */
	private List<Dish> createRiceDishes() {
		// Sets are like Lists, but they do not allow duplicates. Do some
		// independent reading around this. The thing to note is that Set's must
		// have something to compare in order to classify if the two objects are
		// identical.

		Set<Dish> riceSet = new HashSet<>();

		riceSet.add(new PlainRice(10));
		riceSet.add(new RedRice());

		// This converts a set to a list
		return new ArrayList<Dish>(riceSet);
	}

	// Put a /** comment just above this method. Notice anything different to
	// before? parameters and return statements are noted. These enable you to
	// easily describe what is going into and coming out of the method and what
	// it is doing. JavaDocs should also be put on classes
	public String pointlessMethod(String value) {
		// This is return nothing, not a string, actually nothing. In the last
		// exercise you may have seen the red line around your code, so when you
		// tried to run your code it did not work. That is referred to as a
		// compile time error, because it failed at compile time. But there are
		// a number of ways to break your code when you are running it. Trying
		// to call operations or methods on "null" is one easy way. Still it has
		// its uses
		return null;
	}

	private String cookDinner() {
		List<Dish> dishesToServe = new ArrayList<>();
		List<Dish> pastaDishes = createPastaDishes();
		// I have added all pasta dishes to my list of dishes to serve
		dishesToServe.addAll(pastaDishes);
		// Here is me adding all rice dishes to the list, but in one line. I
		// could have done the same with pasta dishes.
		dishesToServe.addAll(createRiceDishes());

		return null;
	}

}
