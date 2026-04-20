package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
		
	private HashMap<String, String>dictionaryMap = new HashMap<String,String>();
	
	public void addWords() {
		dictionaryMap.put("apple","りんご");
		dictionaryMap.put("peach","桃");
		dictionaryMap.put("banana","バナナ");
		dictionaryMap.put("lemon","レモン");
		dictionaryMap.put("pear","梨");
		dictionaryMap.put("kiwi","キウィ");
		dictionaryMap.put("strawberry","いちご");
		dictionaryMap.put("grape","ぶどう");
		dictionaryMap.put("muscut","マスカット");
		dictionaryMap.put("cherry","さくらんぼ");		
	}
	
	public void search(String word) {
		if(dictionaryMap.containsKey(word)) {
			System.out.println(word+"の意味は"+dictionaryMap.get(word)+"です");
		} else {
			System.out.println(word+"は辞書に存在しません");
		}		
	}

}


