public class CastEx {
  public static void main(String[] args) {
//    강제타입변환 사용
    int intValue = 44032;
    char charValue = (char)intValue;
    System.out.println(charValue);

    long longValue = 500;
    intValue = (int) longValue;
    System.out.println(intValue);

    double doubleValue = 3.14;
    intValue = (int)doubleValue;
    System.out.println(intValue);
  }
}
