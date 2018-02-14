package Infrastructure;

public class RandomString {

  public static void main(String[] args) {
    System.out.println(random("alpha", 10));
    System.out.println(random("numeric", 10));
    System.out.println(random("alphanumeric", 10));
  }

  public static String random (String mode, int length){
    String alphabet;
    switch (mode){
      case "alpha":
        alphabet = "abcdefghijklmnopqrstuvwxys";
        break;
      case "numeric":
        alphabet = "0123456789";
        break;
      case "alphanumeric":
        alphabet = "abcdefghijklmnopqrstuvwxys0123456789";
        break;
      default:
        alphabet = "";
    }
    String result = "";
    for (int i=0; i<length; i++){
      int index = (int) (Math.random()*alphabet.length());
      result += alphabet.charAt(index);
    }
    return result;
  }
}
