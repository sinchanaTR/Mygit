public class ReportCard{
	public static String report(double percentage) {
		if(percentage<=28){
			return "Fail";
		}else if(percentage<45){
			return "just pass";
		}else if(percentage<60){
			return "second class";
		}else if(percentage<70){
			return "first class";
		}else if(percentage<80){
			return "distinction";
		}else if(percentage<90){
			return "excellent";
		}else {
			return "O";
		}

	}
} 