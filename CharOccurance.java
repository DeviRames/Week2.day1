package week2.day1;

public class CharOccurance {

public static void main(String[] args) {
	
	// Check number of occurrences of a char (eg 'e') in a String
	
				String str = "welcome to chennai";
				int count = 0;
						

		// declare and initialize a variable count to store the number of occurrences
				
				// convert the string into char array
				char[] charArray = str.toCharArray();
				
				System.out.println(charArray);
				for(int i=0;i<charArray.length;i++)
				{
					if(charArray[i]=='e')
					{
						count++;
					}
				}
				
				System.out.println(count);
	
					
				}
}
