package kadai_026;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Jyanken_Chapter26 C26 = new Jyanken_Chapter26();
		String myHand = C26.getMyChoice();
		String opponentHand = C26.getRandom();
		C26.playGame(myHand,opponentHand);
	}

}
