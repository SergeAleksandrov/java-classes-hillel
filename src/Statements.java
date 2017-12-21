public class Statements {
  public static void test(){
    int a = 34;

    if (a<18){
      System.out.println("Поздравляем, Вы школьник!");
      System.out.println("Скидка - 50%");
    }
    else if (a>=18 && a <55) {
      if (a == 35) {
        System.out.println("Поздравляем, Вам 35 лет!");
      }
        System.out.println("Поздравляем, Вы совершеннолетний!");
        System.out.println("Скидка - 0%");
     }
      else {
        System.out.println("Поздравляем! Скидка - 35%");
    }
  }
    public static void testSwitch(){
      int a = 34;

      switch (a){
        case 18: System.out.println("Поздравляем, Вы совершеннолетний!");
        break;
        case 17: System.out.println("Вы несовершеннолетний!");
        break;
        default: System.out.println("Вам не 17 и не 18 лет");
      }

    }
    public static void ternary(){
    int age = 55;
    String message = age < 18 ? "Поздравляем, Вы школьник! Скидка 50%":
                     (age>=18 && age <55) ? "Поздравляем, Вы совершеннолетний! Скидка 0%" :
                             "Поздравляем! Скидка - 35%";
      System.out.println(message);

    }


    public static void main(String[] args) {
    ternary();
    //test();
    //testSwitch();
  }
}
