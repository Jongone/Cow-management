  import java.util.Scanner;

public class MenuManager {    // �׳� �޴����� ������� �Է��� �̷��� �ȴ� �ϴ� �͸� ó������ �� �ܿ� �������� �Ŵ� Cowmanager Ŭ���� ���� �ϰ� ��.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);    //�ʵ带 ���� �ν��Ͻ��� ��� ������� �ʰ� ����ϰ� ��
		Cowmanager Cowmanager = new Cowmanager(sc);  
		
		int num = 4;

		while(num!=5) {
			System.out.println("-Select Menu-");
			System.out.println("1.Add Cow");
			System.out.println("2.Delete Cow");
			System.out.println("3.Edit Cow");
			System.out.println("4.View Cows");
			System.out.println("5.Exit");
			System.out.println("Select one number between 1-5:");
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
				Cowmanager.viewCows();
			}
			else {
				continue;
			}
		}
	}

}
	
