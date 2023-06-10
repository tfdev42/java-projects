package more;

public class PoNeZe {
	
	public static String checkNumber(int number) {
		
		String result;
			
		if (number == 0) {
			result = "Zero";
		}else if (number > 0) {
			result = "Positive";
		}
		else result = "Negative";
		return result;
		
	}
	

}
