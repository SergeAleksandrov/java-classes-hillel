package HOME_TASKS.Lesson_9;

public class Moderator extends Writer {

  @Override
  public void postComment() {
    System.out.println("Moderator replies to comment");
  }
  public void deleteComment(){
    System.out.println("Moderator deletes comment");
  }
  public void hideArticle(){
    System.out.println("Article marked as hidden");
  }

}
