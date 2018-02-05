package Infrastructure;

public class ProgramArguments {

  public static void main(String[] args) {

    if (args.length ==0 ){
      System.out.println("Error");
      System.exit(-1);
    }
    String command = args[0];
    switch (command){
      case "-pow":
        if (args.length<3)
          System.out.println("Error");
        else
       System.out.println(Math.pow(Double.parseDouble(args[1]), Double.parseDouble(args[2])));
  }
    System.out.println(Math.sqrt(Double.parseDouble(args[3])));
}
}
