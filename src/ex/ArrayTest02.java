package ex;

import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {

		// 1반에 시험성적을 표현
		// 1반에 5명=String
		int n = 5;

		String[] name = new String[] { "AAA", "BBB", "CCC", "DDD", "EEE" };
		String[] sub = new String[] { "국어", "영어", "자바" };
		int[][] score = new int[][] { { 100, 90, 95, 80, 85 }, // 국어
				{ 90, 95, 85, 80, 90 }, // 영어
				{ 60, 70, 80, 90, 85 } };// 자바

		// int [] tot=new int[n];
		// double[] avg=new double[n];
		// int [] totAll=new int[sub.length];
		// double [] avgAll=new double[sub.length];

		// d학생의 국어, 영어, 자바의 총점 index[3]
		System.out.println(name[3]);

		Scanner in = new Scanner(System.in);
		System.out.println("조회하고자 하는 학생의 번호를 입력하세요");
		int no = in.nextInt();
		in.close();

		for (int i = 0; i < name.length; i++) {

			name[i] = in.next();
		}
		for (int a = 0; a < sub.length; a++) {
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {

				}
			}

		}

	}

}
