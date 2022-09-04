package chapter10;

public class TypeConversionTest {
    /**
     * 리터럴(literal)
     * - 프로그램에서 사용하는 숫자, 문자, 논리값을 뜻함
     * - 리터럴은 상수 풀(constant pool)에 있음
     * - 정수 리터럴은 int로 실수 리터럴은 double로 저장됨
     *   정수의 범위가 넘어가는 경우닌 L,l을 float로 사용하려는 경우는 F,f 식별자를 써줘야 함
     *
     * 형 변환 (Type Conversion)
     * - 서로 다른 자료형 간에 연산등의 수행을 위해 하나의 자료형으로 통일하는 것
     * - 묵시적 형 변환(explicit type conversion, 자동 형 변환)과 명시적 형 변환(implicit type conversion, 강제 형 변환)이 있음
     * - 바이트 크ㄹ기가 작은 자료형에서 큰 자료형으로 형 변환은 자동으로 이루어 짐
     * - 덜 정밀한 자료형에서 더 정밀한 자료형으로의 형 변환은 자동으로 이루어 짐
     */
    public static void main(String[] args) {
        int iNum = 255;
        byte bNum = (byte)iNum;
        System.out.println(bNum);

        double dNum = 3.14;
        int inum = (int)dNum;
        System.out.println(inum);

        double doubleNum = 1.2;
        float floatNum = 0.9F;

        int iNum1 = (int)doubleNum + (int)floatNum;
        int iNum2 = (int)(doubleNum + floatNum);
        System.out.println(iNum1);
        System.out.println(iNum2);
    }
}
