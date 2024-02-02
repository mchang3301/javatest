public class HelloWorld {

    public static void zoop(String insult) {
        baffle();
        System.out.print(“You “ + insult);
      }
      
      public static void main(String[] args) {
        System.out.print(“No, I “);
        zoop(“wugga!”);
        System.out.print(“I “);
        baffle();
      } 
      
      public static void baffle() {
        int x = 5;
        System.out.print(“don’t, you do!”)
      }
      
}