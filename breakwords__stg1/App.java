/**
 * 
 */
package breakwords__stg1;

import java.util.List;
import java.util.Scanner;

/**
 * @author Alex
 * @version stage1
 *
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input the Sentence:");
		Scanner input = new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		
		Dict word_dict = new Dict();
		word_dict.default_dict();
		
		BreakWords bw = new BreakWords();
		List<String> res = bw.wordBreak(str, word_dict.getWordDict());
		
		System.out.println("Output:");
		for(int i=0; i<res.size(); i++){
			System.out.println(res.get(i));
		}

	}

}
