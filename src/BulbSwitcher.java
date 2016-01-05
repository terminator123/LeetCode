/**
 * 
 * @author chenqun
 * There are n bulbs that are initially off.
 * You first turn on all the bulbs. Then, you turn off every second bulb. 
 * On the third round, you toggle every third bulb (turning on if it's off or turning off if it's on).
 * For the nth round, you only toggle the last bulb.
 * Find how many bulbs are on after n rounds.
 *
 */
//灯泡被操作奇数次后仍是打开，有奇数个公约数的n次后仍是打开，此数是完全平方数
public class BulbSwitcher {

	public int bulbSwitch(int n){
		int count = 0;
		for(int i=1; i<=Math.sqrt(n); i++){
			if(i*i<=n)
				count ++;
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
