package HOME_TASKS.Lesson_9;

public class MyApp {
  public static void main(String[] args) {

    Writer writer = new Writer();
    writer.writePost();

    Reader reader = new Reader();
    reader.likePost();
    reader.postComment();
    reader.postComment();
    reader.postComment();
    reader.postComment();
    reader.postComment();

    Moderator moderator = new Moderator();
    moderator.postComment();

    reader.postComment();
    reader.postComment();
    reader.postComment();

    moderator.deleteComment();
    moderator.deleteComment();
    moderator.deleteComment();
    moderator.hideArticle();

    Admin admin = new Admin();
    admin.deleteArticle();
    admin.bunReader();


  }
}
