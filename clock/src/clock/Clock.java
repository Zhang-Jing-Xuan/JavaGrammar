package clock;

import display.led.Display;
class A{
	
}
public class Clock {//文件名和类的名字必须相同，一个编译单元只能有一个类是public
	private Display hour=new Display(24);
	private Display minute=new Display(60);
	
	public void start() {
		while(true) {
			minute.increace();
			if(minute.getValue()==0) {
				hour.increace();
			}
			System.out.printf("%02d:%02d\n", hour.getValue(),minute.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock clock=new Clock();
		clock.start();
	}

}
