package cow;

import java.util.Scanner;

public class Bison extends Cow {
	String birthplace;
	double horn;
	
	public Bison(CowKind kind){
		super(kind); 
	}
	
	public void getUserInput(Scanner sc) { //�������̵�
		System.out.println("Cow ID:");
		int id = sc.nextInt();
		this.setId(id);

		System.out.println("Cow Birth(����⵵):");
		int birth = sc.nextInt();
		this.setBirth(birth);
		
		System.out.println("Cow BirthPlace(�����):");
		String birthplace = sc.next();
		this.birthplace = birthplace; 

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
		System.out.println("ID:"+ id+" Kind:"+kind+ " Birth:" + birth +"�⵵ " +" BirthPlace:"+this.birthplace + " Sex:" + sex + " Weight:"+ weight+"kg"+" Horn :"+horn+"cm " );
	}

}
