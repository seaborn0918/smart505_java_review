public class ArrayInArray {
  public static void main(String[] args) {
    // 2차원 배열 생성 시 크기를 지정함
    int[][] mathScore = new int[2][3];
    for (int i = 0; i < mathScore.length; i++) {
      for (int j = 0; j < mathScore[i].length; j++) {
        System.out.println("mathScore[" + i + "][" + j + "] : " + mathScore[i][j]);
      }
    }
    System.out.println("\n\n");
    // 2차원 배열 생성 시 라인 수는 반드시 지정해야 함(즉, 2차원 배열의 크기는 반드시 지정)
    // 해당 라인의 칸 수는 지정하지 않아도 됨
    int[][] engScore = new int[2][];
    engScore[0] = new int[2];
    engScore[1] = new int[3];
    for (int i = 0; i < engScore.length; i++) {
      for (int j = 0; j < engScore[i].length; j++) {
        System.out.println("engScore[" + i + "][" + j + "] : " + engScore[i][j]);
      }
    }
    System.out.println("\n\n");
    int[][] korScore = {
        {95, 80},
        {92, 95, 80}
    };
    for (int i = 0; i < korScore.length; i++) {
      for (int j = 0; j < korScore[i].length; j++) {
        System.out.println("korScore[" + i + "][" + j + "] : " + korScore[i][j]);
      }
    }
    System.out.println("\n ----- 요소가 참조 타입인 배열 -----");
    String[] strArr = new String[3];

    strArr[0] = "java";
    strArr[1] = "jsp";
    strArr[2] = "spring";
    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);

    System.out.println("\n\n");

    strArr = new String[] {"java", "jsp", "spring"};
    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);

    strArr = new String[] {new String("java"), new String("jsp"), new String("spring")};

    System.out.println("strArr[0] : " + strArr[0]);
    System.out.println("strArr[1] : " + strArr[1]);
    System.out.println("strArr[2] : " + strArr[2]);
  }
}
