public class HexToInt implements Expression {

    @Override
    public String interpret(String number) {
        Pattern pattern = Pattern.compile("([0-9a-f]{2}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return Integer.parseInt(number, 16);
        }
        else
            return "Invalid input. Should be [0-9a-f]{2}";
    }
}