public FootballSocks extend Socks {

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public String getName() {
        return "Footbal socks " + color.toString();
    }

    @Override
    public boolean isAvailable() {
        //connect with server database and providers in specific way and check availability
        return true; //mock
    }
}
