import static java.lang.Math.random;
public class snakeandladder {
      public static final int NO_PLAY = 0;
      public static final int LADDER = 1;
      public static final int SNAKE = 2;

 public static void main(String[] args) {
      int Start = 4;
      int Roll = 0;
      int Value =(int) Math.floor((Math.random() * 6) + 1 );
      System.out.println("Die Number Value: " + Value);
      int option =(int) Math.floor((Math.random() * 10) % 3 );
      System.out.println("Die Number Value: " + option);

      switch (option) {
             case NO_PLAY:
                   Roll = Roll;
                   break;
             case LADDER:
                   Roll = + Value;
                   break;
             case SNAKE:
                   Roll = -Value;
     }
     int Position =(Start + Roll);
     System.out.println("Current Position: " + Position);
  }
}
