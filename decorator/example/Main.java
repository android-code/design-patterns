public class Main {

    public static void main() {

        Avatar john = new Knight();
        Avatar katy = new Druid();

        john = new Fighter(john);
        john = new Defender(john);
        katy = new Magician(katy);

        john.fight();
        katy.fight();
        //catch the result of the fight
    }
}
