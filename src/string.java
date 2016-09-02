import java.util.Scanner;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		 
		 //String myAnswer = keyboard.next(); 
		 String lastName, firstinitial,streetname,streettype = null;
		 String houseNumber;
		 String city;
		 lastName=keyboard.next();
		 firstinitial=keyboard.next();
		 houseNumber= keyboard.next();
		 streetname= keyboard.next();
		 city=keyboard.next();
		 keyboard.close();
		 
		 System.out.print(firstinitial + " " + lastName + " " + houseNumber + " "); 
		 System.out.println(streetname + " " + streettype + " " + city);
	}

}
