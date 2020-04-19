import java.util.ArrayList;
import java.util.Scanner;

import cow.BullCow;
import cow.Cow;

public class Cowmanager {  // 2. �޴��� ��ȣ�׸��� ������ �Է��ϴ� ������ 
	// ���� :Cow cow; (4����)  //���� ������ ���� ����. (����: Ŭ���� �̸�(Cow) ������(cow))
	ArrayList<Cow> cows = new ArrayList<Cow>();
	Scanner sc;   //main �Լ��� �ʵ忡�� ���ǰ� �Ǿ��� ������, ���⼭ ���ο� �ν��Ͻ��� ���Ǹ� ���� �ʾƵ� �ȴ�.     

	Cowmanager(Scanner sc){
		this.sc = sc; 
	}//������

	public void addCow() {
		// ���� :cow = new Cow(); (4����) //���ο� ��ü�� ����� �κ��� �ʿ��ؼ� ���� ������
		//���� Cow cow; �� �����Ǽ� ������ �ٲٰ� �ν��Ͻ��� �ٽ� �־��ذ� (������ ����)
		int kind =0;
		Cow cow;
		while (kind != 1&& kind !=2) {
			System.out.println("--Cow Kind--");
			System.out.println("1. for Milk Cow");
			System.out.println("2. for Bull");
			System.out.println("Select number for Cow Kind between 1 and 2:");
			kind = sc.nextInt();
			if (kind==1) {
				cow =new Cow();
				cow.getUserInput(sc);
				cows.add(cow);
				break;
			}
			else if(kind==2) {
				cow =new BullCow();
				cow.getUserInput(sc);
				cows.add(cow);  //�ϳ� ����� �ϳ� �߰��ϰ� ���� ����
				break;
			}
			else {
				System.out.println("Select number for Cow Kind between 1 and 2:");
			}
		}

//		System.out.println("Cow ID:");
//		int id = sc.nextInt();
//		System.out.println("Cow Birth(����⵵):");
//		int birth = sc.nextInt();
//		System.out.println("Cow Sex(��/��):");
//		String sex = sc.next(); //�� �κ� ������� �Է��� �޾� ���Է°��� �ٸ� Ŭ������ ����ִ� ������ �� ������� �ѹ� ����! ���� ���� ���α׷� ... �̰Ŵ� ���� �ù����̼� 3���� �������� ���´�
//		System.out.println("Cow weight(kg):");
//		double weight = sc.nextDouble();

	//	cows.add(cow); // (4����) ����� �ϳ� ���� �� ��Ͽ� ��������** �ؼ�1. Cows ��� -- �ؼ�2.add( ) ��ȣ���� ������ �߰�.**
	}
	public void deleteCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();

		int index = -1;
		for (int i = 0 ; i <cows.size();i++) {
			if (cows.get(i).getId() == cowid) { 
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
			if (cow.getId() == cowid) {   //�Է¹��� ���� ���̵� �ִٸ� 
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
						int id = sc.nextInt();
						cow.setId(id);
					}
					else if (num == 2) {
						System.out.println("Cow Birth(����⵵):");
						int birth = sc.nextInt();
						cow.setBirth(birth);
					}
					else if (num == 3) {
						System.out.println("Cow Sex(��/��):");
						String sex= sc.next();
						cow.setSex(sex);
					}
					else if (num == 4) {
						System.out.println("Cow weight(kg):");
						double weight = sc.nextDouble();
						cow.setWeight(weight);
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
	}
}
