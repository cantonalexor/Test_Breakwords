/**
 * Dictionary class
 */
package breakwords__stg3;

import java.util.HashSet;
import java.util.Set;

public class Dict {
	private Set<String> wordDict = new HashSet<String>();
	
	public Set<String> getWordDict() {
		return wordDict;
	}

	public void setWordDict(Set<String> wordDict) {
		this.wordDict = wordDict;
	}

	public void default_dict() {
        wordDict.add("i");
        wordDict.add("like");
        wordDict.add("sam");
        wordDict.add("sung");
        wordDict.add("samsung");
        wordDict.add("mobile");
        wordDict.add("ice");
        wordDict.add("cream");
        wordDict.add("and");
        wordDict.add("man go");
	}
	
	public void add_word(String word) {
		wordDict.add(word);
	}
}
