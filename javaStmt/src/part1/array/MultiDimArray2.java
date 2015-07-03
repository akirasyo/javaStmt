package part1.array;

public class MultiDimArray2 {
	public static void main(String[] args) {
		String[][] names = {{"Mr.","Ms.","Mrs."},{"Smith", "Jones","Alex"}};
		for (int i = 0; i < names.length; i++) {
			
		}
		System.out.println(names[0][0] + names[1][1]);   // Mr.Jones 출력
		//Ms.Alex 를 출력하시오
		System.out.println(names[0][1] + names[1][2]);
		// Mrs.Smith 를 출력하시오
		System.out.println(names[0][2] + names[1][0]);
	}
}
