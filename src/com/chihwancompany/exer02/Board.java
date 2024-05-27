package com.chihwancompany.exer02;

public class Board {

	// subject(제목), content(내용), writer(글쓴이)를 만들어보자.
	// vector로 만드는 연습? 처음에는vector로 만들다가 지금에 와서 arraylist가 나와 사옹되기시작한 것.
	//차이는 thread의 차이. arraylist는 멀티 스레드가 되는데 벡터는 그것이 안됨. 그러므로 arraylist가 좋은 것.
	// 속도는 멀티스레드를 하지 않으니 vector가 조금 빠르지만 큰 차이는 없다고. vector는 안전성에서 조금 우수하다고 하지만 별 차이 없다고. 
	
	private String subject;
	private String content;
	private String writer;
	
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	
	
	
}
