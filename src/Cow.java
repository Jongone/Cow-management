
public class Cow {  // 1.���� ������ ���� �� �ִ� Ŭ������ ������� //�����ڸ� �������� (Ŭ���� �̸��� �����Ѱ��� ������)
	
	int id;
	int birth;
	String sex;
	double weight;   // ���� ������ Ŭ���� �������� �� = �ʵ�
	
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
	
	public void printinfo(){  //static �� ���������� ����ƽ�� �޸𸮿� �ٷ� �ö󰡴°ǵ� �ٷ� �ö� �ʿ䰡 ���
		System.out.println("ID:"+ id+" "+ "Birth:" + birth +"�⵵ " + "Sex:" + sex +" " + "Weight:"+ weight+"kg ");
	}	
}
