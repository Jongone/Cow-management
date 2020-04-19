import java.util.ArrayList;
import java.util.Scanner;

import cow.BullCow;
import cow.Cow;

public class Cowmanager {  // 2. 메뉴의 번호항목의 내용을 입력하는 공간임 
	// 기존 :Cow cow; (4주차)  //소의 정보가 들어가는 공간. (형식: 클래스 이름(Cow) 변수명(cow))
	ArrayList<Cow> cows = new ArrayList<Cow>();
	Scanner sc;   //main 함수의 필드에서 정의가 되었기 때문에, 여기서 새로운 인스턴스로 정의를 하지 않아도 된다.     

	Cowmanager(Scanner sc){
		this.sc = sc; 
	}//생성자

	public void addCow() {
		// 기존 :cow = new Cow(); (4주차) //새로운 객체를 만든는 부분이 필요해서 새로 선언함
		//위에 Cow cow; 가 삭제되서 위에거 바꾸거 인스턴스로 다시 넣어준거 (간단한 내용)
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
				cows.add(cow);  //하나 만들고 하나 추가하고 각각 과정
				break;
			}
			else {
				System.out.println("Select number for Cow Kind between 1 and 2:");
			}
		}

//		System.out.println("Cow ID:");
//		int id = sc.nextInt();
//		System.out.println("Cow Birth(출생년도):");
//		int birth = sc.nextInt();
//		System.out.println("Cow Sex(암/수):");
//		String sex = sc.next(); //이 부분 사용자의 입력을 받아 그입력값을 다른 클래스에 집어넣는 과정을 잘 만든거임 한번 보자! 내가 만든 프로그램 ... 이거는 차량 시물레이션 3주차 과제에도 나온다
//		System.out.println("Cow weight(kg):");
//		double weight = sc.nextDouble();

	//	cows.add(cow); // (4주차) 목록을 하나 만들어서 그 목록에 넣은거임** 해석1. Cows 목록 -- 해석2.add( ) 괄호안의 내용이 추가.**
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
		if (index>=0) { //index가 0보다 커지면 소를 찾은것임. 딜리트니까 소찾은건 삭제해줌
			cows.remove(index);
			System.out.println("Cow ID "+cowid+" 가 삭제 되었습니다.");
		}
		else {
			System.out.println("그런 Cow ID는 찾지 못했습니다.");
			return;    
		}

		/* (4주차) if (cow == null) {      // 입력받은 소의 아이디가 없다면  ??cow != cowid 해도되나??---> 해봤는데 왜 안돼는거지??
			System.out.println("아직 등록되지 않은 소입니다.");
			return; //생성이 안되있는 객체면 시스템을 종료하라.
		}
		if (cow.id == cowid) {  //입력받은 소의 아이디가 같다면(있다면)
			cow = null;        //cow 클래스 를 지운다. =소의 정보를 지운다. =cow안에 id sex weight 정보가 있다.
			System.out.println("이 소의 정보를 삭제하였습니다.");
		} */
	}
	public void editCow() {
		System.out.println("Cow ID:");
		int cowid = sc.nextInt();

		for (int i = 0 ; i <cows.size();i++) {
			Cow cow = cows.get(i);
			if (cow.getId() == cowid) {   //입력받은 소의 아이디가 있다면 
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
						int id = sc.nextInt();
						cow.setId(id);
					}
					else if (num == 2) {
						System.out.println("Cow Birth(출생년도):");
						int birth = sc.nextInt();
						cow.setBirth(birth);
					}
					else if (num == 3) {
						System.out.println("Cow Sex(암/수):");
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
				break; //if 문 끝나기전에 멈춰줘야함 
			}//if 
		}//for
	}
	public void viewCows() {
		//		System.out.println("Cow ID:");
		//		int cowid = sc.nextInt();
		for (int i = 0 ; i <cows.size();i++) {
			cows.get(i).printinfo();       //(4주차) 목록을 만들어 줘야 하기 때문에 반복문을 사용해서 출력하는 것.
		}
		/*	if (cow.id == cowid) {
			System.out.print("소의 정보 ");
		    cow.printinfo(); 
		}
		else {
			System.out.print("존재하지 않는 ID입니다."+"\n");
			return;
		} */
	}
}
