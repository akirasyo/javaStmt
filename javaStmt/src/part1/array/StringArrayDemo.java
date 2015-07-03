package part1.array;
public class StringArrayDemo {
	public static void main(String[] args) {
		String[] arr ; // String 타입의 배열 선언
		arr = new String[3]; // 3처럼 항상 인덱스 사이즈를 입력해야 함
		arr[0] = "1";
		arr[1] = "2";
		arr[2] = "3";
		arr[3] = "4" ;
		/*
		Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
			at part1.array.StringArrayDemo.main(StringArrayDemo.java:11)
		위의 에러메시지는 배열의 크기를 벗어난 에러
		 */
	}
}
