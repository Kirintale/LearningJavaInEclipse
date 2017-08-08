package tutorial.dishes;

/**
 * Classes can only extend a single class, but that can implement as many
 * classes as they choose
 *
 * In the line below I have implemented Dish. While this is allowed, this is
 * entirely pointless. Why?
 */
public class RedRice extends RiceDish implements Price, Dish {

	/**
	 * I've decided all red rice dishes need only cook for 5 minutes, therefore
	 * I can do this.
	 */
	public RedRice() {
		super(5);
	}

	@Override
	public double cost() {
		return 2.53;
	}

	@Override
	protected void produceTopping(StringBuilder sb) {
		sb.append("tomato ketchup").append("\n");
	}

	// Now go back to MyRestraunt
}
