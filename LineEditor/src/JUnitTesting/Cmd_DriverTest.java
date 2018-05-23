package JUnitTesting;

import LineEditor.Cmd_Driver;
import LineEditor.File_Buffer;
import LineEditor.Init_Exit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class Cmd_DriverTest
{
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	Cmd_Driver Run_Command = new Cmd_Driver();
	
	File_Buffer FILE;
	Init_Exit Start_End;
	
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
	
	private void readFile(String fileName) throws IOException
	{
		FILE = new File_Buffer();
		Start_End = new Init_Exit(new String[]{fileName}, FILE);
	}
	
	@Test
	public void cmd_HTest1() throws Exception
	{
		Run_Command.Cmd_H("A");
		
		assertNotEquals("", outContent.toString());
	}
	
	@Test
	public void cmd_HTest2() throws Exception
	{
		Run_Command.Cmd_H(null);
		
		assertNotEquals("", outContent.toString());
	}
	
	@Test
	public void cmd_TTest1() throws Exception
	{
		readFile("hello.txt");
		FILE.SetCLN(3);
		
		Run_Command.Cmd_T(FILE);
		
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_TTest2() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_T(FILE);
		
		assertEquals(0, FILE.GetCLN());
	}
	
	
	@Test
	public void cmd_ETest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_E(FILE);
		
		assertEquals(5, FILE.GetCLN());
	}
	
	@Test
	public void cmd_ETest2() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_E(FILE);
		
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_NTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_N(FILE, 3);
		
		assertEquals(4, FILE.GetCLN());
	}
	
	@Test
	public void cmd_NTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_N(FILE, -1);
		
		assertEquals(1, FILE.GetCLN());
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_NTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_N(FILE, 4);
		
		assertEquals(0, FILE.GetCLN());
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_BTest1() throws Exception
	{
		readFile("hello.txt");
		FILE.SetCLN(4);
		
		Run_Command.Cmd_B(FILE, 2);
		
		assertEquals(2, FILE.GetCLN());
	}
	
	@Test
	public void cmd_BTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_B(FILE, -1);
		
		assertEquals(1, FILE.GetCLN());
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_BTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_B(FILE, 2);
		
		assertEquals(0, FILE.GetCLN());
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_WTest1() throws Exception
	{
		readFile("hello.txt");
		FILE.SetCLN(2);
		
		Run_Command.Cmd_W(FILE);
		
		assertEquals("At Edit File Line 2\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_WTest2() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_W(FILE);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"At Edit File Line 0\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_CTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_C(FILE);
		
		assertEquals("Total Edit File Lines: 5\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_CTest2() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_C(FILE);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"Total Edit File Lines: 0\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_LTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_L(FILE, 3);
		
		assertEquals("hello world!\r\n" +
				"       \r\n" +
				"Hello\r\n", outContent.toString());
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void cmd_LTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_L(FILE, -1);
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_LTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_L(FILE, 2);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_STest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_S(FILE, 3);
		
		assertEquals("hello world!\r\n" +
				"       \r\n" +
				"Hello\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_STest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_S(FILE, -2);
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_STest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_S(FILE, 10);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_DTest1() throws Exception
	{
		readFile("hello.txt");
		int originalFileLines = FILE.NumLins();
		
		Run_Command.Cmd_D(FILE, 3);
		
		assertEquals(originalFileLines - 3, FILE.NumLins());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_DTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_D(FILE, -3);
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_DTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_D(FILE, 1);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_ATest2() throws Exception
	{
		readFile("hello.txt");
		int originalFileLines = FILE.NumLins();
		
		ByteArrayInputStream in = new ByteArrayInputStream(("\r\n").getBytes());
		System.setIn(in);
		
		Run_Command.Cmd_A(FILE);
		
		assertEquals(originalFileLines, FILE.NumLins());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_FTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_F(FILE, 3, "e");
		
		
		assertEquals("1: hello world!\r\n" +
				"3: Hello\r\n", outContent.toString());
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void cmd_FTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_F(FILE, -3, "hello");
		
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_FTest3() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_F(FILE, 4, "");
		
		
		assertEquals("A NULL (0 LENGTH) STRING HAS NO MEANING HERE:  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_FTest4() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_F(FILE, 3, "asdf");
		
		
		assertEquals("", outContent.toString());
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void cmd_FTest5() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_F(FILE, 1, "search");
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_R(FILE, 3, "e", "E");
		
		assertEquals("hEllo world!\r\n" +
				"HEllo\r\n", outContent.toString());
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_R(FILE, 1, "hello", "i wanna go home");
		
		assertEquals("i wanna go home world!\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest3() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_R(FILE, -1, "test", "sdf");
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest4() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_R(FILE, 4, "", "");
		
		
		assertEquals("A NULL (0 LENGTH) STRING HAS NO MEANING HERE:  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest5() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_R(FILE, 3, "kanna", "love");
		
		assertEquals("", outContent.toString());
		assertEquals(3, FILE.GetCLN());
	}
	
	@Test
	public void cmd_RTest6() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_R(FILE, 1, "search", "replace");
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_YTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_Y(FILE, 2);
		
		assertEquals(2, FILE.GetCLN());
	}
	
	@Test
	public void cmd_YTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_Y(FILE, -2);
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_YTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_Y(FILE, 1);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_ZTest1() throws Exception
	{
		readFile("hello.txt");
		int originalFileLines = FILE.NumLins();
		
		Run_Command.Cmd_Z(FILE, 3);
		
		assertEquals(originalFileLines - 3, FILE.NumLins());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_ZTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_Z(FILE, -1);
		
		assertEquals("NUMBER LINES VALUE MUST BE POSITIVE & NONZERO.  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_ZTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_Z(FILE, 1);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
		assertEquals(0, FILE.GetCLN());
	}
	
	@Test
	public void cmd_PTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_P(FILE);
		
		assertEquals("NO LINES IN YANK BUFFER TO PUT:  No action taken.\r\n", outContent.toString());
		assertEquals(1, FILE.GetCLN());
	}
	
	@Test
	public void cmd_PTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_Y(FILE, 3);
		FILE.SetCLN(1);
		
		Run_Command.Cmd_P(FILE);
		
		assertEquals(4, FILE.GetCLN());
		assertEquals(8, FILE.NumLins());
	}
	
	@Test
	public void cmd_ITest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_I(FILE);
		
		assertEquals("THERE ARE NO KEYWORDS AT TOP OF FILE TO INDEX:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_ITest2() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_I(FILE);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"THERE ARE NO KEYWORDS AT TOP OF FILE TO INDEX:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_ITest3() throws Exception
	{
		readFile("indexing.txt");
		
		Run_Command.Cmd_I(FILE);
		
		assertEquals("", outContent.toString());
	}
	
	@Test
	public void cmd_ITest4() throws Exception
	{
		readFile("emptyIndexing.txt");
		
		Run_Command.Cmd_I(FILE);
		
		assertEquals("", outContent.toString());
	}
	
	@Test
	public void cmd_KTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_K("index");
		
		assertEquals("THIS KEYWORD DOES NOT EXIST:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_KTest2() throws Exception
	{
		readFile("indexing.txt");
		Run_Command.Cmd_I(FILE);
		
		Run_Command.Cmd_K("");
		
		assertEquals("A NULL (0 LENGTH) STRING HAS NO MEANING HERE:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_KTest3() throws Exception
	{
		readFile("indexing.txt");
		Run_Command.Cmd_I(FILE);
		
		Run_Command.Cmd_K("index1");
		
		assertEquals("1  \r\n", outContent.toString());
	}
	
	@Test
	public void cmd_KTest4() throws Exception
	{
		readFile("indexing.txt");
		Run_Command.Cmd_I(FILE);
		
		Run_Command.Cmd_K("good");
		
		assertEquals("THIS KEYWORD DOES NOT EXIST:  No action taken.\r\n", outContent.toString());
	}
	
	
	@Test
	public void cmd_OTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_O(FILE, 1);
		
		assertEquals(1, FILE.GetCLN());
		
		Run_Command.Cmd_S(FILE, 10);
		
		assertEquals("hello world!\r\n" +
				"       \r\n" +
				"Hello\r\n" +
				"testing\r\n" +
				"insert many lines\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_OTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_O(FILE, 4);
		
		assertEquals(4, FILE.GetCLN());
		
		FILE.SetCLN(1);
		Run_Command.Cmd_S(FILE, 10);
		
		assertEquals("       \r\n" +
				"Hello\r\n" +
				"hello world!\r\n" +
				"testing\r\n" +
				"insert many lines\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_OTest3() throws Exception
	{
		readFile("nope.txt");
		
		Run_Command.Cmd_O(FILE, 4);
		
		assertEquals("USER EDIT FILE EMPTY:  No information read - file created.\r\n" +
				"ILLEGAL COMMAND WHEN NO EDIT FILE LINES EXIST:  No action taken.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_MTest1() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_M(1, 2);
		
		assertEquals("COMMAND NOT IMPLEMENTED (for F, R, O) YET.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_MTest2() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_M(4, 1);
		
		assertEquals("REVERSED OR BACKWARDS COLUMN RANGES ARE ILLEGAL:  No action taken.\r\n" +
				"COMMAND NOT IMPLEMENTED (for F, R, O) YET.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_MTest3() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_M(-10, -10);
		
		assertEquals("COLUMN VALUES MUST BE POSITIVE & NONZERO:  No action taken.\r\n" +
				"COMMAND NOT IMPLEMENTED (for F, R, O) YET.\r\n", outContent.toString());
	}
	
	@Test
	public void cmd_MTest4() throws Exception
	{
		readFile("hello.txt");
		
		Run_Command.Cmd_M(-1, 2);
		
		assertEquals("COLUMN VALUES MUST BE POSITIVE & NONZERO:  No action taken.\r\n" +
				"COMMAND NOT IMPLEMENTED (for F, R, O) YET.\r\n", outContent.toString());
	}
}