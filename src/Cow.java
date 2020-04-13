
public class Cow {  // 1.소의 정보를 넣을 수 있는 클래스를 만든것임 //생성자를 만들어야함 (클래스 이름과 동일한것이 생성자)
	
	int id;
	int birth;
	String sex;
	double weight;   // 변수 선언을 클래스 레벨에서 함 = 필드
	
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
	
	public void printinfo(){  //static 이 빠진이유는 스태틱은 메모리에 바로 올라가는건데 바로 올라갈 필요가 없어서
		System.out.println("ID:"+ id+" "+ "Birth:" + birth +"년도 " + "Sex:" + sex +" " + "Weight:"+ weight+"kg ");
	}	
}
