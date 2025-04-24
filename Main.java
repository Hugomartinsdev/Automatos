import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main{
	public static void main(String[] args){
   	 
    	Scanner scan = new Scanner(System.in);
    	System.out.println("digite a string do binário: ");
    	String input = scan.nextLine();
   	 
       	Pattern pattern = Pattern.compile("[0-1]+");
    	Matcher matcher = pattern.matcher(input);
   	 
    	if (matcher.matches()) {
            System.out.println("é binario");
        } else {
            System.out.println("nao é binario");
		}
	}
}