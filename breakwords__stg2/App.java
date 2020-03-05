/**
 * 
 */
package breakwords__stg2;

import java.util.List;
import java.util.Scanner;

/**
 * @author Alex
 * @version stage2
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dict word_dict = new Dict();
		
		System.out.println("Please input the words(separated by /):");
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		
		String[] newStr = str.split("/");
		for (String string : newStr) {
			word_dict.add_word(string);
		}
		
//		for (String temp : word_dict.wordDict) {
//			System.out.println(temp);
//		}
		
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
