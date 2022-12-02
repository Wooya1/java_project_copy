package ch05_test_1018;

public class AniTest {

	public static void main(String[] args) {
		//객체를 생성.
//클래스명 참조형 변수 = new 클래스의 기본생성지();
		// dog 라는 이름의(참조형) 변수를 선언.
		// 객체를 생성했음.
		Animal dog = new Animal();
		// 강아지 이름, 나이 설정.
		dog.name = "강아지";
		dog.age = 1;
		// 기본 메서드 하나 출력.
		dog.showInfo();
		
		//고양이 객체 생성하여 이름,나이 설정
		//출력도 한번 합니다.
		
		Animal cat = new Animal();
		//cat 이라는 이름의(참조형) 변수를 선언.
		//객체를 생성했음.
		
		System.out.println("dog의 주솟값");
		System.out.println(dog);
		System.out.println("cat");
		
		cat.name = "고양이";
		//고양이 이름, 나이설정.
		cat.age = 1;
		//기본 메서드 하나 출력.
		cat.showInfo();

	}

}
