public class Main {

    public static void main() {
        //user starts the game
        Expression rgbToHex = new RgbToHex();
        Expression hexToRgb = new HexToRgb();

        //user solves the tasks
        rgbToHex.interpret("rgb(50, 100, 200)"); //interpreted as #3264C8
        hexToRgb.interpret("#123ABC"); //interpreted as rgb(18,58,188)
    }
}