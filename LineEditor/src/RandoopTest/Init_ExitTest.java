package RandoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Init_ExitTest
{

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test001");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        try {
            init_Exit4.Do_Update(file_Buffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test002");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        boolean boolean3 = init_Exit2.Start_Failed();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test003");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test004");
        java.lang.String[] strArray0 = null;
        LineEditor.File_Buffer file_Buffer1 = null;
        try {
            LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test005");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit9.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test006");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit8.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test007");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        try {
            init_Exit2.Do_Update(file_Buffer3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test008");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit8.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test009");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer8 = null;
        try {
            init_Exit4.Do_Update(file_Buffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test010");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit8.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test011");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit8.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test012");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit8.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test013");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer6 = null;
        try {
            init_Exit4.Do_Update(file_Buffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test014");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        boolean boolean12 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit4.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test015");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        try {
            init_Exit4.Do_Update(file_Buffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test016");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        boolean boolean10 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test017");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit4.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test018");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit6.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test019");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit8.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test020");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit4.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test021");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit13.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test022");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        boolean boolean12 = init_Exit8.Start_Failed();
        boolean boolean13 = init_Exit8.Start_Failed();
        boolean boolean14 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test023");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit8.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test024");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit10.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test025");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit11.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test026");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit4.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test027");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit11.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test028");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        try {
            init_Exit4.Do_Update(file_Buffer5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test029");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        java.lang.Class<?> wildcardClass13 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test030");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        LineEditor.File_Buffer file_Buffer6 = null;
        try {
            init_Exit5.Do_Update(file_Buffer6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test031");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = init_Exit13.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test033");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit8.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test034");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = init_Exit11.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit11.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test035");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        try {
            init_Exit7.Do_Update(file_Buffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test036");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit13.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test037");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        try {
            init_Exit15.Do_Update(file_Buffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test038");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit8.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test039");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        boolean boolean12 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit8.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test040");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test041");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test042");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        try {
            init_Exit17.Do_Update(file_Buffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test043");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit6.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test044");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test045");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test046");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        boolean boolean11 = init_Exit4.Start_Failed();
        boolean boolean12 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test047");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        boolean boolean10 = init_Exit9.Start_Failed();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit9.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test048");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray0, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit10.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test049");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        boolean boolean15 = init_Exit14.Start_Failed();
        LineEditor.File_Buffer file_Buffer16 = null;
        try {
            init_Exit14.Do_Update(file_Buffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test050");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = init_Exit11.getClass();
        boolean boolean13 = init_Exit11.Start_Failed();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit11.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test051");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit10.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test052");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        boolean boolean15 = init_Exit14.Start_Failed();
        boolean boolean16 = init_Exit14.Start_Failed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test053");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit8.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test054");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray6, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit12.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test055");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        boolean boolean11 = init_Exit10.Start_Failed();
        boolean boolean12 = init_Exit10.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test056");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray6, file_Buffer11);
        boolean boolean13 = init_Exit12.Start_Failed();
        boolean boolean14 = init_Exit12.Start_Failed();
        LineEditor.File_Buffer file_Buffer15 = null;
        try {
            init_Exit12.Do_Update(file_Buffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test057");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit4.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test058");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        java.lang.Class<?> wildcardClass11 = init_Exit10.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test059");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit6.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test060");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        java.lang.Class<?> wildcardClass15 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test061");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test062");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test063");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit10.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test064");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        java.lang.Class<?> wildcardClass17 = init_Exit15.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test065");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test066");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test067");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray5, file_Buffer15);
        LineEditor.File_Buffer file_Buffer17 = null;
        try {
            init_Exit16.Do_Update(file_Buffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test068");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        boolean boolean10 = init_Exit9.Start_Failed();
        boolean boolean11 = init_Exit9.Start_Failed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test069");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        boolean boolean12 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test070");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        boolean boolean7 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test071");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        boolean boolean7 = init_Exit6.Start_Failed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test072");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        boolean boolean13 = init_Exit12.Start_Failed();
        boolean boolean14 = init_Exit12.Start_Failed();
        java.lang.Class<?> wildcardClass15 = init_Exit12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test073");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        boolean boolean17 = init_Exit15.Start_Failed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test074");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit4.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test075");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        boolean boolean18 = init_Exit17.Start_Failed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test076");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        java.lang.Class<?> wildcardClass3 = init_Exit2.getClass();
        boolean boolean4 = init_Exit2.Start_Failed();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test077");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray4, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit8.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test078");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray4, file_Buffer8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test079");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        boolean boolean13 = init_Exit12.Start_Failed();
        boolean boolean14 = init_Exit12.Start_Failed();
        LineEditor.File_Buffer file_Buffer15 = null;
        try {
            init_Exit12.Do_Update(file_Buffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test080");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit4.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test081");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        boolean boolean12 = init_Exit4.Start_Failed();
        boolean boolean13 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit4.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test082");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit4.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test083");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        boolean boolean10 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit8.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test084");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        java.lang.Class<?> wildcardClass15 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test085");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray2, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        try {
            init_Exit14.Do_Update(file_Buffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test086");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        boolean boolean11 = init_Exit10.Start_Failed();
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit10.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test087");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray3, file_Buffer11);
        java.lang.Class<?> wildcardClass13 = init_Exit12.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit12.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test088");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        boolean boolean12 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass13 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit8.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test089");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        boolean boolean6 = init_Exit5.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit5.getClass();
        boolean boolean8 = init_Exit5.Start_Failed();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit5.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test090");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test091");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        boolean boolean22 = init_Exit21.Start_Failed();
        LineEditor.File_Buffer file_Buffer23 = null;
        try {
            init_Exit21.Do_Update(file_Buffer23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test092");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        java.lang.Class<?> wildcardClass3 = init_Exit2.getClass();
        LineEditor.File_Buffer file_Buffer4 = null;
        try {
            init_Exit2.Do_Update(file_Buffer4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test093");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        boolean boolean10 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test094");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        boolean boolean11 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit8.getClass();
        java.lang.Class<?> wildcardClass13 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit8.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test095");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = init_Exit15.getClass();
        java.lang.Class<?> wildcardClass17 = init_Exit15.getClass();
        java.lang.Class<?> wildcardClass18 = init_Exit15.getClass();
        LineEditor.File_Buffer file_Buffer19 = null;
        try {
            init_Exit15.Do_Update(file_Buffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test096");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        try {
            init_Exit15.Do_Update(file_Buffer16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test097");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        boolean boolean12 = init_Exit11.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test098");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        boolean boolean6 = init_Exit5.Start_Failed();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit5.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test099");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = init_Exit6.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit6.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit6.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test100");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        boolean boolean11 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit8.getClass();
        boolean boolean13 = init_Exit8.Start_Failed();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit8.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test101");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = strArray5.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test102");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray2, file_Buffer15);
        LineEditor.File_Buffer file_Buffer17 = null;
        try {
            init_Exit16.Do_Update(file_Buffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test103");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        java.lang.Class<?> wildcardClass11 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray6, file_Buffer11);
        java.lang.Class<?> wildcardClass13 = init_Exit12.getClass();
        boolean boolean14 = init_Exit12.Start_Failed();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test105");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass12 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit4.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test106");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer17 = null;
        LineEditor.Init_Exit init_Exit18 = new LineEditor.Init_Exit(strArray2, file_Buffer17);
        LineEditor.File_Buffer file_Buffer19 = null;
        LineEditor.Init_Exit init_Exit20 = new LineEditor.Init_Exit(strArray2, file_Buffer19);
        java.lang.Class<?> wildcardClass21 = strArray2.getClass();
        java.lang.Class<?> wildcardClass22 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test107");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        boolean boolean8 = init_Exit7.Start_Failed();
        boolean boolean9 = init_Exit7.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit7.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test108");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = init_Exit13.getClass();
        boolean boolean15 = init_Exit13.Start_Failed();
        java.lang.Class<?> wildcardClass16 = init_Exit13.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test109");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit4.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test110");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        boolean boolean8 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit4.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test111");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray3, file_Buffer6);
        boolean boolean8 = init_Exit7.Start_Failed();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit7.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test112");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray2.getClass();
        java.lang.Class<?> wildcardClass11 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test113");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test114");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        boolean boolean10 = init_Exit9.Start_Failed();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit9.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test115");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray4.getClass();
        java.lang.Class<?> wildcardClass8 = strArray4.getClass();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test116");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray3, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray3, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        try {
            init_Exit14.Do_Update(file_Buffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test117");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = init_Exit5.getClass();
        boolean boolean7 = init_Exit5.Start_Failed();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test118");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        boolean boolean11 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit8.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit8.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test119");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test120");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray2, file_Buffer15);
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test121");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test122");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass12 = init_Exit4.getClass();
        boolean boolean13 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit4.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test123");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        try {
            init_Exit17.Do_Update(file_Buffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test124");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = init_Exit11.getClass();
        boolean boolean13 = init_Exit11.Start_Failed();
        java.lang.Class<?> wildcardClass14 = init_Exit11.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test125");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        LineEditor.File_Buffer file_Buffer17 = null;
        try {
            init_Exit15.Do_Update(file_Buffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test126");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test127");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray2, file_Buffer6);
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test128");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        boolean boolean11 = init_Exit10.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit10.getClass();
        boolean boolean13 = init_Exit10.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test129");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        boolean boolean13 = init_Exit12.Start_Failed();
        boolean boolean14 = init_Exit12.Start_Failed();
        boolean boolean15 = init_Exit12.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test130");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        java.lang.Class<?> wildcardClass22 = strArray2.getClass();
        java.lang.Class<?> wildcardClass23 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer24 = null;
        LineEditor.Init_Exit init_Exit25 = new LineEditor.Init_Exit(strArray2, file_Buffer24);
        LineEditor.File_Buffer file_Buffer26 = null;
        try {
            init_Exit25.Do_Update(file_Buffer26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test131");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        java.lang.Class<?> wildcardClass20 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test132");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = strArray5.getClass();
        java.lang.Class<?> wildcardClass11 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        java.lang.Class<?> wildcardClass18 = init_Exit17.getClass();
        LineEditor.File_Buffer file_Buffer19 = null;
        try {
            init_Exit17.Do_Update(file_Buffer19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test133");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        java.lang.Class<?> wildcardClass11 = init_Exit10.getClass();
        LineEditor.File_Buffer file_Buffer12 = null;
        try {
            init_Exit10.Do_Update(file_Buffer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test134");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test135");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer17 = null;
        LineEditor.Init_Exit init_Exit18 = new LineEditor.Init_Exit(strArray2, file_Buffer17);
        LineEditor.File_Buffer file_Buffer19 = null;
        LineEditor.Init_Exit init_Exit20 = new LineEditor.Init_Exit(strArray2, file_Buffer19);
        boolean boolean21 = init_Exit20.Start_Failed();
        LineEditor.File_Buffer file_Buffer22 = null;
        try {
            init_Exit20.Do_Update(file_Buffer22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test136");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray2, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        boolean boolean20 = init_Exit19.Start_Failed();
        java.lang.Class<?> wildcardClass21 = init_Exit19.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test137");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        boolean boolean14 = init_Exit13.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test138");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit9.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test139");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray4, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test140");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        boolean boolean6 = init_Exit5.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit5.getClass();
        boolean boolean8 = init_Exit5.Start_Failed();
        boolean boolean9 = init_Exit5.Start_Failed();
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit5.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test141");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit8.getClass();
        boolean boolean12 = init_Exit8.Start_Failed();
        boolean boolean13 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test142");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = init_Exit11.getClass();
        boolean boolean13 = init_Exit11.Start_Failed();
        boolean boolean14 = init_Exit11.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test143");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray3, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray3, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray3, file_Buffer13);
        java.lang.Class<?> wildcardClass15 = strArray3.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test144");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test145");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray0, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray0, file_Buffer11);
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test146");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass6 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test147");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        java.lang.Class<?> wildcardClass8 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test148");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer7 = null;
        try {
            init_Exit4.Do_Update(file_Buffer7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test149");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        boolean boolean6 = init_Exit5.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit5.getClass();
        java.lang.Class<?> wildcardClass8 = init_Exit5.getClass();
        java.lang.Class<?> wildcardClass9 = init_Exit5.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test150");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray3, file_Buffer6);
        java.lang.Class<?> wildcardClass8 = init_Exit7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test151");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        java.lang.Class<?> wildcardClass14 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray2, file_Buffer15);
        LineEditor.File_Buffer file_Buffer17 = null;
        LineEditor.Init_Exit init_Exit18 = new LineEditor.Init_Exit(strArray2, file_Buffer17);
        java.lang.Class<?> wildcardClass19 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test152");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        java.lang.Class<?> wildcardClass10 = init_Exit9.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test153");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test154");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer17 = null;
        LineEditor.Init_Exit init_Exit18 = new LineEditor.Init_Exit(strArray2, file_Buffer17);
        java.lang.Class<?> wildcardClass19 = init_Exit18.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test155");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit8.getClass();
        java.lang.Class<?> wildcardClass13 = init_Exit8.getClass();
        boolean boolean14 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test156");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        boolean boolean7 = init_Exit6.Start_Failed();
        java.lang.Class<?> wildcardClass8 = init_Exit6.getClass();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test157");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray2, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        try {
            init_Exit9.Do_Update(file_Buffer10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test158");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray2, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray2, file_Buffer15);
        boolean boolean17 = init_Exit16.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test159");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray2, file_Buffer6);
        boolean boolean8 = init_Exit7.Start_Failed();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit7.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test160");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = init_Exit6.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test161");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        boolean boolean7 = init_Exit6.Start_Failed();
        boolean boolean8 = init_Exit6.Start_Failed();
        boolean boolean9 = init_Exit6.Start_Failed();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test162");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        LineEditor.File_Buffer file_Buffer22 = null;
        LineEditor.Init_Exit init_Exit23 = new LineEditor.Init_Exit(strArray2, file_Buffer22);
        LineEditor.File_Buffer file_Buffer24 = null;
        LineEditor.Init_Exit init_Exit25 = new LineEditor.Init_Exit(strArray2, file_Buffer24);
        LineEditor.File_Buffer file_Buffer26 = null;
        LineEditor.Init_Exit init_Exit27 = new LineEditor.Init_Exit(strArray2, file_Buffer26);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test163");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray2, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        boolean boolean12 = init_Exit11.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test164");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray3, file_Buffer6);
        boolean boolean8 = init_Exit7.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test165");
        java.lang.String[] strArray3 = new java.lang.String[] { "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer4 = null;
        LineEditor.Init_Exit init_Exit5 = new LineEditor.Init_Exit(strArray3, file_Buffer4);
        java.lang.Class<?> wildcardClass6 = strArray3.getClass();
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray3, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = init_Exit8.getClass();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test166");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = init_Exit6.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        try {
            init_Exit6.Do_Update(file_Buffer8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test167");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray2, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        boolean boolean20 = init_Exit19.Start_Failed();
        boolean boolean21 = init_Exit19.Start_Failed();
        boolean boolean22 = init_Exit19.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test168");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        java.lang.Class<?> wildcardClass17 = init_Exit15.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        try {
            init_Exit15.Do_Update(file_Buffer18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test169");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray2, file_Buffer13);
        boolean boolean15 = init_Exit14.Start_Failed();
        java.lang.Class<?> wildcardClass16 = init_Exit14.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test170");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray2, file_Buffer6);
        java.lang.Class<?> wildcardClass8 = init_Exit7.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit7.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test171");
        java.lang.String[] strArray2 = new java.lang.String[] { "", "hi!" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer9 = null;
        try {
            init_Exit4.Do_Update(file_Buffer9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test172");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        boolean boolean17 = init_Exit15.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test173");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        boolean boolean11 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass12 = init_Exit8.getClass();
        boolean boolean13 = init_Exit8.Start_Failed();
        boolean boolean14 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test174");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        LineEditor.File_Buffer file_Buffer11 = null;
        try {
            init_Exit4.Do_Update(file_Buffer11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test175");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass8 = init_Exit4.getClass();
        boolean boolean9 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test176");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = init_Exit15.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test177");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        boolean boolean16 = init_Exit15.Start_Failed();
        LineEditor.File_Buffer file_Buffer17 = null;
        try {
            init_Exit15.Do_Update(file_Buffer17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test178");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray2, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test179");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        java.lang.Class<?> wildcardClass11 = strArray6.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test180");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        java.lang.Class<?> wildcardClass20 = init_Exit19.getClass();
        boolean boolean21 = init_Exit19.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test181");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        boolean boolean10 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass12 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass13 = init_Exit4.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test182");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        java.lang.Class<?> wildcardClass10 = init_Exit4.getClass();
        boolean boolean11 = init_Exit4.Start_Failed();
        boolean boolean12 = init_Exit4.Start_Failed();
        LineEditor.File_Buffer file_Buffer13 = null;
        try {
            init_Exit4.Do_Update(file_Buffer13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test183");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray6, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray6, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray6, file_Buffer11);
        java.lang.Class<?> wildcardClass13 = init_Exit12.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        try {
            init_Exit12.Do_Update(file_Buffer14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test184");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        java.lang.Class<?> wildcardClass13 = init_Exit12.getClass();
        java.lang.Class<?> wildcardClass14 = init_Exit12.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test185");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray0, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray0, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass10 = init_Exit8.getClass();
        boolean boolean11 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test186");
        java.lang.String[] strArray4 = new java.lang.String[] { "", "", "hi!", "hi!" };
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray4, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray4, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray4, file_Buffer9);
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test187");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        java.lang.Class<?> wildcardClass22 = strArray2.getClass();
        java.lang.Class<?> wildcardClass23 = strArray2.getClass();
        java.lang.Class<?> wildcardClass24 = strArray2.getClass();
        java.lang.Class<?> wildcardClass25 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test188");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass7 = init_Exit4.getClass();
        boolean boolean8 = init_Exit4.Start_Failed();
        boolean boolean9 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test189");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray5, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray5, file_Buffer18);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test190");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        boolean boolean9 = init_Exit8.Start_Failed();
        boolean boolean10 = init_Exit8.Start_Failed();
        boolean boolean11 = init_Exit8.Start_Failed();
        boolean boolean12 = init_Exit8.Start_Failed();
        java.lang.Class<?> wildcardClass13 = init_Exit8.getClass();
        boolean boolean14 = init_Exit8.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test191");
        java.lang.String[] strArray0 = new java.lang.String[] {};
        LineEditor.File_Buffer file_Buffer1 = null;
        LineEditor.Init_Exit init_Exit2 = new LineEditor.Init_Exit(strArray0, file_Buffer1);
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray0, file_Buffer3);
        boolean boolean5 = init_Exit4.Start_Failed();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test192");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray2, file_Buffer16);
        boolean boolean18 = init_Exit17.Start_Failed();
        java.lang.Class<?> wildcardClass19 = init_Exit17.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test193");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        LineEditor.File_Buffer file_Buffer20 = null;
        LineEditor.Init_Exit init_Exit21 = new LineEditor.Init_Exit(strArray2, file_Buffer20);
        java.lang.Class<?> wildcardClass22 = strArray2.getClass();
        java.lang.Class<?> wildcardClass23 = strArray2.getClass();
        java.lang.Class<?> wildcardClass24 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer25 = null;
        LineEditor.Init_Exit init_Exit26 = new LineEditor.Init_Exit(strArray2, file_Buffer25);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test194");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray2, file_Buffer18);
        java.lang.Class<?> wildcardClass20 = init_Exit19.getClass();
        LineEditor.File_Buffer file_Buffer21 = null;
        try {
            init_Exit19.Do_Update(file_Buffer21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test195");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test196");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        java.lang.Class<?> wildcardClass15 = init_Exit14.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test197");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        boolean boolean10 = init_Exit9.Start_Failed();
        java.lang.Class<?> wildcardClass11 = init_Exit9.getClass();
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test198");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test199");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        java.lang.Class<?> wildcardClass5 = init_Exit4.getClass();
        boolean boolean6 = init_Exit4.Start_Failed();
        boolean boolean7 = init_Exit4.Start_Failed();
        boolean boolean8 = init_Exit4.Start_Failed();
        java.lang.Class<?> wildcardClass9 = init_Exit4.getClass();
        boolean boolean10 = init_Exit4.Start_Failed();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test200");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        java.lang.Class<?> wildcardClass7 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray2, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        LineEditor.File_Buffer file_Buffer12 = null;
        LineEditor.Init_Exit init_Exit13 = new LineEditor.Init_Exit(strArray2, file_Buffer12);
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray2, file_Buffer14);
        java.lang.Class<?> wildcardClass16 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer17 = null;
        LineEditor.Init_Exit init_Exit18 = new LineEditor.Init_Exit(strArray2, file_Buffer17);
        LineEditor.File_Buffer file_Buffer19 = null;
        LineEditor.Init_Exit init_Exit20 = new LineEditor.Init_Exit(strArray2, file_Buffer19);
        LineEditor.File_Buffer file_Buffer21 = null;
        LineEditor.Init_Exit init_Exit22 = new LineEditor.Init_Exit(strArray2, file_Buffer21);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test201");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        java.lang.Class<?> wildcardClass13 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer14 = null;
        LineEditor.Init_Exit init_Exit15 = new LineEditor.Init_Exit(strArray5, file_Buffer14);
        LineEditor.File_Buffer file_Buffer16 = null;
        LineEditor.Init_Exit init_Exit17 = new LineEditor.Init_Exit(strArray5, file_Buffer16);
        LineEditor.File_Buffer file_Buffer18 = null;
        LineEditor.Init_Exit init_Exit19 = new LineEditor.Init_Exit(strArray5, file_Buffer18);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test202");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        LineEditor.File_Buffer file_Buffer9 = null;
        LineEditor.Init_Exit init_Exit10 = new LineEditor.Init_Exit(strArray2, file_Buffer9);
        LineEditor.File_Buffer file_Buffer11 = null;
        LineEditor.Init_Exit init_Exit12 = new LineEditor.Init_Exit(strArray2, file_Buffer11);
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray2, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        LineEditor.Init_Exit init_Exit16 = new LineEditor.Init_Exit(strArray2, file_Buffer15);
        java.lang.Class<?> wildcardClass17 = strArray2.getClass();
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test203");
        java.lang.String[] strArray2 = new java.lang.String[] { "hi!", "" };
        LineEditor.File_Buffer file_Buffer3 = null;
        LineEditor.Init_Exit init_Exit4 = new LineEditor.Init_Exit(strArray2, file_Buffer3);
        LineEditor.File_Buffer file_Buffer5 = null;
        LineEditor.Init_Exit init_Exit6 = new LineEditor.Init_Exit(strArray2, file_Buffer5);
        LineEditor.File_Buffer file_Buffer7 = null;
        LineEditor.Init_Exit init_Exit8 = new LineEditor.Init_Exit(strArray2, file_Buffer7);
        java.lang.Class<?> wildcardClass9 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray2, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray2.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray2, file_Buffer13);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "Init_ExitTest.test204");
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "", "hi!", "" };
        LineEditor.File_Buffer file_Buffer6 = null;
        LineEditor.Init_Exit init_Exit7 = new LineEditor.Init_Exit(strArray5, file_Buffer6);
        LineEditor.File_Buffer file_Buffer8 = null;
        LineEditor.Init_Exit init_Exit9 = new LineEditor.Init_Exit(strArray5, file_Buffer8);
        LineEditor.File_Buffer file_Buffer10 = null;
        LineEditor.Init_Exit init_Exit11 = new LineEditor.Init_Exit(strArray5, file_Buffer10);
        java.lang.Class<?> wildcardClass12 = strArray5.getClass();
        LineEditor.File_Buffer file_Buffer13 = null;
        LineEditor.Init_Exit init_Exit14 = new LineEditor.Init_Exit(strArray5, file_Buffer13);
        LineEditor.File_Buffer file_Buffer15 = null;
        try {
            init_Exit14.Do_Update(file_Buffer15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }
}

