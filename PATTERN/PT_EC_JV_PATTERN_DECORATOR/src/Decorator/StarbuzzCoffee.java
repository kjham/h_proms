package Decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import InputTest.*;

// 데코레이더는 전형적인.. 오버라이드, 상속 기법을 이용한 패턴이라 보고 있다.

public class StarbuzzCoffee {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		
		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		
		int c;
		try {
			java.io.InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("test.txt")));
			
			while((c = in.read()) >= 0) {
				System.out.print((char)c);
			}
			in.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
