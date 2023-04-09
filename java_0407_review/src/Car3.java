public class Car3 {
  String company = "쉐보레";
  String model;
  String type = "SUV";
  String color;
  int price;

  // 생성자를 사용하여 필드를 초기화
  public Car3() {
    // 필드를 객체 내부에서 사용
    // 생성되는 객체의 해당 키 값의 value는 기본적으로 정해져 있다
    // 외부에서 value를 수정하려면 myCar.model = "빨간색" 이런 식으로 재할당해야함.
    // this.model this 생략
    model = "트레일 블레이저";
    color = "파랑색";
    price = 2571;
  }

  // 매개변수가 있는 생성자. 사용자가 직접 만들어야 함
  // 객체 생성 시 매개변수로 받은 데이터를 기반으로 필드를 초기화 함
  public Car3(String company, String type, String model, String color, int price) {
    // this: 클래스 내부에서 객체 자기 자신임을 나타내는 키워드
    // Car3 클래스로 생성된 객체 자신을 뜻하고 매개변수와 필드명이 같을 때 구분 가능
    // 여기서 매개변수와 필드명이 같은 것은 매개변수를 생성되는 객체의 키 값이 무엇인지 명확하게 의미 전달 되기 때문
    this.company = company;
    this.type = type;
    this.model = model;
    this.color = color;
    this.price = price;
  }

}
