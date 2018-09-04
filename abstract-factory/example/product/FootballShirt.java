public FootballShirt extend Shirt {

    @Override
    public int getPrice() {
        return 40;
    }

    @Override
    public String getName() {
        if(longSleeve)
            return "Footbal shirt long sleeve " + color.toString() + " " + size.toString();
        else
            return "Footbal shirt " + color.toString() + " " + size.toString();
    }

    @Override
    public boolean isAvailable() {
        //connect with server database and providers in specific way and check availability
        return true; //mock
    }
}
