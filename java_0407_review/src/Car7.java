public class Car7 {
  int gas;

  // 리턴이 없는 메소드 // void
  void setGas(int gas) {
    this.gas = gas;
  }

  // true, false를 리턴
  boolean isLeftGas() {
    if (gas == 0) {
      System.out.println("가스가 없습니다.");
      return false;
    } else {
      System.out.println("gas가 있습니다.");
      return true;
    }
  }

  void run() {
    if (gas > 0) {
      System.out.println("달립니다. (gas 잔량 : " + gas + ")");
      gas -= 1;
    } else {
      System.out.println("멈춥니다. (gas 잔량 : " + gas + ")");
    }
  }


}
