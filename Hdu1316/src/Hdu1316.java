import java.math.BigInteger;
import java.util.Scanner;

public class Hdu1316 {

	public static void main(String[] args) {
		int sum=0;
		BigInteger []b=new BigInteger[10005];
		b[1]=BigInteger.valueOf(1);
		b[2]=BigInteger.valueOf(2);
		for(int i=3;i<10005;i++) {
			b[i]=b[i-1].add(b[i-2]);
		}
		Scanner s=new Scanner(System.in);
		while(s.hasNextBigInteger()) {
			BigInteger n=s.nextBigInteger();
			BigInteger m=s.nextBigInteger();
			if(n.compareTo(BigInteger.ZERO)==0&&m.compareTo(BigInteger.ZERO)==0) {
				return;
			}
			if(n.compareTo(m)>0) {
				BigInteger tt=n;
				n=m;
				m=tt;
			}
			for(int i=1;i<10005;i++) {
				if(b[i].compareTo(n)>=0&&b[i].compareTo(m)<=0) {
					sum++;
				}
			}
			System.out.println(sum);
			sum=0;
			s.close();
		}
		
	}

}
