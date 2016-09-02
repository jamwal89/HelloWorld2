
import java.util.Scanner;
  
 public class PetQuestions
 {
     public static void main( String[] args )
    {
        String name;
        String breed;
        int age = 5;
        
        Scanner keyboard = new Scanner(System.in);
        name = keyboard.next();
        breed = keyboard.next();
        System.out.print( "Greetings. What is your pet's name? " + name);
        
 
        System.out.print( "What kind of animal is " + name + "? " );
        System.out.print(name + "is a " + breed);
        System.out.print( "How old is " + name + "? ");
        
        System.out.println( name + " is your " + breed + " and it is " + age );
     }
 }
