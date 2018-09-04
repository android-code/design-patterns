public BasketballShorts extend Shorts {

    @Override
    public int getPrice() {
        return 25;
    }

    @Override
    public String getName() {
        return "Basketball shorts " + color.toString() + " " + size.toString();
    }

    @Override
    public boolean isAvailable() {
        //connect with server database and providers in specific way and check availability
        return true; //mock
    }
}
