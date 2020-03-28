import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 6;

		while(num!=7) {
			System.out.println("-Select Menu-");
			System.out.println("1.Add Cow");
			System.out.println("2.Delete Cow");
			System.out.println("3.Edit Cow");
			System.out.println("4.View Cow");
			System.out.println("5.Sold List");
			System.out.println("6.Show Menu");
			System.out.println("7.Exit");
			System.out.println("Select one number between 1-7:");
			num = sc.nextInt();
			if (num == 1) {
				addCow();
			}
			else if (num == 2) {
				deleteCow();
			}
			else if (num == 3) {
				editCow();
			}
			else if (num == 4) {
				viewCow();
			}
			else if (num == 5) {
				soldList();
			}
			else {
				continue;
			}
		}
	}
	public static void addCow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		System.out.println("Cow Sex:");
		String cowsex = sc.next();
		System.out.println("Cow weight:");
		double cowweight = sc.nextDouble();
	}
	public static void deleteCow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}
	public static void editCow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}
	public static void viewCow() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}
	public static void soldList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}
}
	
