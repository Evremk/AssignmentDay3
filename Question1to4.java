package day3_assignments;

/*
Question-1

Declare and initialize an integer variable called count, 
and write a statement that displays the value of count on the console

Question-2

Declare and initialize a String variable called message, and write a statement to display its value to console.

Question-3

Declare two variables. One of them integer called num and the other one is double called cost. 
Print both values (num first, then cost), separated by a space on a single line.

Question-4

Assume that word is a String variable and already has a value.
Write a statement to display the message "Today's Word-Of-The-Day is: " followed by the value of the word.
The message and the value of word should appear together, on a single line.

Ex:

Today's Word-Of-The-Day is: Java


/*
 * 
 */
//Question 1---------------------------------------------------------------------
public class Question1to4 {

	public static void main(String[] args) {
		
		int count=5;
		
		System.out.println(count);
		
//Question 2--------------------------------------------------------------------
		String message = "c";
		System.out.println(message);
		 
//Question 3---------------------------------------------------------------------
		int num=10;
		double cost=20;
		
		System.out.println(num+" "+cost);
//Question 4----------------------------------------------------------------------
		
        String word="dream";
        System.out.println("Today's Word-Of-The-Day is: "+ word);
        
	}


}





