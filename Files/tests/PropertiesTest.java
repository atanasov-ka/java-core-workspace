import static org.junit.Assert.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PropertiesTest {

	private Path path = Paths.get("D:\\Users\\John\\workspace2\\Files\\src\\testProp2.properties");
	
	@Before
	public void setUp()
	{
		try {
			Path f = Files.createFile(path);
			List<String> lines = new ArrayList<String>();
			
			lines.add("#asds=3233");
			lines.add("cad=2323");
			lines.add("asss=#aasd");
			lines.add("a#add=3232");
			Files.write(f, lines, Charset.defaultCharset());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testParseProperties() {
		Map<String, String> res = null;
		try {
			res = PropertiesParser.parseProperties(path);
			assertEquals(3, res.size());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void tearDown()
	{
		try {
			Files.delete(path);
		} catch (IOException e) {		
			e.printStackTrace();
		}
	}

}
