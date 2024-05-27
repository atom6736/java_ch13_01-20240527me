package com.chihwancompany.exer02;


import java.util.Vector;
import java.util.List;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("놀이동산", "재밌다", "홍길동"));
		list.add(new Board("날씨", "좋다", "김유신"));
		list.add(new Board("회전목마", "무섭다", "안중근"));
		list.add(new Board("거북선", "강하다", "이순신"));
		list.add(new Board("풍신수길", "때려잡자", "선조"));
		
		System.out.println(list);
		
	}

}
