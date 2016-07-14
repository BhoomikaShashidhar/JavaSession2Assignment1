
	import java.util.Scanner; 
public class Vote {

	public static void main(String args[]){
		System.out.println("Please enter the age of the person");
		Scanner scn = new Scanner(System.in);
		int age = scn.nextInt();
		if(age>=18)
		{
			System.out.println("Person is eligible to vote");
		}
		else
			{System.out.println("Person is not eligible to vote");
			}
		}

	}
