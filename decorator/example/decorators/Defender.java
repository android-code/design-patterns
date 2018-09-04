public class Defender extends AvatarProfile {

    public Defender(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + " Defender";
    }

    @Override
    public int getPower() {
        return avatar.getPower() + 15;
    }

    @Override
    public void fight() {
        //use shield to protect yourself
    }
}
