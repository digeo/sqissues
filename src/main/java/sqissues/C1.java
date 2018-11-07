/**
 * 
 */
package sqissues;

/**
 * @author George Digkas <digasgeo@gmail.com>
 *
 */
public class C1 {

	private int p1;
	private int p2;

	public C1() {

	}

	public C1(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public int getP1() {
		return p1;
	}

	public void setP1(int p1) {
		this.p1 = p1;
	}

	public int getP2() {
		return p2;
	}

	public void setP2(int p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "C1 [p1=" + p1 + ", p2=" + p2 + "]";
	}

	public void print() {
		System.out.println("C1 [p1=" + p1 + ", p2=" + p2 + "]");
	}

}
