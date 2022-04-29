package week2.day1;


public class Palindrome {
	public static void main(String[] args) {
		
	String rev = "";
	String input ="MADAM";
	for (int i=input.length()-1;i>=0;i--) {
System.out.println(input.charAt(i));	
rev=rev+input.charAt(i);
	}	
	System.out.println(rev);

	if(input.equals(rev)) {
		System.out.println("Is Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
}
}
