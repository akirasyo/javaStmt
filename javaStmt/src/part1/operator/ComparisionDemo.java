package part1.operator;

public class ComparisionDemo {
	public static void main(String[] args) {
		int val01 = 1, val02 = 2;
		/* if (){}   if는 비교문,
	  	() 비교식이 위치하는 컨디션,
	  	{} 조건문 바디 라고 부른다. */
		if(val01 == val02){  //val01 과 val02의 값이 같다면 ...
			System.out.println("val01 과 val02 의 값이 같습니다.");
		}
		else if(val01 != val02){	 //val01 과 val02 의 값이 다르다면
			
			System.out.println("val01 과 val02 의 값이 다릅니다.");
		}
		else if(val01 > val02){
			System.out.println("val01 이 val02 보다 큽니다.");
		}
		if(val01 < val02){
			System.out.println("val01 이 val02 보다 작습니다.");
		}
	}
}
