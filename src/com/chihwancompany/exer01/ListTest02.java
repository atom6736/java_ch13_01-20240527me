package com.chihwancompany.exer01;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Member> memberList = new ArrayList<Member>(); //이름인 Member를 자동완성으로 가져오는 것이 좋다.
		// 이 부분이 이해된면 50%는 이해된 것.부등괄호 안에 클래스의 이름을 써준 것. 
		// 객체들을 모았다고 해서 collection인 것.
		
		Member member1 = new Member();
		member1.setId("tiger");
		// 멤버 객체를 초기화시키는 방법은 두 가지. 중요하다. 첫번째는 일단 new연산자로 객체를 만들어 빈 멤버1을 만들고.
				// 메모리에 멤버1이 빈칸으로 되어 있던 것이 id가 tiger로 채워지게 됨.
		member1.setPw("12345");
		member1.setAge(25);
		member1.setName("홍길도");
		member1.setPhone("010-1234-5678");
		
		Member member2 = new Member(); // 실제 이것들이 만들어지는 것은 다른데 만들어지고(그래야 메모리가 효율적이니까) 여기엔 번지만 저장되는 것.
		member2.setId("lion");
		// 멤버 객체를 초기화시키는 방법은 두 가지. 중요하다. 첫번째는 일단 new연산자로 객체를 만들어 빈 멤버1을 만들고.
				// 메모리에 멤버1이 빈칸으로 되어 있던 것이 id가 tiger로 채워지게 됨.
		member2.setPw("56789");
		member2.setAge(32);
		member2.setName("이순신");
		member2.setPhone("010-1234-5678");

		// 이상이 일반적인 방법
		// 초기화하는 또 하나의 방법은 한 줄로 만들 수 있는 방법임. 초기화자(생성자)를 이용하는 방법.(아래)
		
		
		Member member3 = new Member("blackcat", "55555", "김유신", 45, "010-2587-3566"); // 이 경우엔 순서대로 넣어야함.
		
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		if (memberList.isEmpty()) { // 멤버리스트가 비어있는지 검사. 
			System.out.println("비어 있음");
		} else {
			System.out.println("비어 있지 않음"); // 리스트 안에 내용이 있으니까 비어있지 않다고 출력됨.
			//본래라면 위의 for문이 if문 안의 else에 배치되어야 할 것이라고.
		}
		
		
	}

}
