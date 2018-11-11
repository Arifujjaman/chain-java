package chainofresponsibility;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestNumberCalculate {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		Chain chainCalc1=new AddNumbers();
		Chain chainCalc2=new SubNumbers();
		Chain chainCalc3=new MultiplyNumbers();
		Chain chainCalc4=new DivisionNumbers();
		
		chainCalc1.setNextChain(chainCalc2);
		chainCalc2.setNextChain(chainCalc3);
		chainCalc3.setNextChain(chainCalc4);
		
		assertEquals("5.0",chainCalc1.calculate(new Numbers(3.0,2.0,"add")));
		assertEquals("1.0",chainCalc2.calculate(new Numbers(3.0,2.0,"sub")));
		assertEquals("6.0",chainCalc3.calculate(new Numbers(3.0,2.0,"multi")));
		assertEquals("2.0",chainCalc4.calculate(new Numbers(4.0,2.0,"div")));
		
	}

	

}
