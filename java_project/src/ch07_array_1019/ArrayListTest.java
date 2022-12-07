package ch07_array_1019;



//ctrl + shift + o : 자동임포트
import java.util.ArrayList;

import ch07_arraylist_1020.Student;


public class ArrayListTest {

	public static void main(String[] args) {
		
        //Student 타입으로 ArrayList 를 만들기. -> students
		// 해당 ArrayList에 각자 알고 있는 이름 3개만 등록하기.
		// Student에 생성자를 잘 보고 객체 만들기.
		// showInfo를 이용해 출력해보기.
		// 기본 for문 출력하고
		// 향상된 for문 출력하기.
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student("신짱구"));
		students.add(new Student("신형만"));
		students.add(new Student("봉미선"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		//기본 선언하는 부분
		ArrayList<Book> library1 = new ArrayList<Book>();

		// Book 타입만 넣기 <Book> 제너릭 타입형식으로 지정.
		// library.add("lsy");
		// library , arrayList 형식은 Book 타입의 객체 5개를 등록 했음.
		
		library1.add( new Book("태백산맥", "조정래") );
		library1.add( new Book("데미안", "헤르만 헤세") );
		library1.add( new Book("어떻게 살 것인가", "유시민") );
		library1.add( new Book("토지", "박경리") );
		library1.add( new Book("어린왕자", "생텍쥐페리") );
		// 기본 반복문 for를 이용해서 , 해당  ArrayList 에 있는 값을 가져오기.
		for(int i=0; i<library1.size(); i++){
	
			Book book = library1.get(i);
			book.showBookInfo();
		}
		
		System.out.println();
		System.out.println("=== 향상된 for문 사용 ===");
		for(Book book : library1){
			book.showBookInfo();
		}
	}
}
