public class Age{
	public static String ageDefinition(byte age){
		if (age<15){
			return "Kid";
		}
		else if(age<19){
			return "Teen";
		}
		else if (age<50){
			return "Adult";
		}else {
			return "Old";
		}
	}		
} 