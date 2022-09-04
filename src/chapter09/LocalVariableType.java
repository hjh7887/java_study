package chapter09;

public class LocalVariableType {
    /**
     * 지역 변수 자료형 없이 사용하기 (Java 10 지원됨)
     * - Local variable type inference
     * - 추론 가능한 변수에 대한 자료형을 선언하지 않음
     * - 한 번 선언하여 추론된 변수는 다른 타임의 값을 대입 할 수 없음
     * - 지역 변수만 사용 가능
     */
    public static void main(String[] args)
    {
        var i = 10;         // int
        var j = 10.0;       // double
        var str = "hello";  // string

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);
    }
}
