package collectionTest;

public class Array {
	public static void main(String[] args) {
		String[] arData = new String[2];
		String[] arTemp = new String[2];
		
		arData[0] = "준서";
		arData[1] = "한민";
		
		arTemp[0] = arData[0];
		arTemp[1] = arData[1];
		
		arData = new String[3];
		arData[0] = arTemp[0];
		arData[1] = arTemp[1];
		arData[2] = "승원";
		
	}
}
