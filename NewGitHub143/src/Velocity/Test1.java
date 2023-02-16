package Velocity;

public class Test1 {

	public static void main(String[] args) {
		
		
		
		String a = new String("Nikhil");
		String b = "Nikhil";

		System.out.println(a.toUpperCase());   //  toUpperCase for convert string is capital
		System.out.println(b.toLowerCase());   // toLowerCas for convert string is samll
		
		System.out.println(b.concat(a));   //  concat for combine two String
		System.out.println(a.length());      //  length For Calculate The string size
		
		
		String c = "  Jayesh  ";
		String d = "";
		String e = "Velocity";
		
		System.out.println(c.trim());      // trim Methods for include space print in the String
		System.out.println(d.isEmpty());   // isEmpty Methods are use for the String is empty or not and its out put show in boolean

	    System.out.println(b.charAt(3));
	    System.out.println(a.indexOf('k'));
	    
	    System.out.println(a.equals(b));
	    System.out.println(e.replace('V', 'v'));
	   
	    String f = "25874136";
	    
	    
	    
		}
	}
	
	

