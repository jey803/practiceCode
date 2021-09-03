package ex13;

public class ArrayProcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = { 1, 2, 3, 4, 5 };
		ArrayProc obj = new ArrayProc();
		
		obj.inc(list);
		
		for(int i=0; i<list.length; i++)
			System.out.print(list[i] + " ");
	}

}
