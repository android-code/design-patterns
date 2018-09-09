public class HexToRgb implements Expression {

	@Override
	public String interpret(String number) {
		Pattern pattern = Pattern.compile("#([0-9a-f]{6}", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(number);
		if (matcher.matches()) {
			Expression hexToInt = new HexToInt();
			String red = hexToInt.interpret(number.substring(1,3));
			String green = hexToInt.interpret(number.substring(3,5));
			String blue = hexToInt.interpret(number.substring(5,7));
			if(!red.contains("Invalid") && !green.contains("Invalid") && !blue.contains("Invalid"))
				return "#" + red + green + blue;
			else
				return "Invalid input. Should be #rrggbb";
		}
		else
			return "Invalid input. Should be #rrggbb";
	}
}