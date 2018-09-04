public class Main {

    public static void main() {
        List<Jersey> orders = new ArrayList();

        //order football jersey
        JerseyFactory factory = new FootballFactory();
        orders.add(factory.createJersey(Size.M, Color.RED);
        orders.add(factory.createJersey(Size.L, Color.RED);
        orders.add(factory.createJersey(Size.XL, Color.RED);

        //order basketball jerseys
        factory = new BasketballFactory();
        orders.add(factory.createJersey(Size.XL, Color.BLUE);
        orders.add(factory.createJersey(Size.S, Color.BLUE);
        orders.add(factory.createJersey(Size.L, Color.BLUE);

        //order custom basketball jersey
        Socks socks = factory.createSocks(Color.WHITE);
        Shorts shorts = factory.createShorts(Color.BLACK, Size.M);
        Shirt shirt = factory.createShirt(Color.RED, Size.M, true);
        orders.add(new Jersey(socks, shorts, shirt));

        //check availability, price and get order summary before confirm order
        int totalPrice = 0;
        String summary;
        for(Jersey jersey : orders) {
            totalPrice = totalPrice + jersey.getPrice();
            summary = summary + jersey.getDescription() + "\n";
            if(!jersey.isAvailable()) {
                //show warning about longer delivered time
            }
        }
        //show total price and summary
    }
}
