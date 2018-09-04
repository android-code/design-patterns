public class FlyweightFactor {

    //if there are more types of flyweight classes than use Factory method

    public static Map<String, Flyweight> flyweightTypes = new HashMap<>();

    public static Flyweight getFlyweight(String type, int value) {
        Flyweight flyweight = flyweightTypes.get(type);
        if(result == null) {
            result = new ConcreteFlyweight(name, value);
            flyweightTypes.put(name, result);
        }
        else {
            result.setValue(value);
        }
        return result;
    }
}