public class Main {

  public static void main(String[] args) {
    // 26 - Static keyword
    Friend friend1 = new Friend("Udin");
    Friend friend2 = new Friend("Jamal");
    Friend friend3 = new Friend("Asep");

    // Static method is accessable through the class itself
    Friend.friendsCount();
  }
}
