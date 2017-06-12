package demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
	public void testJava8() {
		Integer[] data = { 12, 13, 14, 15, 16 };
		List<Integer> dataList = Arrays.stream(data).collect(Collectors.toList());
		Integer somme = Arrays.stream(data).reduce(0, (r, v) -> r + v);
		assertNotNull(dataList);
		assertEquals(5, dataList.size());
		assertEquals(70, somme.intValue());
	}

}
