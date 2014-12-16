/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
import edu.fcps.karel2.Robot;
import org.asl.karelx.Squarebot;
import edu.fcps.karel2.Display;

public class TestChallenge1 {

	public static void main(String[] args) {
       Display.setSize(10, 10);
		 Display.setSpeed(5);
       Squarebot manu = new Squarebot(9, 3);
       manu.layCorners(5);
       Sentry eddie = new Sentry(4, 3);
       eddie.patrol();
	}

}
