package com.chihwancompany.exer01;

public class Member {

	private String id;
	private String pw;
	private String name;
	private int age;
	private String phone;
	// 회원가인정보 5가지
	//이것이 바로 DB에 레코드필드를 만들어 회원이 들어올 때마다 DB에 저장할 것.
	//코드 하나하나가 위의 5개 항목을 갖게 되는 것.
	//이런 클래스들이 DTO. 이것을 밖에서 함부로 못바꾸게 하기 위해 private으로 만든다고.
	// 새엉자 두개 오ㅘ 게터세터
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String pw, String name, int age, String phone) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
