import static java.lang.Math.random;
public class snakeandladder {
      public static final int NO_PLAY = 0;
      public static final int LADDER = 1;
      public static final int SNAKE = 2;
      public static final int WINNING_POSITION = 100;

 public static void main(String[] args) {
      int Position = 0;
      int Roll = 0;
      int Start = 0;
      int Reach = 0;
      while (Reach < WINNING_POSITION ) {
      Reach++;
         int Value =(int) Math.floor((Math.random() * 6) + 1 );
         System.out.println("Die Number Value: " + Value);

         int option =(int) Math.floor((Math.random() * 10) % 3 );
         System.out.println("option number: " + option);

         switch (option) {
             case NO_PLAY:
                           Position += 0;
             case LADDER:
                       if((Position + Value) <= 100){
                           Position += Value;
                           Reach = Position;
                      }
                      else
                           Position +=0;
                           Reach = Position;
                           break;
             case SNAKE:
                     if (Position > 0){
                         Position -= Value;
                         Reach = Position;
                     }
                     else
                         Position = 0;
                         Reach = Position;
                     break;
        }
        System.out.println("Position" +Reach);
        if (Position < 0){
            Reach = 0;
        }
     }
      System.out.println("WINNING POSITION: " +Reach);
  }
}
