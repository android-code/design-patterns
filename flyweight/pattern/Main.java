public class Main {
	
	public static void main() {
		//3 types of items can be created so reuse those items instead of creation new one
		String types[] = { "Type1", "Type2", "Type3" };

		//generate a lot of items for example in loop with random values
		for(int i=0; i<100; i++) {
		    //get random type and value
		    String type = randomType(types);
		    value = randomValue(0, 100);
		    //get flyweight item from factory and do operation
		    Flyweight flyweight = FlyweightFactory.getFlyweight(type, value);
		    flyweight.operation();
		}
		//factory created only 3 items: Type1, Type2, Type3 and rest of 97 have been reused
	}

	public static int randomValue(int min, int max) {
    	return min + (int) (Math.random() * ((max - min) + 1));
	}

	public static int randomType(String[] type) {
	    return types[(int)(Math.random() * types.length)];
	}
}