package hackerEarth;

import java.math.BigInteger;
import java.util.Scanner;

public class BigInt {

	public static void main(String[] args) {
		 Scanner sc= new Scanner(System.in);
		BigInteger x= sc.nextBigInteger();
        BigInteger y= sc.nextBigInteger();
        System.out.println(x.add(y));
        System.out.println(x.multiply(y));

	}

}
