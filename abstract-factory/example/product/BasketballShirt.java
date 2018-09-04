public BasketballShirt extend Shirt {

    @Override
    public int getPrice() {
        return 50;
    }

    @Override
    public String getName() {
        return "Basketball shirt " + color.toString() + " " + size.toString();
    }

    @Override
    public boolean isAvailable() {
        //connect with server database and providers in specific way and check availability
        return true; //mock
    }
}
