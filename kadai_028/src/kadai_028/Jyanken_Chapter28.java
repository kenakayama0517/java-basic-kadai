package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	private HashMap<String,String>rsp = new HashMap<String,String>();
	String pcHand;
	String input;
	
	public void addHands() {
		rsp.put("r","グー");
		rsp.put("s","チョキ");
		rsp.put("p","パー");
	}

	
	public String getMyChoice() {
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		
		Scanner scanner = new Scanner(System.in); 
		
		input = scanner.next();
		
		if (input.equals("r")) {
			System.out.println(input);
		} else if(input.equals("s")){
			System.out.println(input);
		} else if (input.equals("p")) {
			System.out.println(input);
		} else {

			throw new IllegalArgumentException("最初からやり直してください");
		}
	


		
			
		return input;
		
		
		
		//自分のじゃんけんの手を入力する
	}
	
	
	public String getRandom() {	
		int index = (int)Math.floor(Math.random()*3);
		
		switch(index) {
		case 0 :
			pcHand ="r";
			break;
		case 1 :
			pcHand ="s";
			break;
		case 2 :
			pcHand="p";
			break;
		}
		
		return pcHand;
	
	
		
		//対戦相手のじゃんけんの手を乱数で選ぶ
		
	}
	
	
	public void playGame() {
		System.out.println("自分の手は"+rsp.get(input)+","+"対戦相手の手は"+rsp.get(pcHand));
		
		if(input.equals(pcHand)) {
			System.out.println("あいこです");
		} else if((input.equals("r") && pcHand.equals("s"))||(input.equals("s") && pcHand.equals("p"))||(input.equals("p")&&pcHand.equals("r"))) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
		
		//自分の手はパー,対戦相手の手はグー
		//自分の勝ちです
		
	}
	
}