package HOME_TASKS.Lesson_4;

public class Magic8Ball {

  public static void main(String[] args) {
    // 	Random number generator [0;19]
    String[] phrases = {"It is certain","It is decidedly so","Without a doubt","Yes, definitely",
            "You may rely on it","As I see it, yes","Most likely","Outlook good","Yes","Sings point to yes",
            "Reply hazy try again","Ask again later","Better not tell you now","Cannot predict now",
            "Concentrate and ask again","Don't count on it","My reply is no","My sources say no",
            "Outlook not so good","Very doubtful"};
    System.out.println(phrases[(int) (Math.random() * 20)]);
  }
}
