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
		System.out.println("Cow Birth(출생년도):");
		cow.birth = sc.nextInt();
		System.out.println("Cow Sex(암/수):");
		String cs= sc.next();
		if(cs.equals("암")) {
			cow.sex = cs;
		}
		else if (cs.equals("수")) {
			cow.sex = cs;
		}
		else {
			System.out.println("잘못된 정보 입니다.");
			return;
		}
		System.out.println("Cow weight(kg):");
		cow.weight = sc.nextDouble();
	}
	public void deleteCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		if (cow == null) {      // 입력받은 소의 아이디가 없다면  ??cow != cowid 해도되나??
			System.out.println("아직 등록되지 않은 소입니다.");
			return; //생성이 안되있는 객체면 시스템을 종료하라.
		}
		if (cow.id == cowid) {  //입력받은 소의 아이디가 같다면(있다면)
			cow = null;        //cow 클래스 를 지운다. =소의 정보를 지운다. =cow안에 id sex weight 정보가 있다.
			System.out.println("이 소의 정보를 삭제하였습니다.");
		}
	}
	public void editCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
		
		if (cow.id == cowid) {   //입력받은 소의 아이디가 있다면 
			System.out.println("소의 정보를 변경 하겠습니다.");
			int num = 2;

			while(num!=5) {
				System.out.println("-어떤 항목을 선택하시겠습니까?-");
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
					System.out.println("Cow Birth(출생년도):");
					cow.birth = sc.nextInt();
				}
				else if (num == 3) {
					System.out.println("Cow Sex(암/수):");
					String cs= sc.next();
					if(cs.equals("암")) {
						cow.sex = cs;
					}
					else if (cs.equals("수")) {
						cow.sex = cs;
					}
					else {
						System.out.println("잘못된 정보 입니다.");
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
			System.out.print("소의 정보 ");
		    cow.printinfo();
		}
	}
	public void soldList() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();
	}

}
