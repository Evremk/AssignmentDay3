//___________________________________________________________________________________________________


package day3_assignments;

public class Question5to10 {

	public static void main(String[] args) {
		/* Question-5 Declare and initialize two variables 
		 * called first and second. Write a single statement 
		 * that will print the message "first is " followed by the value of first,
		 *  and then space, followed by "second = ", followed by the value of the second.
		 * Ex: first is 55 second = 123
		 /*
		  * 
		  */


		int first= 120;
		int second= 99;
		
		System.out.println("first is "+first+" second = "+second);
		System.out.println();
		
/*Question 6----------------------------------------------------------------------
 * Five friends are going to the theater. 
They have purchased a row of five seats with an aisle on either end.
Declare 5 String variables and store their names.
James doesn't want to sit next to Jill
Betty and Herb are dating and want to sit next to each other
Bob wants to sit on a left side aisle
James wants to sit on the aisle
Provide a seating order that conforms to the above rules. An example of an invalid seating order is:
James, Betty, Herb, Bob, Jill

The above arrangement is invalid because: Bob is not sitting on the left aisle.

Specify the seating order as the names separated by commas and space (as in the above example). 
Use variables and print names in the right order.

		 */
		String name1="James";
		String name2="Jill";
		String name3="Betty";
		String name4="Herb";
		String name5="Bob";
		
		System.out.println(name1+", "+name3+", "+name4+", "+name2+", "+name5);
		System.out.println();
		
		
/*___________________________________________________________________________________________________
 * Question-7

Declare and initialize an integer variable i and a floating-point variable f.  
Write a statement that writes both of their values to console in the following format:
i=value-of-i f=value-of-f
Ex:
Assume i = 9 and f = 33.4

The output should be:
i=9 f=33.4
 */
	
	int i=9;
	float f=33.4f;
	
	System.out.println("i="+i+" f="+f);
	
/* ________________________________________________________________________________________________________
 * Question-8

Declare and assign 2 String variables.
They will hold different programming language names.

Using those variables print the message exactly like below.

Ex:
Assume lan1 = "Java" and lan2 = "SQL"

You need to print exactly:

I will learn "Java" and "SQL" at CybertekSchool.
 */
	
		String lan1="Java";
		String lan2="SQL";
		
		System.out.println("I will learn \""+lan1+"\" and \""+lan2+"\" at CybertekSchool.");
		
/*__________________________________________________________________________________________________________
 * Question-9

Declare a byte variable named steps and assign 100
Declare a short variable named miles and assign 5000
Declare an int variable named count and assign 1000000
Declare a long variable named population and assign 3434455667
*/

		byte steps=100;
		short miles=5000;
		int count=1_000_000;
		long population=3_434_455_667l;
		
/*____________________________________________________________________________________________________________
 * Question-10

In this assignment, you will write code to put together the time of day.

Like this: 12:24:33 PM

1. Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a String ("AM" or "PM")

2. An instructor will set different values to your variables

3. Using the variables and concatenation, print values in the format mentioned above.

I don´t know how to do it? I assume that I need to use some conditionals we did not learn yet*/
		
		
		int Hour,Minute,Second;
		String am Pm
		
	}

}
