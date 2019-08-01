package rockpaperscissors;
import java.util.Random;

public class ComputerGenerator {
	static Random Generator = new Random();
	
	static int computerPick() {
		return (Generator.nextInt(3));
	}
	
	
}
