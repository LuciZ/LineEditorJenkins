package JUnitTesting;

import LineEditor.File_Buffer;
import LineEditor.Parser;
import LineEditor.UserCmd;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ParserTest
{
	File_Buffer file_buffer = new File_Buffer();
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
		System.setIn(System.in);
	}
	
	@Test
	public void test1() throws Exception
	{
		ByteArrayInputStream in = new ByteArrayInputStream("XYZ123".getBytes());
		System.setIn(in);
		
		UserCmd cmd = Parser.parseCmdLine();
		
		assertEquals("EditCmd> \nTHIS IS VAN'S EDITOR!!\n\r\n", outContent.toString());
		assertTrue(cmd.getOkSyntax() == false);
	}
	
	@Test
	public void test2() throws Exception
	{
		ByteArrayInputStream in = new ByteArrayInputStream("A A A".getBytes());
		System.setIn(in);
		
		UserCmd cmd = Parser.parseCmdLine();
		
		assertEquals("EditCmd> ", outContent.toString());
		assertTrue(cmd.getOkSyntax() == false);
	}
	
	@Test
	public void test3() throws Exception
	{
		ByteArrayInputStream in = new ByteArrayInputStream("V".getBytes());
		System.setIn(in);
		
		UserCmd cmd = Parser.parseCmdLine();
		
		assertEquals("EditCmd> ", outContent.toString());
		assertTrue(cmd.getOkSyntax() == false);
	}
	
	@Test
	public void test4() throws Exception
	{
		ByteArrayInputStream in = new ByteArrayInputStream("N 1".getBytes());
		System.setIn(in);
		
		UserCmd cmd = Parser.parseCmdLine();
		
		assertEquals("EditCmd> ", outContent.toString());
		assertTrue(cmd.getOkSyntax() == true);
		assertEquals("N 1", cmd.getCmdLine());
	}
}