package rec;

public class SumOfnNumbers {
	
	static int sum(int n) {
		if(n==1) {
			return 1;
		}else
			return n + sum(n-1);
//			return sum(n);
	}

	public static void main(String[] args) {
		System.out.println(sum(5));

	}

}
