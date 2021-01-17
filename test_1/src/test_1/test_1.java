package test_1;

import java.util.Scanner;

public class test_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Hello world");
		Scanner in=new Scanner(System.in);
		System.out.println("echo:"+in.nextLine());
		System.out.println(2+3+"=2+3="+(2+3));
		final int a=0;//常量
		int price=0;
		int amount=100;
		System.out.print("请输入票面:");
		amount=in.nextInt();
		System.out.print("请输入金额:");
		price=in.nextInt();
		System.out.println(amount+"-"+price+"="+(amount-price));
		
		
		
		int foot=0;
		foot=(int)(30/3.0);
		double inch=0;
		System.out.println(1.2-1.1);
		Scanner inn=new Scanner(System.in);
		foot=inn.nextInt();
		inch=inn.nextDouble();
		System.out.println((int)((foot+inch/12)*0.3048*100)+"cm");
		
		
		System.out.println(5==5.0);
		
		double aa=0.9,bb;
		bb=0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(aa==bb);
		System.out.println(Math.abs(aa-bb)<1e-6);
		Scanner innn=new Scanner(System.in);
		System.out.print("请投币：");
		int Amount=innn.nextInt();
		if(Amount>10) {
			System.out.println("找零:"+(Amount-10));
		}
		
		
		
		boolean st=true;
		System.out.println(st);
		
		
		
		int x=100;
		Scanner i=new Scanner(System.in);
		x=i.nextInt();
		int A[]=new int[x];
		A[0]=1;
		for(int ii=0;ii<A.length;ii++) {
			System.out.println(A[ii]);
		}
		int B[]= A;
		B[0]=10;
		for(int k:B) {
			System.out.println(k);
		}
		
		int [][]c=new int[3][5];
		int [][]d= {
				{1,2,3,4},
				{1,2},
		};
		i.close();
		in.close();
		inn.close();
		innn.close();
		
	}
	
}
