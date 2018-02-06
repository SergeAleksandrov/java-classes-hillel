package HOME_TASKS.Lesson_5;

public class Convertors {

  public static void main(String[] args) {

    // Temperature convertors
    System.out.println("Temperature convertors");
    double celsius = 20.0;
    double kelvin = 120;
    double fahrenheit = 100;

    System.out.println(Math.round(celsiusToKelvin (celsius)));
    System.out.println(Math.round(kelvinToCelsius (kelvin)));
    System.out.println(Math.round(celsiusToFahrenheit (celsius)));
    System.out.println(Math.round(fahrenheitToCelsius (fahrenheit)));
    System.out.println();

    // Distance convertors
    System.out.println("Distance convertors");
    double meters = 100;
    double inches = 250;
    double miles = 60;
    double kilometers = 60;

    System.out.println(Math.round(metersToInches (meters)));
    System.out.println(Math.round(InchesToMeters (inches)));
    System.out.println(Math.round(milesToKilometers (miles)));
    System.out.println(Math.round(KilometersToMiles (kilometers)));
    System.out.println();

    // Weight convertors
    System.out.println("Weight convertors");
    double pounds = 100;
    double kilograms = 200;

    System.out.println(Math.round(poundsToKilograms (pounds)));
    System.out.println(Math.round(KilogramsToPounds (kilograms)));
    System.out.println();

   // Math convertors
    System.out.println("Math convertors");
    int inputBinary = 232;
    String inputDecimal = "11101000";

    BinaryToDecimal(inputBinary);
    DecimalToBinary(inputDecimal);
  }

  // Temperature convertors

  public static double celsiusToKelvin (double celsius){
    return celsius + 273.15;
  }
  public static double kelvinToCelsius (double kelvin){
    return kelvin - 273.15;
  }
  public static double celsiusToFahrenheit (double celsius){
    return celsius * 1.8 + 32;
  }
  public static double fahrenheitToCelsius (double fahrenheit){
    return (fahrenheit - 32) / 1.8;
  }

  // Distance convertors

  public static double metersToInches (double meters){
    return meters * 39.37;
  }
  public static double InchesToMeters (double inches){
    return inches * 0.0254;
  }
  public static double milesToKilometers (double miles){
    return miles * 1.60934;
  }
  public static double KilometersToMiles (double kilometers){
    return kilometers * 0.621371;
  }

  // Weight convertors

  public static double poundsToKilograms (double pounds){
    return pounds * 0.453592;
  }
  public static double KilogramsToPounds (double kilograms){
    return kilograms * 2.20462;
  }

  // Math convertors

  public static void BinaryToDecimal(int inputBinary){
    System.out.println(Integer.toBinaryString(inputBinary));
  }
  public static void DecimalToBinary(String inputDecimal){
    System.out.println(Integer.parseInt(inputDecimal,2));
  }
}
