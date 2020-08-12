
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SbjectScore {

	Scanner scan = new Scanner(System.in);
//	private Student score[]; // 학생 정보(이름, 점수)를 받는 객체 배열
//	private int studentCount; // 학생정보에 붙이는 고유번호
	List<Student> stu = new ArrayList<>();

	public SbjectScore() {

//		score = new Student[3];
//		studentCount = 0;
	}

	public void newScore() { // 점수 받기 및 번호 부여

		System.out.println("학생의 이름을 입력하세요. : \n");
		String name = scan.next();

		System.out.println("국어점수를 입력하세요.");
		int kor = scan.nextInt();

		System.out.println("수학점수를 입력하세요.");
		int math = scan.nextInt();

		System.out.println("사회점수를 입력하세요.");
		int society = scan.nextInt();

		System.out.println("영어점수를 입력하세요.");
		int eng = scan.nextInt();

		System.out.println("도덕점수를 입력하세요.");
		int morality = scan.nextInt();

		stu.add(new Student(name, kor, eng, math, morality, society));

//		Student student = new Student(name, kor, eng, math, morality, society);
//		score[studentCount] = student;
//		studentCount++;
//		System.out.println(name + "님은 학생번호  " + studentCount + "번으로 배정되었습니다.\n");
		System.out.println(name + "님은 학생성적 입력완료.\n");
	}

	public void total() { // 합산 조회

		System.out.println("점수의 합산을 조회 할 학생의 이름을 입력하세요.");
		String name = scan.next();

		for (Student student : stu) {
			if (student.getName().equals(name)) {
				System.out.println(student);
				System.out.println(name + "학생의 총 점은 " + student.total() + "점입니다.\n");
				return;
			}
		}
		System.out.println("이름을 찾을 수 없습니다.\n");

//		int studentCountNumber = -1;
//
//		for (int i = 0; i < score.length; i++) {
//			Student stu = score[i];
//			String num = stu.getName();
//			if (num.equals(name)) {
//				studentCountNumber = i;
//				break;
//			} else
//				System.out.println("이름을 찾을 수 없습니다.\n");
//			return;
//		}
//		System.out.println(score[studentCountNumber].toString());
//		System.out.println(name + "학생의 총 점은 " + score[studentCountNumber].total() + "점입니다.\n");
	}

	public void average() { // 평균 조회

		System.out.println("점수의 평균을 조회 할 학생의 이름을 입력하세요.");
		String name = scan.next();
		for (Student student : stu) {
			if (student.getName().equals(name)) {
				System.out.println(student);
				System.out.println(name + "학생의 평균 " + student.average() + "점입니다.\n");
				return;
			}
		}
		System.out.println("이름을 찾을 수 없습니다.\n");
//		int studentCountNumber = -1;
//
//		for (int i = 0; i < score.length; i++) {
//			Student stu = score[i];
//			String num = stu.getName();
//			if (num.equals(name)) {
//				studentCountNumber = i;
//				break;
//			} else
//				System.out.println("이름을 찾을 수 없습니다.\n");
//			return;
//		}
//		System.out.println(name + "학생의 평균은 " + score[studentCountNumber].average() + "점입니다.\n");

	}

	public void ranking() { // 석차 조회

		int[] ranking = new int[stu.size()];

		for (int i = 0; i < ranking.length; i++) {

			ranking[i] = stu.get(i).total();

		}

//		Arrays.sort(ranking, Collections.reverseOrder());		

//			for(int i=0; i< score.length; i++)
//		           score[i]= score[] ; 

		for (int i = 0; i < ranking.length - 1; i++) {
			for (int j = i + 1; j < ranking.length; j++) {
				if (ranking[i] < ranking[j]) {
					int tmp = ranking[i];
					ranking[i] = ranking[j];
					ranking[j] = tmp;
				}
			}

			/*
			 * if(ranking[i]>ranking[j]) ranking[j]++;
			 * 
			 * else if(ranking[i]<ranking[j]) ranking[i]++; }
			 */
		}

//		for (int i = 0; i < score.length; i++) {
//			for (int j = 0; j < score.length; j++) {
//
//				if (score[i].total() == ranking[j]) {
//					score[i].setRank(j + 1);
//				}
//
//			}
//
//		}
		for (int i = 0; i < ranking.length; i++) {
			for (int j = 0; j < ranking.length; j++) {

				if (stu.get(i).total() == ranking[j]) {
					stu.get(i).setRank(j + 1);
				}

			}

		}
		for (int i = 1; i <= ranking.length; i++) {
			for (Student student : stu) {
				if (i == student.getRank()) {
					System.out.println(i + "등 : " + student.getName() + "\n");
//					System.out.println("학생이 " + stu.get(i).getName() + "의 순위 : " + stu.get(i).getRank() + "등\n");
				}
			}
		}

		/*
		 * System.out.println("점수의 석차를 조회 할 학생의 이름을 입력하세요."); String name = scan.next();
		 * int studentCountNumber = -1;
		 * 
		 * for(int i = 0; i < score.length; i++) { Student stu = score[i]; String num =
		 * stu.getName(); if (num.equals(name)) { studentCountNumber = i; break; } else
		 * System.out.println("이름을 찾을 수 없습니다.\n"); return; }
		 * score[studentCountNumber].ranking();
		 */

	}

	public void remove() {
		System.out.println("삭제할 학생의 이름을 입력하세요.");
		String name = scan.next();
		for (int i = stu.size() - 1; i >= 0; i--) {
			if (stu.get(i).getName().equals(name)) {
				System.out.println(stu.get(i).getName() + "의 성적이 삭제되었습니다.");
				stu.remove(i);
				return;
			}
		}
		System.out.println("이름을 찾을 수 없습니다.\n");

	}

	public void edit() {

		System.out.println("성적을 수정 할 학생의 이름을 입력하세요.");
		String name = scan.next();
		for (Student student : stu) {
			if (student.getName().equals(name)) {
				System.out.println("국어점수를 입력하세요.");
				student.setKor(scan.nextInt());

				System.out.println("수학점수를 입력하세요.");
				student.setMath(scan.nextInt());

				System.out.println("사회점수를 입력하세요.");
				student.setSociety(scan.nextInt());

				System.out.println("영어점수를 입력하세요.");
				student.setEng(scan.nextInt());

				System.out.println("도덕점수를 입력하세요.");
				student.setMorality(scan.nextInt());
				System.out.println(student.getName() + "의 성적이 수정되었습니다.");
				return;
			}
		}
		System.out.println("이름을 찾을 수 없습니다.\n");
	}

	public void quit() { // 종료하기

		System.out.println("프로그램이 종료되었습니다.\n");
	}

}
