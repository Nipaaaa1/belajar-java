public class Friend {
  static int totalFriend = 0;
  String name;

  Friend(String name) {
    this.name = name;
    totalFriend++;
  }

  static void friendsCount() {
    System.out.println("You have " + totalFriend + " friends!");
  }
}
