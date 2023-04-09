public class CarEx {
  public static void main(String[] args) {
    Car myCar = new Car();
    // Car: 클래스
    // myCar: 클래스 타입의 변수
    // new: 객체 생성 키워드. 생성된 객체의 주소를 myCar에 할당
    // Car(): 생성자
    System.out.println("제작회사 : " + myCar.company);
    System.out.println("모델명 : " + myCar.model);
    System.out.println("색상 : " + myCar.color);
    System.out.println("최고속도 : " + myCar.maxSpeed);
    System.out.println("현재속도 : " + myCar.speed);

    myCar.speed = 58;
    System.out.println("수정된 현재속도 : " + myCar.speed);

    // 하나의 클래스로 여러 개의 객체 생성
    // 필드는 같지만 저장되어 있는 데이터는 서로 다름. 객체가 다르기 때문(레퍼런스가 가리키는 객체가 다르다);
    Car yourCar = new Car();
    yourCar.company = "기아자동차";
    yourCar.model = "EV6";
    yourCar.color = "밝은 회색";
    yourCar.maxSpeed = 300;
    yourCar.speed = 40;

    System.out.println("제작회사 : " + yourCar.company);
    System.out.println("모델명 : " + yourCar.model);
    System.out.println("색상 : " + yourCar.color);
    System.out.println("최고속도 : " + yourCar.maxSpeed);
    System.out.println("현재속도 : " + yourCar.speed);
  }
}
