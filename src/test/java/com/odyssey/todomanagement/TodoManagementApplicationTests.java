package com.odyssey.todomanagement;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TodoManagementApplicationTests {

	String str = "Daniel";
	
	// assertEquals(Exepected Result, Actual Result)
	//

	@Test
	public void contextLoads() {
	}
		
	@Test
	public void testString() {
		assertEquals("Daniel",str);
	}

	@Test
	public void testReverseString() {
		
		
	}

}
