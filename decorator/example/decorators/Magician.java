public class Magician extends AvatarProfile {

    public Magician(Avatar avatar) {
        super(avatar);
    }

    @Override
    public String getDescription() {
        return avatar.getDescription() + " Magician";
    }

    @Override
    public int getPower() {
        return avatar.getPower() + 5;
    }

    @Override
    public void fight() {
        //cast spells to be invisible
    }
}
