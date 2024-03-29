package arrays02;

public class Arrays03Test01 {

	public static void main(String[] args) {
		
		int[][][] ar=new int[2][][];
		//ar[0],ar[1] : 2차원배열이름
		
		ar[0]=new int [2][];
		//ar[0][0], ar[0][1] :1차원배열이름
		ar[1]=new int [2][];
		//ar[1][0], ar[1][1] :1차원배열이름
		
		ar[0][0]=new int[] {1,2};
		ar[0][1]=new int[] {3,4};
		
		ar[1][0]=new int[] {5,6};
		ar[1][1]=new int[] {7,8};
		
		int[][][]arr= {{{1,2},{3,4}},{{5,6},{7,8}}};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				for(int k=0; k<arr[i][j].length;k++) {
					
					System.out.print(arr[i][j][k]);
				}
			}
		}

	}

}
