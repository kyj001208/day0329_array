package arrays02;

public class Arrays02Test03 {

	public static void main(String[] args) {
		
		int [][]arr=new int[2][];
		
		System.out.println(arr[0]);//Out put: null (자동초기화)값이 없기애
		//2차원 배열은 1차원 2개
		arr[0]=new int [3];
		arr[1]=new int [5];
		
		System.out.println(arr[0].length);//Out put: null (자동초기화)값이 없기애
		System.out.println(arr[1].length);
		
		int a=1;
		for(int i=0;i<arr.length;i++) {//1차원배열에 각각 접근
			for(int j=0; j<arr[i].length; j++) {
				
				arr[i][j]=a++;
				System.out.print("arr["+i+"]["+j+"]= " +arr[i][j]);
				
			}
			System.out.println();
			
		}
		
	}

}
