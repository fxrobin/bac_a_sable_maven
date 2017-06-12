package demo;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class CreatePdfTests {

	@Test
	public void testCreateDummyPdf() throws IOException {
		String file = System.getProperty("java.io.tmpdir")+"/dummy.pdf";
		CreatePdf.createDummyPdf(file);
		assertTrue(Files.exists(Paths.get(file)));
		
	}

}
