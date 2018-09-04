public class DetailsFactory {

    private static Map<Type, Details> types  = new HashMap<>();

    public static Details getPlantDetails(Type type) {
        Details item = types.get(type);
        if(item == null) {
            item = new Details(type);
            types.put(type, item);
        }
        return item;
    }
}