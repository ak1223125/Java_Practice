public class ContinueKeyword {
    public static void main(String[] args) {
        start : for (int i = 0; i < 10; i++) {
            if (i == 4) {
            continue start;
          }
          System.out.println(i);
        }  
      }
}
