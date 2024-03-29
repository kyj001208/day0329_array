package ex;

import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
	
		//1반에 시험성적을 표현 
		//1반에 5명=String
		int n=5;
		
		String[]name=new String[] {"AAA","BBB","CCC","DDD","EEE"};
		String[]sub=new String[] {"국어","영어", "자바"};
		int [][] score=new int[][] {
			{100,95,90,85,80}, //국어
			{95,90,85,80,75}, //영어
			{90,85,80,75,70} //자바
		};
		//int [] tot=new int[n];
		//double[] avg=new double[n];
		//int [] totAll=new int[sub.length];
		//double []  avgAll=new double[sub.length];
		
		Scanner in = new Scanner(System.in);
		System.out.println("조회하고자 하는 학생의 번호를 입력하세요");
		int no = in.nextInt();
		in.close();
		
		int noIdx=no-1;
		int tot=0;
		System.out.println("번호 : " + no);
		System.out.println("이름 : " + name[no-1]);
		System.out.println("---------------------------");
		
		for(int i=0; i<sub.length; i++) {
			
			int jumsu=score[i][noIdx];
			tot += jumsu;
			
		System.out.println(sub[i] +" : " + jumsu);
		}
		System.out.println("------------------");
		System.out.println("총점 :"+ tot);
		System.out.printf("평균 : %.2f" ,(double)tot/sub.length);
	
	}
	//단점 : 동일한 데이터 타입만 묶으면 학생 별 정보를 수집하기가 힘들다.

}
