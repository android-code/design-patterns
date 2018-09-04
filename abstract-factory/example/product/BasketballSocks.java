public BasketballSocks extend Socks {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String getName() {
        return "Basketball socks " + color.toString();
    }

    @Override
    public boolean isAvailable() {
        //connect with server database and providers in specific way and check availability
        return true; //mock
    }
}
