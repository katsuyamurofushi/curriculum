package check;

import constants.Constants;

public class Main {
	private String firstname = "伊東";
	private String lastname = "大輔";
	
	private void printName() {
		System.out.println("printNameメソッドは→"+this.firstname + this.lastname);
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String name1 = Constants.CHECK_CLASS_JAVA;
		String mastername1 = Constants.CHECK_CLASS_HOGE;
		String name2 = Constants.CHECK_CLASS_R2D2;
		String mastername2 = Constants.CHECK_CLASS_LUKE;
		
		Main name = new Main();
		Pet pt = new Pet(name1,mastername1);
		RobotPet rpt = new RobotPet(name2, mastername2);

		name.printName();
		

		pt.getName();
		pt.getMasterName();
		pt.introduce();
		
		rpt.getName();
		rpt.getMasterName();
		rpt.introduce();
		
		
	}

}
