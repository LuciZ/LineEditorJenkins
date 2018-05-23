package RandoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class File_BufferTest
{

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test001");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test002");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        java.lang.Class<?> wildcardClass3 = file_Buffer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test003");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        file_Buffer0.SetCLN(100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test004");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.NumLins();
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test005");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        file_Buffer0.AddLine(0, "hi!");
        file_Buffer0.SetCLN((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test006");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        file_Buffer0.SetCLN(0);
        int int10 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test007");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (byte) 0);
        int int7 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test008");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.AddLine((int) (short) 0, "");
        int int8 = file_Buffer0.GetCLN();
        int int9 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test009");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (byte) 100);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test010");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test011");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.GetCLN();
        int int7 = file_Buffer0.GetCLN();
        int int8 = file_Buffer0.NumLins();
        java.lang.String str10 = file_Buffer0.GetLine((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test012");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        java.lang.String str6 = file_Buffer0.GetLine(1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test013");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (short) 100);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test014");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (short) 100);
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test015");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (short) 100);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test016");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass3 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test017");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        int int5 = file_Buffer0.GetCLN();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test018");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass3 = file_Buffer0.getClass();
        int int4 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test019");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '#');
        int int8 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = file_Buffer0.getClass();
        boolean boolean12 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test020");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test021");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test022");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (byte) 0);
        file_Buffer0.AddLine(0, "");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test023");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (short) 10);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        int int10 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test024");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.SetCLN(10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test025");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN(0);
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test026");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        int int8 = file_Buffer0.GetCLN();
        int int9 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test027");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN(100);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.AddLine(0, "hi!");
        int int11 = file_Buffer0.GetCLN();
        int int12 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test028");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test029");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        file_Buffer0.AddLine(0, "hi!");
        java.lang.Class<?> wildcardClass12 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test030");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        java.lang.String str4 = file_Buffer0.GetLine(0);
        int int5 = file_Buffer0.NumLins();
        int int6 = file_Buffer0.NumLins();
        file_Buffer0.SetCLN((int) 'a');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test031");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.SetCLN(35);
        file_Buffer0.SetCLN((int) '#');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test032");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test033");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (short) 100);
        int int8 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(false);
        boolean boolean11 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test034");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        int int9 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test035");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        int int8 = file_Buffer0.GetCLN();
        int int9 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test036");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        file_Buffer0.setUpdateFlag(true);
        int int9 = file_Buffer0.NumLins();
        int int10 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test037");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.NumLins();
        file_Buffer0.SetCLN((int) (byte) 100);
        file_Buffer0.setUpdateFlag(true);
        java.lang.String str10 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean11 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test038");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test039");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        int int7 = file_Buffer0.GetCLN();
        int int8 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test040");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (short) 10);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        java.lang.String str9 = file_Buffer0.GetLine((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test041");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test042");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        int int8 = file_Buffer0.GetCLN();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        int int10 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test043");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        int int7 = file_Buffer0.GetCLN();
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test044");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        int int7 = file_Buffer0.NumLins();
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test045");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test046");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        file_Buffer0.setUpdateFlag(true);
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test047");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.NumLins();
        file_Buffer0.SetCLN((int) (short) 1);
        int int7 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test048");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        int int6 = file_Buffer0.GetCLN();
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test049");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test050");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test051");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test052");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        file_Buffer0.AddLine((int) (byte) 0, "");
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        int int10 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test053");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.setUpdateFlag(true);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test054");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test055");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (short) 100);
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test056");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test057");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.NumLins();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test058");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test059");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (short) 1);
        int int8 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test060");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '#');
        int int8 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) 100);
        int int11 = file_Buffer0.GetCLN();
        boolean boolean12 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test061");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test062");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        int int4 = file_Buffer0.NumLins();
        boolean boolean5 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test063");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.AddLine((int) (short) 0, "");
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.NumLins();
        file_Buffer0.SetCLN((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test064");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        file_Buffer0.AddLine((int) (byte) 0, "");
        file_Buffer0.DelLine(1);
        java.lang.Class<?> wildcardClass11 = file_Buffer0.getClass();
        boolean boolean12 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test065");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '#');
        int int8 = file_Buffer0.GetCLN();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        int int12 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test066");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        file_Buffer0.AddLine((int) (byte) 0, "");
        int int9 = file_Buffer0.NumLins();
        file_Buffer0.PutLine(1, "hi!");
        file_Buffer0.AddLine((int) (short) 1, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test067");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int6 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test068");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        file_Buffer0.AddLine((int) (byte) 0, "");
        file_Buffer0.AddLine(0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test069");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (short) 1);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test070");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test071");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.SetCLN(0);
        java.lang.Class<?> wildcardClass11 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test072");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass11 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass12 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test073");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        int int10 = file_Buffer0.NumLins();
        file_Buffer0.AddLine((int) (byte) 0, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test074");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test075");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test076");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.setUpdateFlag(false);
        int int8 = file_Buffer0.GetCLN();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test077");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test078");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.GetCLN();
        int int7 = file_Buffer0.GetCLN();
        int int8 = file_Buffer0.NumLins();
        java.lang.String str10 = file_Buffer0.GetLine(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test079");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        int int7 = file_Buffer0.NumLins();
        java.lang.String str9 = file_Buffer0.GetLine((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test080");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '#');
        int int8 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) 100);
        int int11 = file_Buffer0.NumLins();
        int int12 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test081");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.SetCLN((int) (short) 1);
        java.lang.String str7 = file_Buffer0.GetLine(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test082");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (short) 10);
        file_Buffer0.setUpdateFlag(true);
        int int9 = file_Buffer0.NumLins();
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test083");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.GetCLN();
        java.lang.String str11 = file_Buffer0.GetLine(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test084");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((-1));
        file_Buffer0.SetCLN((int) ' ');
        file_Buffer0.SetCLN(10);
        file_Buffer0.AddLine(0, "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test085");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) 1);
        int int8 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test086");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.AddLine(0, "");
        java.lang.String str9 = file_Buffer0.GetLine((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test087");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        int int4 = file_Buffer0.NumLins();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.SetCLN((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test088");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        int int6 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.SetCLN((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 100 + "'", int6 == 100);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test089");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.SetCLN((int) (short) 1);
        file_Buffer0.SetCLN((int) '4');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test090");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.GetCLN();
        int int7 = file_Buffer0.GetCLN();
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test091");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test092");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.AddLine((int) (short) 0, "");
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(false);
        int int12 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.AddLine((int) (byte) 1, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35 + "'", int12 == 35);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test093");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.NumLins();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        int int7 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 100 + "'", int7 == 100);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test094");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(1);
        file_Buffer0.AddLine((int) (short) 0, "hi!");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test095");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (byte) 0);
        boolean boolean11 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test096");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test097");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.AddLine(0, "");
        file_Buffer0.DelLine(1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test098");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test099");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(1);
        java.lang.Class<?> wildcardClass3 = file_Buffer0.getClass();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test100");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test101");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        int int7 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.SetCLN(35);
        boolean boolean12 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test102");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test103");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.SetCLN((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test104");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.NumLins();
        file_Buffer0.AddLine(0, "hi!");
        int int10 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test105");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        int int6 = file_Buffer0.NumLins();
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test106");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        int int10 = file_Buffer0.NumLins();
        int int11 = file_Buffer0.NumLins();
        int int12 = file_Buffer0.GetCLN();
        int int13 = file_Buffer0.GetCLN();
        boolean boolean14 = file_Buffer0.getUpdateFlag();
        boolean boolean15 = file_Buffer0.getUpdateFlag();
        boolean boolean16 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test107");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        boolean boolean10 = file_Buffer0.getUpdateFlag();
        int int11 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test108");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.AddLine((int) (short) 0, "");
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass10 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test109");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        boolean boolean5 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.SetCLN(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test110");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        int int8 = file_Buffer0.NumLins();
        int int9 = file_Buffer0.GetCLN();
        int int10 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test111");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.GetCLN();
        int int7 = file_Buffer0.GetCLN();
        java.lang.String str9 = file_Buffer0.GetLine(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test112");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN(0);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        int int9 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test113");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass10 = file_Buffer0.getClass();
        boolean boolean11 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test114");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        int int10 = file_Buffer0.NumLins();
        int int11 = file_Buffer0.NumLins();
        int int12 = file_Buffer0.GetCLN();
        int int13 = file_Buffer0.GetCLN();
        boolean boolean14 = file_Buffer0.getUpdateFlag();
        boolean boolean15 = file_Buffer0.getUpdateFlag();
        int int16 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test115");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        int int10 = file_Buffer0.NumLins();
        int int11 = file_Buffer0.NumLins();
        file_Buffer0.SetCLN((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test116");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        int int4 = file_Buffer0.GetCLN();
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        file_Buffer0.AddLine(0, "hi!");
        file_Buffer0.setUpdateFlag(false);
        boolean boolean14 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass15 = file_Buffer0.getClass();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test117");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN(100);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.AddLine(0, "hi!");
        file_Buffer0.SetCLN(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test118");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.AddLine((int) (short) 0, "");
        file_Buffer0.setUpdateFlag(true);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test119");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.String str6 = file_Buffer0.GetLine((int) (byte) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.AddLine((int) (byte) 0, "");
        file_Buffer0.SetCLN((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test120");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        java.lang.String str10 = file_Buffer0.GetLine((int) (byte) 1);
        file_Buffer0.SetCLN((int) (short) 100);
        int int13 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test121");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        file_Buffer0.SetCLN((int) '#');
        int int5 = file_Buffer0.GetCLN();
        java.lang.String str7 = file_Buffer0.GetLine((int) (short) 1);
        int int8 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 35 + "'", int8 == 35);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test122");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (byte) 0);
        file_Buffer0.setUpdateFlag(true);
        int int9 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test123");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test124");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (byte) 0);
        int int12 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test125");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(false);
        file_Buffer0.SetCLN((int) (byte) 1);
        java.lang.Class<?> wildcardClass8 = file_Buffer0.getClass();
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test126");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN(10);
        file_Buffer0.SetCLN((int) 'a');
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test127");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        boolean boolean5 = file_Buffer0.getUpdateFlag();
        boolean boolean6 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(true);
        java.lang.Class<?> wildcardClass13 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test128");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test129");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (short) 10);
        file_Buffer0.setUpdateFlag(true);
        int int9 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test130");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.SetCLN(35);
        int int13 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 35 + "'", int13 == 35);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test131");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        int int3 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) (byte) 0);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        int int8 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test132");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        java.lang.Class<?> wildcardClass4 = file_Buffer0.getClass();
        int int5 = file_Buffer0.GetCLN();
        int int6 = file_Buffer0.NumLins();
        file_Buffer0.setUpdateFlag(false);
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.AddLine((int) (short) 0, "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test133");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(false);
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        java.lang.Class<?> wildcardClass6 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test134");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(false);
        boolean boolean9 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN(10);
        java.lang.Class<?> wildcardClass12 = file_Buffer0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test135");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.NumLins();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test136");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        java.lang.String str10 = file_Buffer0.GetLine((int) (byte) 1);
        int int11 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test137");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        file_Buffer0.setUpdateFlag(false);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        boolean boolean8 = file_Buffer0.getUpdateFlag();
        file_Buffer0.SetCLN((int) (byte) 10);
        int int11 = file_Buffer0.GetCLN();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test138");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        java.lang.String str6 = file_Buffer0.GetLine((int) (short) 1);
        java.lang.Class<?> wildcardClass7 = file_Buffer0.getClass();
        file_Buffer0.SetCLN((int) '4');
        int int10 = file_Buffer0.NumLins();
        int int11 = file_Buffer0.GetCLN();
        java.lang.String str13 = file_Buffer0.GetLine((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test139");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN((int) (byte) -1);
        boolean boolean7 = file_Buffer0.getUpdateFlag();
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.SetCLN((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test140");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        file_Buffer0.SetCLN(100);
        boolean boolean3 = file_Buffer0.getUpdateFlag();
        boolean boolean4 = file_Buffer0.getUpdateFlag();
        int int5 = file_Buffer0.NumLins();
        java.lang.String str7 = file_Buffer0.GetLine((int) (byte) 0);
        file_Buffer0.SetCLN((int) '#');
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.setUpdateFlag(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test141");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        file_Buffer0.setUpdateFlag(true);
        int int4 = file_Buffer0.GetCLN();
        java.lang.Class<?> wildcardClass5 = file_Buffer0.getClass();
        int int6 = file_Buffer0.GetCLN();
        java.lang.String str8 = file_Buffer0.GetLine((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "File_BufferTest.test142");
        LineEditor.File_Buffer file_Buffer0 = new LineEditor.File_Buffer();
        int int1 = file_Buffer0.GetCLN();
        int int2 = file_Buffer0.GetCLN();
        int int3 = file_Buffer0.GetCLN();
        file_Buffer0.SetCLN(100);
        file_Buffer0.setUpdateFlag(true);
        file_Buffer0.AddLine(0, "hi!");
        java.lang.Class<?> wildcardClass11 = file_Buffer0.getClass();
        boolean boolean12 = file_Buffer0.getUpdateFlag();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }
}

