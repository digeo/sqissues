/**
 * 
 */
package sqissues;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author George Digkas <digasgeo@gmail.com>
 *
 */
public class C4 {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

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
		logger.info("C4 [foo={}]", foo);
	}

	@Override
	public String toString() {
		return "C4 [foo=" + foo + "]";
	}

}
