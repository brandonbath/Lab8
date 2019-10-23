package co.grandcircus;

import java.util.Scanner;

public class LabNumber8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String cont = "yes";

		while (cont.equals("yes")) {

			System.out.println(
					"Welcome to our Java class. Which student would you like to learn more about? (Enter a number between 1 and 10: ");
			int studentNum = scan.nextInt();
			oneToTenInt(studentNum, scan);

			String[] personName = { "Kevin", "Chris", "Sean", "Nina", "Amber", "Adam", "Brandon", "Devin", "Matt",
					"Sam" };
			// System.out.println(Arrays.toString(personName));
			String[] favoriteFood = { "steak pie", "Spag Heddy", "chicken parmesan", "oysters", "lasagna", "swordfish",
					"scallops", "Burger King", "steak", "McDonald's" };
			// System.out.println(Arrays.toString(favoriteFood));
			String[] homeTown = { "Detroit", "Grand Rapids", "Kalamzoo", "Ann Arbor", "Gross Point", "Dearborn",
					"Mason", "Flint", "Livonia" };

			String strName = personName[studentNum - 1];
			String strFood = favoriteFood[studentNum - 1];
			String strTown = homeTown[studentNum - 1];
			System.out.println("That's " + strName
					+ "! Do you want to know about their favorite food, or where they're from? (input food or hometown): ");
			scan.nextLine();
			String userChoice = scan.nextLine();

			boolean isValid = false;
			do {
				if (userChoice.equalsIgnoreCase("food")) {
					System.out.println();
					System.out.println(strName + "'s favorite food is " + strFood + ".");
					break;
				} else if (userChoice.equalsIgnoreCase("hometown")) {
					System.out.println();
					System.out.println(strName + "'s hometown is " + strTown + ".");
					break;
				} else {
					System.out.println("Invalid input. Please enter FOOD or HOMETOWN.");
					userChoice = scan.nextLine();
					isValid = false;
				}
			} while (isValid == false);

			// your logic should stop here if it doesn't need to be included in the
			// loop
			System.out.println("Would you like to learn about another student? (yes/no)");
			cont = scan.next();
		}
	}

	// this is our indication that the program has ended
	// System.out.println("Goodbye!");scan.close();

// method to confirm int is 1-10
	public static boolean oneToTenInt(int studentNum, Scanner scan) {
		boolean isValid = false;
		do {
			if (studentNum <= 10 && studentNum >= 1) {
				isValid = true;
			} else {
				System.out.println("That student doesn't exist. Please try again. (Enter a number between 1-10): ");
				System.out.println(studentNum);
				studentNum = scan.nextInt();
				System.out.println(studentNum);
				isValid = false;
			}
		} while (isValid == false);
		return true;

	}

}
