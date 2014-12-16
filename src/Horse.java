import org.asl.karelx.Wanderer;
import edu.fcps.karel2.Display;
/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	public Horse() {
      super(6, 5);
   }
	
	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
      int timer2 = timer;
      int n = 0;
      while(count != 0) {
         wander();         
         count--;
         n++;
         if(n == timer2) {
            putBeeper();
            timer2 = timer2 + timer;
         }
      }
         
	}
}
