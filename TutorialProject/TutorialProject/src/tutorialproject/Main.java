package tutorialproject;

public class Main {

	// Welcome to the basic tutorial. This is a comment anything in here is not
	// run
	/**
	 * This also is a comment. Writing comments like this helps if it goes over
	 * many lines
	 *
	 * Well documented code is good code. Make sure to put documentation on each
	 * method, class and complex operation (more on these later). To start in
	 * the top window go to Project, Properties. On the new Window select Java
	 * Editor, Save Actions, ensure all check boxes are checked.
	 * 
	 * Well formatted code is one of many lessons people have to learn. It makes
	 * it easier to look at, easier for other people to look at and easier to go
	 * back to.
	 * 
	 * Under Project, make sure Build Automatically is selected.
	 * 
	 * In this guide, there are things I will highlight and hopefully get back
	 * to later. There are times when I will point you to doing your own
	 * research as it is beyond the scope of this program.
	 */

	// This is the main method. When you run an application, the application
	// looks for this method. Do not rename or change its structure, you can
	// change its contents. Note the word static, I'll talk more about that
	// later. As for what you can do with it, please do outside reading later.
	// Just note that the args can be used supplied information when running the
	// application.
	public static void main(String[] args) {

		// This outputs a message into the console below. Try running the
		// application to see what happens. To do so, click the downward arrow
		// next to the green circle with a play button in it. Select Java
		// Application, there should be instructions as to how to run a new
		// application. Follow them and it should automatically not the project
		// name of "Tutorial PRoject" and this Main class as the one to run.
		// When you run, you should notice HEllow World as the first thing that
		// appears.
		System.out.println("Hello world");

		// Here we have declared an integer (whole number), variables/objects
		// are declared as follows
		// [variable type] [variable name]
		// I have then automatically assigned a value. Notice the use of
		// camelCase for a variable, this is standard practice. Use it.
		// Variables should give the user an idea as to what the vairable DOES
		// not what it is, the one below is a bad name.
		int anInteger = 2;

		// Lets print it, note the similarity to hellow world. Also note the
		// semi-colon at the end. Think of it as a full stop to an operation.
		// You will use these everywhere
		System.out.println(anInteger);

		// Yay addition
		anInteger = anInteger + 2;
		// This does exactly the same as the line above.
		anInteger += anInteger;

		// Top tip IntelliSense is your friend. Write Sys on a clear line then
		// press Ctrl + Space, notice the options that come up. This will help
		// you write faster. Now try and type "sysout" then press Ctrl + Space
		// See what happened? Useful! Press Ctrl + D to delete that line
		System.out.println(anInteger);

		// Division
		anInteger = anInteger / 2;
		// Can you think of another way to perform division? Write a line of
		// code below here so the variable is divided by two again.

		// Did it work?
		System.out.println(anInteger);

		// Multiplication
		anInteger = anInteger * 2;

		// Press Ctrl +F5 to quickly run the
		System.out.println(anInteger);

		// Read up on other mathematical options.

		// What do you think the value of the new variable is? Notice the final,
		// this stops it being changed and helps people read your code. Write a
		// sysout to confirm what you think the value should be.
		final int aSecondInteger = anInteger;

		// You may have noticed I have been putting all of this in main. This is
		// hilariously bad practice, in later projects I'll show you how to
		// avoid this and what to do. For now I will continue.

		// I have just redeclared the value
		anInteger = 4;
		// Uncomment the code below, notice what happens? Why is this? What
		// happnes if you try to run the program?
		// aSecondInteger = 3;

		// Uncomment and run. What happened why do you think this is? Notice the
		// (int)? This converts the 2.5 to an integer. Since your variable in an
		// integer it can not store a decimal and must be converted for your
		// code to compile.
		anInteger = (int) 2.5;

		// To quickly uncomment the code below, highlight it with your mouse and
		// press Ctrl + / to uncomment it. What happens if you press Ctrl + /
		// again?
		// System.out.println(anInteger);
		// // If statements help you make checks. Can you read it? What do you
		// // think it does
		// if (anInteger == 2) {
		// System.out.println("Hey it was 2");
		// } else if (anInteger == 3) {
		// System.out.println("Hey it was 3");
		// } else {
		// System.out.println("What am I doing here?!");
		// }

		// Doubles can store decimal values.
		double value = 2.5;

		// Don't do this
		double value2 = 1;
		// Do this
		double value3 = 1.0;
		// Otherwise rounding errors could be your downfall.

		// This is valid too
		double value4 = 1e-4;

		// This is end of this first project. Add more code below this.
		// Experiment with doubles, ints, if statements and read up on different
		// variable types. In the next project we will look at objects. Look at
		// short, boolean, long.

		// Try to create your own simple project like this. Google is your
		// friend. If you have any issues ping me

		// Press Ctrl + 1 and read the dialog that comes up, select it. What
		// happened?

		String firstString = "2 By the way this is called a String.";
		System.out.println(firstString);

	}

}
