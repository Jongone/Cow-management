package cow;

import java.util.Scanner;

public class Cow {  // 1.소의 정보를 넣을 수 있는 클래스를 만든것임 //생성자를 만들어야함 (클래스 이름과 동일한것이 생성자)
	protected CowKind kind = CowKind.MilkCow; // 클래스타입 kind 의 디폴트 값은 젖소
	protected int id;
	protected int birth;
	protected String sex;
	protected double weight;   // 변수 선언을 클래스 레벨에서 함 = 필드 , 캡슐화 하여서 프로텍티드 붙임
	
	public Cow() { //생성자를 만들면 기본 생성자가 사라진다, 그래서 기본 생성자 디폴트를 하는것은 생성자가 없을떄 처리하는것 그래서 그부분을 만들어주어야한다.
		
	}
	public Cow(int id,int birth){
	    this.id = id;
		this.birth = birth; 
	}
	
	public Cow(int id,int birth, String sex){
		this.id = id;
		this.birth = birth;
		this.sex = sex;  //this. 는 나의 객체의 라는 뜻 따라서 나의 객체 필드안 멤버중 하나.
	}
	
	public Cow(int id,int birth, String sex,double weight){
		this.id = id;
		this.birth = birth;
		this.sex = sex;
		this.weight = weight;
	}               
	
	
	public CowKind getKind() {             //게터 세터는 생성자 아래가 보통 관례적 위치
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
	
	public void printinfo(){  //static 이 빠진이유는 스태틱은 메모리에 바로 올라가는건데 바로 올라갈 필요가 없어서
		System.out.println("ID:"+ id+ " Birth:" + birth +"년도 " + " Sex:" + sex +" " + " Weight:"+ weight+"kg ");
	}	
	
	public void getUserInput(Scanner sc) {
		System.out.println("Cow ID:");
		int id = sc.nextInt();
		this.setId(id);
		
		System.out.println("Cow Birth(출생년도):");
		int birth = sc.nextInt();
		this.setBirth(birth);
		
		System.out.println("Cow Sex(암/수):");
		String sex = sc.next(); //이 부분 사용자의 입력을 받아 그입력값을 다른 클래스에 집어넣는 과정을 잘 만든거임 한번 보자! 내가 만든 프로그램 ... 이거는 차량 시물레이션 3주차 과제에도 나온다
		this.setSex(sex);
		
		System.out.println("Cow weight(kg):");
		double weight = sc.nextDouble();
		this.setWeight(weight);
	}
}
