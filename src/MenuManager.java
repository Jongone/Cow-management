import java.util.Scanner;

public class MenuManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    //필드를 통해 인스턴스를 계속 사용하지 않고 사용하게 함
		Cowmanager Cowmanager = new Cowmanager(sc); 
		
		int num = 5;

		while(num!=6) {
			System.out.println("-Select Menu-");
			System.out.println("1.Add Cow");
			System.out.println("2.Delete Cow");
			System.out.println("3.Edit Cow");
			System.out.println("4.View Cow");
			System.out.println("5.Sold List");
			System.out.println("6.Exit");
			System.out.println("Select one number between 1-6:");
			num = sc.nextInt();
			if (num == 1) {
				Cowmanager.addCow();
			}
			else if (num == 2) {
				Cowmanager.deleteCow();
			}
			else if (num == 3) {
				Cowmanager.editCow();
			}
			else if (num == 4) {
				Cowmanager.viewCow();
			}
			else if (num == 5) {
				Cowmanager.soldList();
			}
			else {
				continue;
			}
		}
	}

}
	
