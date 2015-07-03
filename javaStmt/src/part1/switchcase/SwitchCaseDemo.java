package part1.switchcase;

public class SwitchCaseDemo {
	public static void main(String[] args) {
		int sample = 3 ;
		/*switch (key) { //key => 변수명 들어감
		case value:
			
			break;

		default:
			break;
		}*/
		switch (sample) {
		case 1:
			System.out.println("1"); break;
		case 2:
			System.out.println("2"); break;
		case 3:
			System.out.println("3"); break;
		default:System.out.println("1부터 3까지의 범위의 숫자가 아닙니다."); break;
		}
	}
}
