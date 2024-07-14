package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	HashMap<String,String> HasMap = new HashMap<String,String>(){
	};
	
	 Dictionary_Chapter21() {
		HasMap.put("apple","りんご");
		HasMap.put("banana","バナナ");
		HasMap.put("peach","桃");		
		HasMap.put("lemon","レモン");
		HasMap.put("pear","梨");
		HasMap.put("kiwi","キウィ");
		HasMap.put("strawberry","いちご");
		HasMap.put("grape","ぶどう");
		HasMap.put("muscat","マスカット");
		HasMap.put("cherry","さくらんぼ");
	}
	
//	"word→意味"
	
	public String outputMeaning(String word) {
		return HasMap.get(word);
	}
	
}
