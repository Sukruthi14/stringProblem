/**
* @ author Sukruthi Boruthalupula
*/
import java.util.Scanner;
public class StringSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input_str = in.next();
		System.out.println("Please enter the Character to be removed");
		char input_char=in.next(".").charAt(0);
		//Solution1 : Without using inbuilt function
		
		
		StringSolution obj=new StringSolution();
		String soln=obj.notInbuilt(input_str, input_char);
		System.out.println("Output for method Without inbuilt function is  "+ soln);
		//Solution2 : Using inbuilt function "replace"
		soln = obj.Inbuilt(input_str, input_char);
		System.out.println("Output for inbuilt function is " + soln);
		
		
	}
	//one character at a time	
	public String notInbuilt(String input_str,char input_char)
		{
		// To add characters to the output string	
		StringBuilder sb = new StringBuilder();
			//To calculate the string length
			int len = input_str.length();
			for (int i =0; i< len; i++)
			{
				if (input_str.charAt(i)!= input_char)
						{
							sb.append(input_str.charAt(i));
						
						}
			}
			return sb.toString();
		}
		
	public String Inbuilt(String input_str,Character input_char)
	
	{
		String soln = input_str.replace(input_char.toString(), "");
		return soln;
	}
	

}


