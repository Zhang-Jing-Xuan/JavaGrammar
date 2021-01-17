package display.led;

public class Display {
	private int value=0;//private关键字只能用于成员变量，成员函数
	private int limit=value;
	private static int step=1;//类变量
	public Display(int limit){
		this.limit=limit;
	}
	public void increace() {
		value++;
		if(value==limit) {
			value=0;
		}
	}
	 public int getValue() {//不写public是friendly,同一个包内可以访问
		return value;
	}
	 public static void f() {
		 
	 }
	public static void main(String[] args) {//类函数，和对象没关系
		// TODO Auto-generated method stub
//		Display d=new Display(24);
//		//d.value++;可以
//		for(;;) {
//			d.increace();
//			System.out.println(d.getValue());
//		}
		Display d1=new Display(10);
		d1.step=2;
		System.out.println(d1.step);
		Display d2=new Display(20);
		System.out.println(d2.step);
		d1.increace();
		f();
		d1.f();
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		System.out.println(d1.step);
		System.out.println(d2.step);
		d1.step=2;
		System.out.println(d1.step);
		System.out.println(d2.step);
		Display.step=3;
		System.out.println(d1.step);
		System.out.println(d2.step);
	}

}
