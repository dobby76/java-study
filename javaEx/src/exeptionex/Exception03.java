package exeptionex;

public class Exception03 {
	public static void main(String[] args) {
		try {
			int[] a = {1,2};
			System.out.println(a[5]);
			
			String str = null;
			System.out.println(str.length());
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 범위를 벗어남");
		}
		catch(NullPointerException e) {
			System.out.println("null 래퍼런스 참조 에러");
		}
		catch(Exception e) {
			System.out.println("기타 에러");
		}

	}
	
}
