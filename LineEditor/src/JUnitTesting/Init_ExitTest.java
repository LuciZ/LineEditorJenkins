package JUnitTesting;

import LineEditor.File_Buffer;
import LineEditor.Init_Exit;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Init_ExitTest
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	@Before
	public void setUpStreams()
	{
		System.setOut(new PrintStream(outContent));
	}
	
	@After
	public void restoreStreams()
	{
		System.setOut(System.out);
	}
	
	@Test
	public void test1() throws IOException
	{
		File_Buffer file_buffer = new File_Buffer();
		Init_Exit instance = new Init_Exit(new String[]{"hello.txt"}, file_buffer);
		
		assertEquals("", outContent.toString());
	}
	
	@Test
	public void test2() throws IOException
	{
		File_Buffer file_buffer = new File_Buffer();
		Init_Exit instance = new Init_Exit(new String[]{"nope.txt"}, file_buffer);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n", outContent.toString());
	}
	
	@Test
	public void test3() throws IOException
	{
		File_Buffer file_buffer = new File_Buffer();
		Init_Exit instance = new Init_Exit(new String[]{}, file_buffer);
		
		assertEquals("PROGRAM INVOCATION ARGUMENT ERROR(S): Terminating the program...\r\n", outContent.toString());
	}
}