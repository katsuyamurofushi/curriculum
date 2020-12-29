package check;

/**
*
* 課題①
*【Check.java】にてフィールド変数firstNameとlastNameを宣言し、
*firstName →　自分の名字　lastName →　自分の名前で初期化しなさい。
*なお、変数のアクセス修飾子は「private」とする。
*
* 課題②
* 【Check.java】にてfirstNameとlastNameを引数で受け取って、
*連結して表示させるメソッド「printName」を作成しなさい。
*作成した関数のアクセス修飾子は「private」とする。
*
* 課題③
*【Check.java】にてPetクラスとRobotPetクラスをインスタンス化して、
*完成イメージを出力させなさい。
*/

import constants.Constants;

public class Check {

	private static String firstName = "室伏";
	private static String lastName = "克哉";
	private static void printName() {
		System.out.println("printNameメソッド → " + firstName + lastName);
	}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check.printName();

		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();

		RobotPet rpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		rpet.introduce();


	}

}
