/**
 * 
 */
package sqissues;

/**
 * @author George Digkas <digasgeo@gmail.com>
 *
 */
public class C2 {

	private int p1;
	private int p2;
	private int p3;

	public C2() {

	}

	public C2(int p1, int p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public C2(int p1, int p2, int p3) {
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
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

	public int getP3() {
		return p3;
	}

	public void setP3(int p3) {
		this.p3 = p3;
	}

	@Override
	public String toString() {
		return "C2 [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]";
	}

	public void print() {
		System.out.println("C2 [p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + "]");
	}

}
