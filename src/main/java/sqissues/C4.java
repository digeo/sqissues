/**
 * 
 */
package sqissues;

/**
 * @author George Digkas <digasgeo@gmail.com>
 *
 */
public class C4 {

	private int foo;

	public C4(int foo) {
		this.foo = foo;
	}

	public int getFoo() {
		return foo;
	}

	public void setFoo(int foo) {
		this.foo = foo;
	}

	public void print() {
		System.out.println("C4 [foo=" + foo + "]");
	}

	@Override
	public String toString() {
		return "C4 [foo=" + foo + "]";
	}

}
