package testProject;
import  qlTypes.QlString;
import static org.junit.Assert.*;

import org.junit.Test;

public class QlStringTest {

	@Test
	public void testgetValue() {
		
		QlString test= new QlString();
		
		assertEquals("ontwo", test.QLString("ontwo"));

		
	}
    
}
