public class PalindromeDetector
{
public static void main(String[] args){
String[] testStrings = { "Able was I ere I saw Elba","Desserts I stressed","Stay safe stay healthy","Kayak" };
for (int i = 0; i < testStrings.length; i++){
System.out.print("\"" + testStrings[i] + "\"");
if (isPalindrome(testStrings[i].toUpperCase()))
System.out.println(" is a palindrome.");
else
System.out.println(" is not a palindrome.");
      }
   }
public static boolean isPalindrome(String str)
{
String ore=str;//String variable that holds a string value
String reverse="";//Strong variable
for(int i =ore.length()-1 ;i >= 0; i--){//a loop that iterates for a given nuber of times
	reverse += ore.charAt(i);//adds up and assigns a string value to the String variablr
}
boolean pal=true;//a boolean statement
for(int i =0 ;i < ore.length(); i++){//a loop that iterates for a given nuber of times
	if(ore.charAt(i) != reverse.charAt(i)){//a condition that must be followed
		pal=false;//sets the boolean value to false
}
}
	return pal;
}
}