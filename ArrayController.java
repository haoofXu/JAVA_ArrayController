package basic;
import StdMethods.StdOut;

public class ArrayController {
	//	找到数组最大值
	public static double findMax(double[] a){
		double max = a[0];
		for(int i = 1;i<a.length;i++){
			if (a[i]>max)
				max = a [i];
		}
		return max;
	}

	//	计算数组的平均值
	public static double calAverage(double[] a){
		int N = a.length;
		double sum = 0.0;
		for (int i = 0;i<N;i++){
			sum+=a[i];
		}
		double average = sum/N;
		return average;
	}
	
	//	复制数组
	public static double[] cpyArray(double[] a){
		int N = a.length;
		double[] b = new double[N];
		for(int i=0; i<N; i++)
			b[i]=a[i];
		return b;
	}
	
	//	颠倒数组元素的顺序
	public static double[] reverseArray(double[] a){
		int N = a.length;
		for (int i=0;i<N/2;i++){
			double temp = a[i];
			a[i] = a[N-1-i];
			a[N-1-i] = temp;
		}
		return a;
	}
	
	//	打印二维数组，并打印出行列号
	public static void printMatrix(boolean[][] a){
		int row = a.length;
		int line = a[0].length;
		StdOut.print("\t");
		for (int i = 0; i < line; i++){
			StdOut.print(i + "\t");
		}
		for (int i=0; i<row; i++){
			StdOut.println();
			StdOut.print(i +"\t");
			for (int j=0; j< line; j++){
				StdOut.print(a[i][j]+"\t");
			}
		}
		StdOut.println();
	}
	
	public static void printMatrix(int[][] a){
		int row = a.length;
		int line = a[0].length;
		StdOut.print("\t");
		for (int i = 0; i < line; i++){
			StdOut.print(i + "\t");
		}
		for (int i=0; i<row; i++){
			StdOut.println();
			StdOut.print(i +"\t");
			for (int j=0; j< line; j++){
				StdOut.print(a[i][j]+"\t");
			}
		}
		StdOut.println();
	}
	
	//	二维矩阵转置
	public static int[][] transposMatrix(int[][] a){
		int row = a.length;
		int line = a[0].length;
		int[][] b = new int[line][row];
		for(int i=0;i<row;i++){
			for(int j = 0;j<line;j++){
				b[j][i] = a[i][j];
			}
		}
		return b;
	}
	
	//	矩阵相乘（方阵）
	public static double[][] multiMatrix(double[][] a, double[][] b){
		int N = a.length;
		double[][] c = new double[N][N];
		for (int i=0;i<N;i++){
			for (int j=0;j<N;j++){
				//	计算行 i 和列  j 的点乘
				for (int k=0;k<N;k++)
					c[i][j]+=a[i][k]*b[k][j];
			}
		}
		return c;
	}
	
	//	返回一个大小为 M 的数组，第 i 个元素的值为整数 i 在参数数组中出现的次数
	public static int[] histogram(int[] a, int M){
		int count = 0;
		int[] ret = new int[M];
		for(int i = 0; i < M; i++){
			for (int n =0; n<a.length;n++){
				if(a[n]==i) count++;
			}
			ret[i]=count;
			count=0;
		}
		return ret;
	}
	
	//	二分查找
	public static int rank(int key, int[] a){
		return rank(key, a, 0, a.length - 1);
	}
	
	public static int rank(int key, int[] a, int lo, int hi){
		//	如果 key 存在于 a[] 中， 它的索引不会小于 lo 且不会大于 hi
		if(lo>hi) return -1;
		int mid= lo+(hi-lo)/2;
		if (key<a[mid]) return rank(key,a,lo,mid-1);
		else if(key>a[mid]) return rank(key,a,mid+1,hi);
		else return mid;
		
	}
}
