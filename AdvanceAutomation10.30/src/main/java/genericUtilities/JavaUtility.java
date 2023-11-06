package genericUtilities;

import java.util.Random;
/**
 * 
 * @author ABHI
 *
 */
public class JavaUtility {
	/**
	 * This method is used to generate random number in the given range.
	 * @param range
	 * @return integer  value of the given number.
	 */
	public int generateRandomNumber(int range) {
		Random r=new Random();
				return r.nextInt(range);

	}
}
