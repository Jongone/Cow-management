import java.util.Scanner;

public class Cowmanager {
	Cow cow;
	
	Scanner sc; 
	
	Cowmanager(Scanner sc){
		this.sc = sc; 
		
	}
	
	public void addCow() {
		cow = new Cow();
		System.out.println("Cow ID:");
		cow.id = sc.nextInt();
		System.out.println("Cow Birth(����⵵):");
		cow.birth = sc.nextInt();
		System.out.println("Cow Sex(��/��):");
		String cs= sc.next();
		if(cs.equals("��")) {
			cow.sex = cs;
		}
		else if (cs.equals("��")) {
			cow.sex = cs;
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
			return;
		}
		System.out.println("Cow weight(kg):");
		cow.weight = sc.nextDouble();
	}
	public void deleteCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		if (cow == null) {      // �Է¹��� ���� ���̵� ���ٸ�  ??cow != cowid �ص��ǳ�??
			System.out.println("���� ��ϵ��� ���� ���Դϴ�.");
			return; //������ �ȵ��ִ� ��ü�� �ý����� �����϶�.
		}
		if (cow.id == cowid) {  //�Է¹��� ���� ���̵� ���ٸ�(�ִٸ�)
			cow = null;        //cow Ŭ���� �� �����. =���� ������ �����. =cow�ȿ� id sex weight ������ �ִ�.
			System.out.println("�� ���� ������ �����Ͽ����ϴ�.");
		}
	}
	public void editCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		
		if (cow.id == cowid) {   //�Է¹��� ���� ���̵� �ִٸ� 
			System.out.println("���� ������ ���� �ϰڽ��ϴ�.");
			int num = 2;

			while(num!=5) {
				System.out.println("-� �׸��� �����Ͻðڽ��ϱ�?-");
				System.out.println("1.Edit ID");
				System.out.println("2.Edit Birth");
				System.out.println("3.Edit Sex");
				System.out.println("4.Edit Weight");
				System.out.println("5.Exit");
				System.out.println("Select one number between 1-5:");
				num = sc.nextInt();
				if (num == 1) {
					System.out.println("Cow ID:");
					cow.id = sc.nextInt();
				}
				else if (num == 2) {
					System.out.println("Cow Birth(����⵵):");
					cow.birth = sc.nextInt();
				}
				else if (num == 3) {
					System.out.println("Cow Sex(��/��):");
					String cs= sc.next();
					if(cs.equals("��")) {
						cow.sex = cs;
					}
					else if (cs.equals("��")) {
						cow.sex = cs;
					}
					else {
						System.out.println("�߸��� ���� �Դϴ�.");
						return;
					}
				}
				else if (num == 4) {
					System.out.println("Cow weight(kg):");
					cow.weight = sc.nextDouble();
				}
				else {
					continue;
				}
			}
		}
	}
	public void viewCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		
		if (cow.id == cowid) {
			System.out.print("���� ���� ");
		    cow.printinfo();
		}
	}
	public void soldList() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}

}
