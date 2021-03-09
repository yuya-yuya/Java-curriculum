package check;

import constants.Constants;

public class Check {
	private static String firstName = "yuya";
	private static String lastName = "yamada";

	public static void main(String[] args) {

		Constants a = new Constants();
		RobotPet b = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		Pet c = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);

		System.out.println(printName(firstName, lastName));
		c. introduce();
		b.introduce();

	}

	private static String printName(String firstName, String lastName) {
		return "printNameメソッド→" + lastName +firstName;
	}

}

