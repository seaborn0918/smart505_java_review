public class Car3Ex {
  public static void main(String[] args) {
    // 컴파일러가 자동으로 기본 생성자를 생성하기 때문에 기본 생성자를 이용하여 객체를 생성
    Car3 myCar = new Car3();
    System.out.println(myCar.company);
    System.out.println(myCar.model);
    System.out.println(myCar.type);
    System.out.println(myCar.color);
    System.out.println(myCar.price);

    Car3 myCar2 = new Car3("르노자동차", "세단", "SM6", "밝은 회색", 2850);
    System.out.println(myCar2.company);
    System.out.println(myCar2.type);
    System.out.println(myCar2.model);
    System.out.println(myCar2.color);
    System.out.println(myCar2.price);

  }
}
