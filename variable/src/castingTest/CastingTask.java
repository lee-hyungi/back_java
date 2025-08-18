package castingTest;

public class CastingTask {
    public static void main(String[] args) {
        // 8.43 + 2.59를 더한값이 10이 되도록 출력
        double num1 = 8.43, num2 = 2.59;
        int result = 0;

        result = (int) num1 + (int) num2;

        System.out.printf("%.2f + %.2f = %d로 강제로 형변환", num1, num2, result);
        
        System.out.println("");
        
//      자동형변환
//      문자형 + 정수 = 정수
        System.out.println('A' * 100);
        System.out.println((char)('A' * 100));
    }
}
