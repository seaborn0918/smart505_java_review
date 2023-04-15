public class Car7Ex {
  public static void main(String[] args) {
    Car7 myCar = new Car7();

    //사용자의 현재 가스량 입력
    myCar.setGas(5);

    //가스가 있는지 없는지 확인 후 있으면 출발
    boolean gasState = myCar.isLeftGas();
    if (gasState) {
      System.out.println("출발합니다.");
      myCar.run();
    }

    myCar.run();
    myCar.run();
    myCar.run();
    myCar.run();

    // 가스 잔량 확인 후 주입 메시지
    if (gasState) {
      System.out.println("가스를 주입할 필요가 없습니다.");
    } else {
      System.out.println("가스를 주입하세요.");
    }
  }
}
