package Notes;

public class SwitchCase {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		String month = "January";
		month = month.toLowerCase();
	

		// CHANGE CODE HERE
        int days = -1; 
        switch( month ) {
            case "january":
            case "march":
            case "may":
            case "july":
            case "august":
            case "october":
            case "december":
                days = 31;
                break;
            case "april":
            case "june":
            case "september":
            case "november":
                days = 30;
                break;
            case "february":
                days = 28;
                break;
        }
    /***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/         
        if (days == -1) {
            System.out.println("Invalid month");
        } else {
            System.out.println("Has " + days + " days");
        
		// Days
            String day = "SunDaY";
    		
    		String dayIs = day.toLowerCase().trim();
    		
    		String typeOfDay = "";
    		
    		switch(dayIs) {
    		case "monday": 
    		case "tuesday":
    		case "wednesday":
    		case "thursday":
    		case "friday":
    			typeOfDay = "weekday";
    			break;
    		case "saturday":
    		case "sunday":
    			typeOfDay = "weekend";
    			break;
    		default: 
    			typeOfDay = "invalid";	
    		}
    		
    	if (typeOfDay.equals("weekday")) {
    		System.out.println(day + " is a weekday!");
    	
    	}else if ( typeOfDay.equals("weekend")){
    		System.out.println(day + " is a weekend day.");
    		
    	}else { 
    		System.out.println("Invalid day");
    	}  
		
	}
}
}