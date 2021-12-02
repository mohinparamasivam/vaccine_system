/**
 * 
 */
package utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.Calendar;
import java.util.regex.Pattern;

/**
 * Validator.java
 *
 * @author Howard Lim
 */
public class Validator {

	public static boolean isValidName(String name) {
		 String txt =name.trim().toUpperCase(); //to upper case
		 
            if (txt.length() == 0) {
                return false;
            }

            return Pattern.matches("^[ A-Za-z]+$", txt);
	}
	
	public static boolean isValidNRIC(String id) {
		 String txt =id.trim().toUpperCase(); //to upper case
		
		 if(!Pattern.matches("^[0-9]{12}$", txt)) return false;  //all digit and is 12 characters
		 int year = Integer.parseInt(txt.substring(0,2));
		 int month = Integer.parseInt(txt.substring(2,4));
		 int day = Integer.parseInt(txt.substring(4,6));
		 int currYear = Calendar.getInstance().get(Calendar.YEAR);
		 
		 //get the 4 digit year
		 if(year < (currYear%100)) year += (currYear/100); // become 12 + (2020/100)
		 else year += ((currYear/100) - 100); //become 97+(2000-100)
		 
		 if(month<1 || month>12) return false; //if the month is invalid
		 
		 int daysInMonth = YearMonth.of(year, month).lengthOfMonth();  //get the count of day for the month
		 if(day<1 || day > daysInMonth) return false; //invalid day
		 
		 return true;
	}
	
	
	public static boolean isValidContact(String contact) {
            String txt = contact.trim().toUpperCase();
            //can only digit, not less than 9, not more than 11, start with 01 or 08
            //to upper case
            return Pattern.matches("(^01[\\d]{7,9}$)|(^(08)[\\d]{7,8}$)", txt);
	}
	
	
	public static boolean isValidEmail(String email) {
		 String txt =email.trim(); 
		
		 //email pattern, some domain(after @) can be ip address, i added extra escape to escape the java escape key :D
		 if(!Pattern.matches("^([a-zA-Z0-9_\\-\\.]+)@(((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(\\]?)$)|(([a-zA-Z0-9\\-]+\\.)+)([a-zA-Z]{2,4})$)", txt)) 
			 return false;  
		 
		 return true;
	}
	
	public static boolean isNumeric(String count) {
		 String txt =count.trim();
		
		 //if not numeric
		 if(!Pattern.matches("^[0-9]+$", txt)) 
			 return false;  
		 
		 return true;
	}

	public static boolean isDoubleNumeric(String count) {
		String txt =count.trim();
		
		 //if not numeric
		 if(!Pattern.matches("^[0-9]+\\.*[0-9]*$", txt)) 
			 return false;  
		 
		 return true;
    }

    public static boolean isDateBeforeNow(LocalDate date) {
        return date.isBefore(LocalDate.now());
    }

    public static boolean isDateTimeBeforeNow(LocalDateTime dateTime) {
        return dateTime.isBefore(LocalDateTime.now());
    }


    public static boolean isValidAge(int age) {
        return age < 120 && age > 0;
    }

    public static boolean isWords(String txt) {
        return Pattern.matches("^[ A-Za-z]+$", txt);
    }
	
	

}
