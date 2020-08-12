// 2020.08.10 윤혜정 

import java.util.ArrayList;

public class Student {
		
	private String name;
	private int kor;
	private int math;
	private int eng;
	private int society;
	private int morality;
	private int rank;
	

	

	public Student(){} // 디폴트 생성자 
	
	public Student(String name, int kor, int eng, int math,int morality, int society){ 
        super();
        this.setName(name);
        this.setKor(kor);
        this.setEng(eng);
        this.setMath(math);
        this.setMorality(morality);
        this.setSociety(society);   
     }
	


	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getSociety() {
		return society;
	}
	public void setSociety(int society) {
		this.society = society;
	}
	public int getMorality() {
		return morality;
	}
	public void setMorality(int morality) {
		this.morality = morality;
	}
	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
	 @Override
	
	public String toString(){ // 성적 조회
		
		return "입력하신 "+name+"학생의\n국어점수는 "+kor+"점\n수학점수는 "+math+"점\n영어점수는 "+eng+"점\n사회점수는 "+society+"점\n도덕점수는 "+morality+"점이며"; 
	}
	 
	public int total() { // 총점
		
		return (kor+math+eng+society+morality);
	}
	
	public double average() { // 평균
		
		return  ((kor+math+eng+society+morality)/5);
	}
	

	
	
	

}
