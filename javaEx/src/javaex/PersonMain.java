package javaex;

class Person{
	private int age; // private: 그 클래스안 접근 

	public void setAge(int age) {  // set~: 값을 설정 
		if(age < 0 || age > 100) {
			System.out.println("입력 오류. 1~100세 입력.");
		}
		else {
			this.age = age; 
		}
		
		
	}

	public int getAge() { // get~: 값을 반환 
		return age; 
	}
	
}

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		//p.age = -10; private -> 직접 접근 안 됨.
		p.setAge(-10);
		System.out.println("현재 나이: ", );
	}

}
