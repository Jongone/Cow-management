package cow;

import java.util.Scanner;

public class BullCow extends Cow {
	double horn;
	
	public void getUserInput(Scanner sc) {
		System.out.println("Cow ID:");
		int id = sc.nextInt();
		this.setId(id);
		
		System.out.println("Cow Birth(출생년도):");
		int birth = sc.nextInt();
		this.setBirth(birth);
		
		System.out.println("Cow Sex(암/수):");
		String sex = sc.next();
		this.setSex(sex);
		
		System.out.println("Cow weight(kg):");
		double weight = sc.nextDouble();
		this.setWeight(weight);
		
		System.out.println("Bull's Horn length(cm)");
		double horn = sc.nextDouble();
		this.horn=horn;
		
		}	
		public void printinfo(){  //static 이 빠진이유는 스태틱은 메모리에 바로 올라가는건데 바로 올라갈 필요가 없어서
			System.out.println("ID:"+ id+ " Birth:" + birth +"년도 " + " Sex:" + sex +" " + " Weight:"+ weight+"kg"+" Horn : "+horn+"cm " );
	}
}

	


