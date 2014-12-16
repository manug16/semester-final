import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;
/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	public Sentry() {
      super(1, 1, Display.NORTH, Display.INFINITY);
   }
   public Sentry(int x, int y) {
      super(x, y, Display.NORTH, Display.INFINITY);
   }

	public void patrol() {
      while(frontIsClear()) {
         move();
         while(!nextToABeeper()) {
            move();
         }
         turnRight();
     }
   }
}

