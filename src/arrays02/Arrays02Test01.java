package arrays02;

import java.util.Arrays;

public class Arrays02Test01 {

	public static void main(String[] args) {

		int[] arr = new int[5]; // 1차원 배열
		int[][] arr1 = new int[2][3]; // 2차원 배열
		// 2행 3열로 이루어진 int형 2차원 배열 =1차원 배열의 집합

		int[][] arr2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3행 3열 구조

		int[][] arr3 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }; // 2행 3열 구조

		// 배열은 자동으로 구성요소에 접근 가능한 변수를 만들어줌
		// 배열이름[인덱스번호] : 0부터 1씩 증가
		// 2차원 배열 arr1 -구성요소는 : 1차원 배열의 집합
		// arr[0] - 2차원 배열의 구성요소인 - 1차원 배열 변수

		System.out.println("2차원 배열의 길이" + arr1.length);
		System.out.println("arr1[0]의 길이" + arr1[0].length);
		System.out.println("arr1[1]의 길이" + arr1[1].length);
		System.out.println();

		int a = 1;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {

				arr1[i][j] = a++;

				System.out.print("arr1[" + i + "][" + j + "]=" + arr1[i][j] + " ");
				
			}
			System.out.println(Arrays.toString(arr1[i]));
			System.out.println();
		}

	}

}
