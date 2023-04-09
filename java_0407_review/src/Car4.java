public class Car4 {
  String company;
  String type;
  String model;
  String color;
  int price;

  // 생성자 오버로딩: 매개변수의 개수, 타입, 순서가 달라야 가능함
  public Car4() {

  }

  public Car4(String company) {
    this.company = company;
  }

  public Car4(String company, String type) {
    this.company = company;
    this.type = type;
  }

  // 순서가 달라도 데이터 타입으로 비교하므로 오버로딩 되지 않음
  //public Car4(String type, String model) {
  //}

  public Car4(String company, String type, String model) {
    this.company = company;
    this.type = type;
    this.model = model;
  }

  public Car4(String model, int price) {
    this.model = model;
    this.price = price;
  }

  public Car4(int price, String model) {
    this.price = price;
    this.model = model;
  }

}
