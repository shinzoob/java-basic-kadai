package kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 dic = new Dictionary_Chapter21();
		String[] searchWords = setWords();
		
		String targetWord = "";
		String targetMeaning = "";

		for (int i = 0; i < searchWords.length; i++) {
			targetWord = searchWords[i];
			targetMeaning = dic.outputMeaning(targetWord);
			if(targetMeaning == null) {
				System.out.println(targetWord + "は辞書に存在しません");
			}
			else {
				System.out.println(targetWord + "の意味は" + targetMeaning);
			}
		}
	}
	
	public static String[] setWords() {
		String[] words = new String[4];
		words[0] = "apple";
		words[1] = ("banana");
		words[2] = ("grape");
		words[3] = ("orange");
		return words;
	}
}
