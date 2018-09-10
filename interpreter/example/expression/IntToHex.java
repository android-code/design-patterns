public class IntToHex implements Expression {

    @Override
    public String interpret(String number) {
        Pattern pattern = Pattern.compile("([0-9]{1,3}");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches() && Integer.parseInt(number) <= 255) {
            return Integer.toHexString(number);
        else
            return "Invalid input. Should be a number between 0-255";
    }
}