/*
	ISYS 320
	Name(s): Matthew Shelby
	Date: 4/1/2018
*/

/*
 Your expression predictions:
 
 1. 13
 2. a
 3. G
 4. 2
 
 5. GANDALF THE GRAY
 6. frodo baggins
 7. o Baggins
 8. dalf the GR
 
 9. Goondoolf the Gray
 10. Gandlaf the Gray
 11. strange1
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. correct
 2. correct
 3.  correct
 4. correct
 
 5. correct
 6. correct
 7. correct
 8. correct
 
 9. correct
 10. correct
 11. correct
 
 */
public class P1_TestStringMethods {
	public static void main(String[] args) {
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println(str1.length());
		System.out.println(str1.charAt(7));
		System.out.println(str2.charAt(0));
		System.out.println(str1.indexOf("o"));
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(4));
		System.out.println(str2.substring(3,  14));
		System.out.println(str2.replace("a",  "oo"));
		System.out.println(str2.replace("gray", "white"));
		System.out.println("str1".replaceAll("r",  "range"));
		
	}

}
