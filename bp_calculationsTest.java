import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class bp_calculationsTest {

	public bp_calculations bp_calc;
	@Before
	public void setUp() throws Exception {
		bp_calc = new bp_calculations();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAssign_parvalue() {
		double[] probDist1 = {0.3, 0.2, 0.4, 0.1};
		assertEquals(bp_calc.assign_parvalue(probDist1, 0.5),1);
		double[] probDist2 = {1.0, 0.0};
		assertEquals(bp_calc.assign_parvalue(probDist2, 1),0);
		double[] probDist3 = {0.0, 1.0};
		assertEquals(bp_calc.assign_parvalue(probDist3, 1),1);
	}

}
