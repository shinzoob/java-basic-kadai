package kadai_026;

import java.util.HashMap;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	public HashMap<String,String> Hand;
	
	public Jyanken_Chapter26() {
		Hand = new HashMap<String,String>();
		Hand.put("r","グー");
		Hand.put("s","チョキ");
		Hand.put("p","パー");
	}
	
	
	public String getMyChoice() throws NoSuchElementException {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		do {
			Scanner scanner = new Scanner(System.in);
			String input = scanner.next();
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				return input; // r,s,p
			}
			System.out.println("rまたはsまたはpを入力してください");
		} while(true);
	}

	public String getRandom() {
		int random = (int)Math.floor(Math.random() * 3);
		String opponentHand = "";
		switch (random) {
			case  0 : 
				opponentHand = "r";
				break;
			case  1 : 
				opponentHand = "s";
				break;
			case  2 : 
				opponentHand = "p";
				break;
		}
		return opponentHand; // r,s,p
	}
	
	public void playGame(String myHand, String opponentHand) {
		System.out.println("自分の手は" + Hand.get(myHand) + "," + "対戦相手の手は" + Hand.get(opponentHand));
		if(myHand.equals("r")) {
			if(opponentHand == "s") {
				System.out.println("自分の勝ちです");
			}else if(opponentHand.equals("p")) {
				System.out.println("自分の負けです");
			}else {
				System.out.println("あいこです");
			}
		}
		else if(myHand .equals("s")) {
			if(opponentHand.equals("p")) {
				System.out.println("自分の勝ちです");
			}else if(opponentHand.equals("r")) {
				System.out.println("自分の負けです");
			}else {
				System.out.println("あいこです");
			}
		}
		if(myHand.equals("p")) {
			if(opponentHand.equals("r")) {
				System.out.println("自分の勝ちです");
			}else if(opponentHand.equals("s")) {
				System.out.println("自分の負けです");
			}else {
				System.out.println("あいこです");
			}
		}
	}
}
