package verify;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		boolean run =true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
	while(run) {
		System.out.println("---------------------------------");
		System.out.println("1.학생수 |2. 점수입력|3.점수 리스트|4. 분석|5. 종료");
		System.out.println("---------------------------------");
		System.out.println("선택>");
		
		int selectNo = scanner.nextInt();
		
		if(selectNo ==1) {
			System.out.println("학생수>");
			studentNum =scanner.nextInt();//위에서 입력한 학생수를 studentNum에 대입
			scores = new int[studentNum]; //'scores' 새로운 배열 생성, 학생수를 입력>>학생수 만큼의 배열의 길이를 입력>>배열을 초기화함-학생수만큼의 점수 배열이 만들어짐 
			
		}else if(selectNo ==2) {
			for(int i=0;i<scores.length;i++) {
			
			System.out.print("scores["+i+"]>");
				scores[i] =scanner.nextInt();
				
			}
		}else if(selectNo ==3) {
			for(int i=0;i<scores.length;i++) {
				System.out.println("scores["+i+"]:"+scores[i]);
				
				
			}			
		}else if(selectNo ==4) {
			int max=0;
			int sum=0;
			double avg =0;
			for (int i =0; i<scores.length; i++) {
				//삼항 연산자사용
				max=(max<scores[i])?scores[i]:max;
				sum += scores[i];
			}
			avg=(double)sum /studentNum;
			System.out.println("최고 점수:" +max);
			System.out.println("평균 점수:" +avg);
			
			
		}else if(selectNo ==5) {
			run=false;
			
		}
	}
	System.out.println("프로그램 종료");
	}
}
