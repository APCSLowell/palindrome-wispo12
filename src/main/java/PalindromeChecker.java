import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class PalindromeChecker {
public void tester()
{
  //String lines[] = loadStrings("palindromes.txt");
  String[] lines = new String[6]; 
    try{
        File myFile = new File("palindromes.txt");
        Scanner myReader = new Scanner(myFile);
        int counter = 0;
        while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            lines[counter] = data;
            counter++;
        }
        myReader.close();
    }
    catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
    }
  System.out.println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      System.out.println(lines[i] + " IS a palindrome.");
    }
    else
    {
      System.out.println(lines[i] + " is NOT a palindrome.");
    }
  }
}
public boolean palindrome(String word)
{
 String word1="";
{
      for(int i=0;i<word.length();i++)
{
if( (Character.isLetter(word.charAt(i)))==true &&((word.substring(i,i+1).equals(" "))==false))
{
  word1=word1+word.substring(i,i+1);

}
}
 word1=word1.toLowerCase();
 
if(reverse(word).equals(word1))
{
return true;
}
else
{
  return false;
}
}
}
public String reverse(String str)
{

    String sNew = new String();
    for(int i=str.length();i>0;i--)
{
if( (Character.isLetter(str.charAt(i-1)))==true &&((str.substring(i-1,i).equals(" "))==false))
{
  sNew=sNew+str.substring(i-1,i);

}
}
  sNew=sNew.toLowerCase();
System.out.println(sNew);

    return sNew;
 
}

}
