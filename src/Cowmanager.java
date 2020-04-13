import java.util.ArrayList;
import java.util.Scanner;

public class Cowmanager {  // 2. �޴��� ��ȣ�׸��� ������ �Է��ϴ� ������ 
	// ���� :Cow cow; (4����)  //���� ������ ���� ����. (����: Ŭ���� �̸�(Cow) ������(cow))
	ArrayList<Cow> cows = new ArrayList<Cow>();
	Scanner sc;   //main �Լ��� �ʵ忡�� ���ǰ� �Ǿ��� ������, ���⼭ ���ο� �ν��Ͻ��� ���Ǹ� ���� �ʾƵ� �ȴ�.     
	
	Cowmanager(Scanner sc){
		this.sc = sc; 
		
	}
	
	public void addCow() {
		// ���� :cow = new Cow(); (4����) //���ο� ��ü�� ����� �κ��� �ʿ��ؼ� ���� ������
		Cow cow =new Cow(); //���� Cow cow; �� �����Ǽ� ������ �ٲٰ� �ν��Ͻ��� �ٽ� �־��ذ� (������ ����)
		System.out.println("Cow ID:");
		cow.id = sc.nextInt();
		System.out.println("Cow Birth(����⵵):");
		cow.birth = sc.nextInt();
		System.out.println("Cow Sex(��/��):");
		String cs= sc.next(); //�� �κ� ������� �Է��� �޾� ���Է°��� �ٸ� Ŭ������ ����ִ� ������ �� ������� �ѹ� ����! ���� ���� ���α׷� ... �̰Ŵ� ���� �ù����̼� 3���� �������� ���´�
		
		if(cs.equals("��")) {
			cow.sex = cs;
		}
		else if (cs.equals("��")) {
			cow.sex = cs;
		}
		else {
			System.out.println("�߸��� ���� �Դϴ�.");
			return;                                    //----�̺κб���----
		}
		System.out.println("Cow weight(kg):");
		cow.weight = sc.nextDouble();
		
		cows.add(cow); // (4����) ����� �ϳ� ���� �� ��Ͽ� ��������** �ؼ�1. Cows ��� -- �ؼ�2.add( ) ��ȣ���� ������ �߰�.**
	}
	public void deleteCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	  
		int index = -1;
		for (int i = 0 ; i <cows.size();i++) {
			if (cows.get(i).id == cowid) { 
				index = i;  
				break;
			}
		}
		if (index>=0) { //index�� 0���� Ŀ���� �Ҹ� ã������. ����Ʈ�ϱ� ��ã���� ��������
			cows.remove(index);
			System.out.println("Cow ID "+cowid+" �� ���� �Ǿ����ϴ�.");
		}
		else {
			System.out.println("�׷� Cow ID�� ã�� ���߽��ϴ�.");
			return;    
		}
		
		/* (4����) if (cow == null) {      // �Է¹��� ���� ���̵� ���ٸ�  ??cow != cowid �ص��ǳ�??---> �غôµ� �� �ȵŴ°���??
			System.out.println("���� ��ϵ��� ���� ���Դϴ�.");
			return; //������ �ȵ��ִ� ��ü�� �ý����� �����϶�.
		}
		if (cow.id == cowid) {  //�Է¹��� ���� ���̵� ���ٸ�(�ִٸ�)
			cow = null;        //cow Ŭ���� �� �����. =���� ������ �����. =cow�ȿ� id sex weight ������ �ִ�.
			System.out.println("�� ���� ������ �����Ͽ����ϴ�.");
		} */
	}
	public void editCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		
		for (int i = 0 ; i <cows.size();i++) {
			Cow cow = cows.get(i);
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
					} //else
			   }  // while 
				break; //if �� ���������� ��������� 
		    }//if 
		}//for
	}
	public void viewCows() {
//		System.out.println("Cow ID:");
//		int cowid = sc.nextInt();
		for (int i = 0 ; i <cows.size();i++) {
			cows.get(i).printinfo();       //(4����) ����� ����� ��� �ϱ� ������ �ݺ����� ����ؼ� ����ϴ� ��.
		}
	/*	if (cow.id == cowid) {
			System.out.print("���� ���� ");
		    cow.printinfo();
		}
		else {
			System.out.print("�������� �ʴ� ID�Դϴ�."+"\n");
			return;
		} */
	}}
