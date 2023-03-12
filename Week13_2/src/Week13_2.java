//단일 스레드로 입출력 처리

import java.util.Scanner;
public class Week13_2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("값 입력하시오 : ");
		String s = input.nextLine();
		System.out.println("입력하신 값은 " + s + "입니다.");
		
		for(int i = 10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch(Exception e) {}
		}
	}
}