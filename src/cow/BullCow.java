package cow;

import java.util.Scanner;

public class BullCow extends Cow {
	double horn;
	
	public void getUserInput(Scanner sc) {
		System.out.println("Cow ID:");
		int id = sc.nextInt();
		this.setId(id);
		
		System.out.println("Cow Birth(����⵵):");
		int birth = sc.nextInt();
		this.setBirth(birth);
		
		System.out.println("Cow Sex(��/��):");
		String sex = sc.next();
		this.setSex(sex);
		
		System.out.println("Cow weight(kg):");
		double weight = sc.nextDouble();
		this.setWeight(weight);
		
		System.out.println("Bull's Horn length(cm)");
		double horn = sc.nextDouble();
		this.horn=horn;
		
		}	
		public void printinfo(){  //static �� ���������� ����ƽ�� �޸𸮿� �ٷ� �ö󰡴°ǵ� �ٷ� �ö� �ʿ䰡 ���
			System.out.println("ID:"+ id+ " Birth:" + birth +"�⵵ " + " Sex:" + sex +" " + " Weight:"+ weight+"kg"+" Horn : "+horn+"cm " );
	}
}

	


