package demo;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class DummyEntityTests {

	@Test
	public void testBuilding() {
		
		DummyEntity o = DummyEntity.builder().name("Wayne").firstName("Bruce").build();
		assertNotNull(o);
		assertEquals("Wayne", o.getName());
		assertEquals("Bruce", o.getFirstName());
		
	}
	
	@Test
	public void testJava8()
	{
		int[] data = {12,13,14,15,16};
		Arrays.stream(data).forEach(System.out::println);
	}

}
