public class Car6 {
  String model;
  String color;
  String price;

  // constructor chaining
  // this()를 사용하여 다른 생성자를 호출함으로써, 인스턴스 변수를 초기화하는 중복된 코드를 제거하고 생성자의 재사용성을 높일 수 있다.
  // Car5와 비교해서 코드가 짧다.
  public Car6(String model, String color, String price) {
    this.model = model;
    this.color = color;
    this.price = price;
  }

  public Car6(String model, String color) {
    this(model, color, "2800");
  }

//  public Car6(String model, String color) {
//    this.model = model;
//    this.color = color;
//    this.price = "2800";
//  }

  public Car6(String model) {
    this(model, "밝은 회색");
  }

//  public Car6(String model) {
//    this.model = model;
//    this.color = "밝은 회색";
//    this.price = "2800"; // 위의 생성자를 호출한 것이기 때문에 price 값은 2800으로 초기화된 상태를 그대로 가져온 것
//  }

  public Car6() {
    this("토레스");
  }


}
