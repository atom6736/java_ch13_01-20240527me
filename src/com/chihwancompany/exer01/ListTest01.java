package com.chihwancompany.exer01; // 아래 연습이 아주아주 중요하다고 강조.

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list1 = new ArrayList<String>(); // arraylist서넌
				//리스트의 정체가 interface이기 때문에 인스턴스를 못 만들기 때문에 뉴연산자를 못 쓴다.
				// 큰 가방에 담을 클래스의 이름을 괄호안에 적어줌. String으로 만든 문장려을 넣어보려고 한다.
				// 그러므로 리스트를 가지고 곧바로 객체를 선언할 수 없다. new연산자를 쓸 수 없기 때문에.
				//  그런데 리스트에는 자식이 3개가 있음. 그것은 모두 일반클래스. 그러면 부모는 자식의 모든 것을 받아준다.
				// 리스트로 선언한 객체는 자식 중의 한 개를 이용하여 뉴연산자를 이용 만들어주어야 함. 
		// 이것은 list1=[]빈리스트를 만들어 추가하는 것과 비슷. 여기서는 append가 아닌 add를 사용.
		list1.add("홍길동"); //이러면 비로소 메모리에 첫번째 원소(객체)가 들어온 것.
		list1.add("이순신"); 
		list1.add("김유신"); // 인덱스 2번에 해당
		
		int list1Size = list1.size(); //리스트의 크기, 즉 원소의 갯수를 보여줌. 이걸 찍으면 3이 나옴. 3명이니까.
		// 넣고 크기를 안 다음에 가져오는 것이 필요. get
		String memberName = list1.get(1); // 인덱스 1인 이순신을 가져옴
		
		System.out.println(memberName);
		// for문으로 만들어보자.
		
		for(int i=0; i<list1.size(); i++) { // {앞에 세미콜론을 넣어 에러가 발생했다. 그건은 에러가 아니라서 아래콘솔에서는 알려주지 않았다.
			//자동으로 크기를 구해주는 메소드를 이용하는 것이 중요
		//	System.out.println(list1[i]); // 이렇게 곧장들어가면 에러. get을 써야 함. 
			System.out.println(list1.get(i));
			
			//위의 출력문이 이런 에러가 뜬다. Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			//i cannot be resolved to a variable
			//at com.chihwancompany.exer01.ListTest01.main(ListTest01.java:31)
		}
		
		list1.remove(1); //인덱스 1 원소가 삭제되므로 이순신이 삭제됨.
		list1.remove("홍길동"); //값으로 지울 수도 있음.
		
		System.out.println("---------------");
		
		for(int i=0; i<list1.size(); i++) {  //list1.size()로 하여 리스트 길이에 따라 자동으로 적용됨.
			System.out.println(list1.get(i)); //---- 윗줄에서 인덱스1로 이순신이 삭제되고, 값으로 넣은 홍길동이 삭제되어 김유신만 출력된 것.
			
		}
	}

}
