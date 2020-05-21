package SingletonDesignPattern;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		// If we add like below we couldn't be able to compile because our constructor is private.
		//SingleObject object = new SingleObject();
		
		//But we can call to our class available object
		SingleObject Object = SingleObject.getInstance();
		
		//We need to get the printing statement in here
		Object.showMessage();

	}

}
