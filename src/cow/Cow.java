package cow;

import java.util.Scanner;

public class Cow {  // 1.���� ������ ���� �� �ִ� Ŭ������ ������� //�����ڸ� �������� (Ŭ���� �̸��� �����Ѱ��� ������)
	protected CowKind kind = CowKind.MilkCow; // Ŭ����Ÿ�� kind �� ����Ʈ ���� ����
	protected int id;
	protected int birth;
	protected String sex;
	protected double weight;   // ���� ������ Ŭ���� �������� �� = �ʵ� , ĸ��ȭ �Ͽ��� ������Ƽ�� ����
	
	public Cow() { //�����ڸ� ����� �⺻ �����ڰ� �������, �׷��� �⺻ ������ ����Ʈ�� �ϴ°��� �����ڰ� ������ ó���ϴ°� �׷��� �׺κ��� ������־���Ѵ�.
		
	}
	public Cow(int id,int birth){
	    this.id = id;
		this.birth = birth; 
	}
	
	public Cow(int id,int birth, String sex){
		this.id = id;
		this.birth = birth;
		this.sex = sex;  //this. �� ���� ��ü�� ��� �� ���� ���� ��ü �ʵ�� ����� �ϳ�.
	}
	
	public Cow(int id,int birth, String sex,double weight){
		this.id = id;
		this.birth = birth;
		this.sex = sex;
		this.weight = weight;
	}               
	
	
	public CowKind getKind() {             //���� ���ʹ� ������ �Ʒ��� ���� ������ ��ġ
		return kind;
	}
	public void setKind(CowKind kind) {
		this.kind = kind;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getBirth() {
		return birth;
	}
	public void setBirth(int birth) {
		this.birth = birth;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void printinfo(){  //static �� ���������� ����ƽ�� �޸𸮿� �ٷ� �ö󰡴°ǵ� �ٷ� �ö� �ʿ䰡 ���
		System.out.println("ID:"+ id+ " Birth:" + birth +"�⵵ " + " Sex:" + sex +" " + " Weight:"+ weight+"kg ");
	}	
	
	public void getUserInput(Scanner sc) {
		System.out.println("Cow ID:");
		int id = sc.nextInt();
		this.setId(id);
		
		System.out.println("Cow Birth(����⵵):");
		int birth = sc.nextInt();
		this.setBirth(birth);
		
		System.out.println("Cow Sex(��/��):");
		String sex = sc.next(); //�� �κ� ������� �Է��� �޾� ���Է°��� �ٸ� Ŭ������ ����ִ� ������ �� ������� �ѹ� ����! ���� ���� ���α׷� ... �̰Ŵ� ���� �ù����̼� 3���� �������� ���´�
		this.setSex(sex);
		
		System.out.println("Cow weight(kg):");
		double weight = sc.nextDouble();
		this.setWeight(weight);
	}
}
