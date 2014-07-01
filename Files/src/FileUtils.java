import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class FileUtils {
	private FileUtils() {
		
	}
	
	public static String readFrom(File file) throws IOException
	{
		return new String(Files.readAllBytes(file.toPath()), Charset.defaultCharset());
	}
	
	public static String readFrom(Path path) throws IOException
	{
		return readFrom(path.toFile());
	}
}
