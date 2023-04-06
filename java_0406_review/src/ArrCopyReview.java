import java.util.Arrays;

public class ArrCopyReview {
  public static void main(String[] args) {
    // 데이터 자체를 저장하는 기본 데이터 타입
    int a = 10;
    int b = 20;
    System.out.println("변수 a : " + a);
    System.out.println("변수 b : " + b);

    a = b;
    System.out.println("대입 후 a : " + a);
    System.out.println("대입 후 b : " + b);

    b = 100;
    System.out.println("b 수정 후 a : " + a);
    System.out.println("b 수정 후 b : " + b);

    System.out.println("\n ----- 배열 단순 대입 시 != copy -----");
    int[] arr1 = {10, 20};
    int[] arr2 = {30, 40};

    System.out.println("----- 원본 배열 출력 -----");
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- 단순 대입 후 배열 출력 ----- ");
    arr1 = arr2;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- arr2의 값 변경 -----");
    arr2[0] = 100;
    arr2[1] = 200;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");
    // 참조 주소를 대입했으므로 arr1과 arr2의 배열은 같다. 같은 참조로 같은 배열을 가리켜고 있고 배열 변수명만 다름.

    System.out.println("\n ----- 반복문을 통한 복사 -----");
    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};
    System.out.println("----- 원본 배열 출력 -----");
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- for문으로 복사 -----");
    for (int i = 0; i < arr2.length; i++) {
      arr1[i] = arr2[i];
    }
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- arr2의 값 직접 변경 -----");
    arr2[0] = 100;
    arr2[1] = 200;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("\n ----- System.arraycopy() 사용 -----");
    // System.arraycopy() : System 클래스에서 지원하는 배열 복사 메소드
    // 사용법 :
    // System.arraycopy(원본배열, 원본배열 시작index, 타겟배열, 타겟배열 시작index, 복사할 크기);
    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};
    System.out.println("----- 원본 배열 출력 -----");
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println(" ----- arraycopy()로 복사 ----- ");
    System.arraycopy(arr2, 0, arr1, 0, arr2.length);
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- arr2의 값 직접 변경 -----");
    arr2[0] = 100;
    arr2[1] = 200;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("\n ----- Arrays.copyOf() 사용하기 -----");
    // Arrays.copyOf() : Arrays 클래스에서 지원하는 배열 복사 메소드, 원본 배열을 그대로 복사
    // Arrays.copyOfRange() : Arrays 클래스에서 지원하는 배열 복사 메소드, 원본에서 원하는 크기만큼만 복사
    // 사용법 :
    // 타겟 배열 = Arrays.copyOf(원본배열, 크기);
    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};
    System.out.println("----- 원본 배열 출력 -----");
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println(" ----- copyOf() 사용 후 ----- ");
    Arrays.copyOf(arr2, arr2.length);
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- arr2의 값 직접 변경 -----");
    arr2[0] = 100;
    arr2[1] = 200;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("\n ----- Object.clone() 사용하기 ----- \n");
    // Object.clone() : 자바의 최상위 클래스인 Object 클래스에서 제공하는 메소드
    // 사용법 :
    // 타겟 배열 = 원본 배열.clone();
    arr1 = new int[] {10, 20};
    arr2 = new int[] {30, 40};
    System.out.println("----- 원본 배열 출력 -----");
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println(" ----- clone() 사용 후 ----- ");
    arr1 = arr2.clone();
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");

    System.out.println("----- arr2의 값 직접 변경 -----");
    arr2[0] = 100;
    arr2[1] = 200;
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");
  }
  public static void printArrays(int[] array, String name) {
    for (int i = 0; i < array.length; i++) {
      System.out.println(name + "[" + i + "] : " + array[i]);
    }
  }

  public static void print(int[] arr1, int[] arr2) {
    printArrays(arr1, "arr1");
    printArrays(arr2, "arr2");
  }
}
