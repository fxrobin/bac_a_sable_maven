package demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class DummyEntityTests {

	@Test
	public void building() {
		
		DummyEntity o = DummyEntity.builder().name("Wayne").firstName("Bruce").build();
		assertNotNull(o);
		assertEquals("Wayne", o.getName());
		assertEquals("Bruce", o.getFirstName());
		
	}

}
