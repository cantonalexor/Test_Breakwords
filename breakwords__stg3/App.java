/**
 * 
 */
package breakwords__stg3;

import java.util.List;
import java.util.Scanner;

/**
 * @author Alex
 * @version stage3
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dict word_dict = new Dict();
		word_dict.default_dict();
		System.out.println("Current default dictionary:");
		for (String temp : word_dict.getWordDict()) {
			System.out.print(temp+"; ");
		}
		
		System.out.println("\n**************************");
		System.out.println("Please input the words if need to add(separated by /):");
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		
		String[] newStr = str.split("/");
		for (String string : newStr) {
			word_dict.add_word(string);
		}
		
		System.out.println("**************************");
		System.out.println("Please input the sentence:");
		str = input.nextLine();
		input.close();
		
		BreakWords bw = new BreakWords();
		List<String> res = bw.wordBreak(str, word_dict.getWordDict());
		
		System.out.println("Output:");
		for(int i=0; i<res.size(); i++){
			System.out.println(res.get(i));
		}
	
	}

}
