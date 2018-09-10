public class RgbToHex implements Expression {

    @Override
    public String interpret(String number) {
        Pattern pattern = Pattern.compile("rgb *\\( *([0-9]+), *([0-9]+), *([0-9]+) *\\)");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            Expression intToHex = new IntToHex();
            String red = intToHex.interpret(matcher.group(1));
            String green = intToHex.interpret(matcher.group(2));
            String blue = intToHex.interpret(matcher.group(3));
            if(!red.contains("Invalid") && !green.contains("Invalid") && !blue.contains("Invalid"))
                return "rgb(" + red + green + blue + ")";
            else
                return "Invalid input. Should be rgb(int, int, int)";
        }
        else
            return "Invalid input. Should be rgb(int, int, int)";
    }
}