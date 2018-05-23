package RandoopTest;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserCmdTest
{

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test001");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        try {
            int int2 = userCmd0.getIntArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test002");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        try {
            userCmd0.setOptArgs("", (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test003");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        try {
            userCmd0.setStrArgs("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test004");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        try {
            java.lang.String str3 = userCmd0.getStrArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test005");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        try {
            userCmd0.setOptArgs("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test006");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        try {
            userCmd0.setOptArgs("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test007");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setCmdLine("");
        try {
            userCmd0.setOptArgs("", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test008");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        try {
            java.lang.String str3 = userCmd0.getStrArgs((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test009");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('4');
        try {
            int int5 = userCmd0.getIntArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test010");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        try {
            int int6 = userCmd0.getIntArgs((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test011");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        try {
            userCmd0.setStrArgs("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test012");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        try {
            java.lang.String str5 = userCmd0.getStrArgs((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test013");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setCmdLine("");
        try {
            userCmd0.setOptArgs("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test014");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        try {
            java.lang.String str5 = userCmd0.getStrArgs((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test015");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        try {
            int int4 = userCmd0.getIntArgs((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test016");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        try {
            java.lang.String str5 = userCmd0.getStrArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test017");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        java.lang.Class<?> wildcardClass2 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test018");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        try {
            userCmd0.setStrArgs("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test019");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOkSyntax();
        try {
            java.lang.String str10 = userCmd0.getOptArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test020");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        try {
            int int2 = userCmd0.getIntArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test021");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        userCmd0.setOkSyntax();
        try {
            userCmd0.setIntArgs(10, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test022");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        try {
            java.lang.String str5 = userCmd0.getOptArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test023");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        try {
            java.lang.String str8 = userCmd0.getOptArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test024");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        try {
            userCmd0.setIntArgs((int) (short) -1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test025");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            int int6 = userCmd0.getIntArgs((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test026");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        try {
            java.lang.String str7 = userCmd0.getStrArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test027");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            userCmd0.setStrArgs("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test028");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        try {
            java.lang.String str6 = userCmd0.getOptArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test029");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        try {
            java.lang.String str9 = userCmd0.getOptArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test030");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        try {
            int int9 = userCmd0.getIntArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test031");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            userCmd0.setIntArgs((int) (byte) -1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test032");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        try {
            int int5 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test033");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setOptArgs("", 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test034");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        try {
            int int5 = userCmd0.getIntArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test035");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        try {
            int int7 = userCmd0.getIntArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test036");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        try {
            userCmd0.setStrArgs("", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test037");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        try {
            userCmd0.setStrArgs("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test038");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        try {
            userCmd0.setOptArgs("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test039");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        try {
            java.lang.String str7 = userCmd0.getStrArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test040");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        try {
            userCmd0.setOptArgs("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test041");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        try {
            java.lang.String str12 = userCmd0.getOptArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test042");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            userCmd0.setIntArgs(100, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test043");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test044");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        try {
            userCmd0.setOptArgs("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test045");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        try {
            userCmd0.setOptArgs("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test046");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        try {
            java.lang.String str5 = userCmd0.getOptArgs((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test047");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        try {
            userCmd0.setStrArgs("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test048");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        userCmd0.setOkSyntax();
        try {
            userCmd0.setOptArgs("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test049");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        try {
            userCmd0.setIntArgs((int) '4', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test050");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        char char6 = userCmd0.getCmdName();
        try {
            userCmd0.setStrArgs("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test051");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        try {
            int int6 = userCmd0.getIntArgs((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test052");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (short) 0);
        try {
            userCmd0.setOptArgs("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test053");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        try {
            int int10 = userCmd0.getIntArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test054");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            java.lang.String str6 = userCmd0.getStrArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test055");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        try {
            java.lang.String str6 = userCmd0.getStrArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test056");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        try {
            java.lang.String str7 = userCmd0.getOptArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test057");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            userCmd0.setIntArgs((int) (byte) 100, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test058");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test059");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        userCmd0.setOkSyntax();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test060");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs((int) (byte) 0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test061");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        int int9 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            int int11 = userCmd0.getIntArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test062");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        try {
            java.lang.String str4 = userCmd0.getOptArgs((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test063");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        char char6 = userCmd0.getCmdName();
        try {
            int int8 = userCmd0.getIntArgs((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test064");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        userCmd0.setIntArgs((int) (short) -1, 1);
        userCmd0.setOptArgs("", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test065");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        char char6 = userCmd0.getCmdName();
        try {
            userCmd0.setIntArgs(0, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test066");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        userCmd0.setCmdName(' ');
        try {
            userCmd0.setOptArgs("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test067");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        try {
            userCmd0.setIntArgs((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test068");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("");
        try {
            userCmd0.setStrArgs("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test069");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        try {
            userCmd0.setOptArgs("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test070");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        try {
            userCmd0.setOptArgs("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test071");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        try {
            userCmd0.setStrArgs("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test072");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        char char6 = userCmd0.getCmdName();
        try {
            int int8 = userCmd0.getIntArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test073");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('4');
        int int5 = userCmd0.getIntArgs(1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test074");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setOkSyntax();
        try {
            int int10 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test075");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        java.lang.String str8 = userCmd0.getStrArgs(1);
        try {
            java.lang.String str10 = userCmd0.getOptArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test076");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        userCmd0.setIntArgs((int) (short) -1, 1);
        boolean boolean12 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test077");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        try {
            int int8 = userCmd0.getIntArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test078");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        try {
            java.lang.String str9 = userCmd0.getStrArgs((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test079");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        boolean boolean3 = userCmd0.getOkSyntax();
        try {
            java.lang.String str5 = userCmd0.getStrArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test080");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdLine("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test081");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        try {
            userCmd0.setStrArgs("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test082");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        userCmd0.setStrArgs("", (int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test083");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.String str6 = userCmd0.getCmdLine();
        try {
            int int8 = userCmd0.getIntArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test084");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        userCmd0.setCmdLine("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test085");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        int int9 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            userCmd0.setStrArgs("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test086");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        try {
            int int6 = userCmd0.getIntArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test087");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test088");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setOkSyntax();
        boolean boolean9 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test089");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        boolean boolean7 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test090");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("hi!");
        try {
            int int8 = userCmd0.getIntArgs(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test091");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setCmdLine("");
        boolean boolean6 = userCmd0.getOkSyntax();
        try {
            userCmd0.setOptArgs("", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test092");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            int int6 = userCmd0.getIntArgs((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test093");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        try {
            java.lang.String str9 = userCmd0.getStrArgs((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test094");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("");
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test095");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        int int3 = userCmd0.getIntArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test096");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("hi!");
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test097");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        boolean boolean5 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test098");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOkSyntax();
        try {
            userCmd0.setIntArgs((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test099");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.String str6 = userCmd0.getCmdLine();
        try {
            userCmd0.setIntArgs((int) (byte) -1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test100");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        try {
            java.lang.String str9 = userCmd0.getOptArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test101");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        try {
            userCmd0.setIntArgs((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test102");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdLine("");
        userCmd0.setOkSyntax();
        try {
            java.lang.String str11 = userCmd0.getOptArgs((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test103");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str14 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test104");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        try {
            userCmd0.setIntArgs((int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test105");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test106");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        char char6 = userCmd0.getCmdName();
        java.lang.String str8 = userCmd0.getStrArgs((int) (short) 0);
        java.lang.String str9 = userCmd0.getCmdLine();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test107");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('a');
        try {
            userCmd0.setStrArgs("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test108");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('a');
        try {
            userCmd0.setStrArgs("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test109");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        try {
            userCmd0.setOptArgs("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test110");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str7 = userCmd0.getCmdLine();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test111");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        java.lang.String str10 = userCmd0.getStrArgs(1);
        boolean boolean11 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test112");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test113");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        try {
            userCmd0.setIntArgs(1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test114");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        java.lang.Class<?> wildcardClass5 = userCmd0.getClass();
        try {
            int int7 = userCmd0.getIntArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test115");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        try {
            userCmd0.setOptArgs("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test116");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str14 = userCmd0.getOptArgs((int) (byte) 0);
        try {
            userCmd0.setStrArgs("hi!", (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test117");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("hi!");
        java.lang.Class<?> wildcardClass10 = userCmd0.getClass();
        int int12 = userCmd0.getIntArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test118");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        try {
            java.lang.String str3 = userCmd0.getStrArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test119");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        boolean boolean3 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test120");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (short) 0);
        try {
            int int8 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test121");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        userCmd0.setStrArgs("hi!", 0);
        try {
            java.lang.String str11 = userCmd0.getStrArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test122");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        char char8 = userCmd0.getCmdName();
        java.lang.String str9 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '#' + "'", char8 == '#');
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test123");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        java.lang.String str4 = userCmd0.getCmdLine();
        try {
            userCmd0.setStrArgs("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test124");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setCmdLine("");
        java.lang.String str6 = userCmd0.getCmdLine();
        try {
            userCmd0.setIntArgs((int) (byte) 0, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test125");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        userCmd0.setStrArgs("hi!", (int) (byte) 1);
        try {
            java.lang.String str13 = userCmd0.getOptArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test126");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        userCmd0.setCmdName('a');
        char char6 = userCmd0.getCmdName();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + 'a' + "'", char6 == 'a');
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test127");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        java.lang.String str10 = userCmd0.getOptArgs(1);
        userCmd0.setCmdName(' ');
        try {
            userCmd0.setStrArgs("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test128");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        try {
            userCmd0.setIntArgs((int) (byte) 1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test129");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        try {
            userCmd0.setOptArgs("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test130");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setOkSyntax();
        boolean boolean9 = userCmd0.getOkSyntax();
        try {
            userCmd0.setStrArgs("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test131");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.String str6 = userCmd0.getCmdLine();
        userCmd0.setIntArgs((int) (byte) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass10 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test132");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setStrArgs("hi!", 0);
        try {
            userCmd0.setStrArgs("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test133");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        boolean boolean8 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test134");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        char char7 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        boolean boolean10 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test135");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        userCmd0.setCmdName('4');
        try {
            userCmd0.setIntArgs((int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test136");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test137");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setStrArgs("hi!", 0);
        try {
            int int9 = userCmd0.getIntArgs((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test138");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('a');
        char char8 = userCmd0.getCmdName();
        java.lang.String str10 = userCmd0.getStrArgs((int) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test139");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        try {
            userCmd0.setStrArgs("hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test140");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        try {
            userCmd0.setStrArgs("", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test141");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        try {
            java.lang.String str3 = userCmd0.getOptArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test142");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        try {
            int int12 = userCmd0.getIntArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test143");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) 1, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test144");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        try {
            java.lang.String str9 = userCmd0.getOptArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test145");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            java.lang.String str4 = userCmd0.getStrArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test146");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdLine("");
        try {
            userCmd0.setOptArgs("hi!", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test147");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setCmdLine("");
        userCmd0.setCmdName('4');
        try {
            userCmd0.setOptArgs("hi!", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test148");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        int int11 = userCmd0.getIntArgs(0);
        java.lang.Class<?> wildcardClass12 = userCmd0.getClass();
        java.lang.String str14 = userCmd0.getOptArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test149");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('a');
        userCmd0.setStrArgs("hi!", 0);
        java.lang.String str8 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test150");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test151");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdLine("");
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test152");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        try {
            java.lang.String str4 = userCmd0.getOptArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test153");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        userCmd0.setIntArgs((int) '#', (int) (byte) 0);
        userCmd0.setCmdName(' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test154");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        try {
            userCmd0.setOptArgs("", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test155");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        try {
            userCmd0.setOptArgs("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test156");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        java.lang.String str5 = userCmd0.getCmdLine();
        int int7 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            int int9 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test157");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        java.lang.String str13 = userCmd0.getStrArgs(1);
        try {
            userCmd0.setOptArgs("hi!", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test158");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdLine("hi!");
        try {
            java.lang.String str7 = userCmd0.getOptArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test159");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test160");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test161");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        userCmd0.setCmdName(' ');
        boolean boolean9 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test162");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass7 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test163");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test164");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        try {
            userCmd0.setStrArgs("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test165");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str14 = userCmd0.getOptArgs((int) (byte) 0);
        try {
            java.lang.String str16 = userCmd0.getStrArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test166");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setOptArgs("hi!", 0);
        try {
            java.lang.String str12 = userCmd0.getStrArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test167");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs((int) ' ', (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test168");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs((int) (short) 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test169");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", (int) (short) 0);
        userCmd0.setCmdLine("hi!");
        try {
            userCmd0.setIntArgs((int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test170");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        char char6 = userCmd0.getCmdName();
        try {
            userCmd0.setIntArgs((int) (short) -1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test171");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str5 = userCmd0.getCmdLine();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test172");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test173");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        userCmd0.setCmdName(' ');
        java.lang.Class<?> wildcardClass11 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test174");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass4 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test175");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs((int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test176");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        java.lang.Class<?> wildcardClass12 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test177");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setOptArgs("hi!", 0);
        userCmd0.setStrArgs("", (int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test178");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        boolean boolean9 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test179");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test180");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", 0);
        try {
            int int13 = userCmd0.getIntArgs((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test181");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("hi!");
        userCmd0.setOkSyntax();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test182");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        try {
            java.lang.String str7 = userCmd0.getOptArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test183");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        java.lang.String str11 = userCmd0.getStrArgs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test184");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('a');
        try {
            userCmd0.setOptArgs("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test185");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        boolean boolean3 = userCmd0.getOkSyntax();
        userCmd0.setOptArgs("hi!", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        java.lang.String str9 = userCmd0.getOptArgs(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test186");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        java.lang.String str8 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test187");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setStrArgs("hi!", (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test188");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        java.lang.String str5 = userCmd0.getOptArgs((int) (short) 0);
        char char6 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test189");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        java.lang.String str8 = userCmd0.getCmdLine();
        java.lang.String str10 = userCmd0.getOptArgs((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test190");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        char char10 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '#' + "'", char10 == '#');
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test191");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        boolean boolean7 = userCmd0.getOkSyntax();
        try {
            java.lang.String str9 = userCmd0.getStrArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test192");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str14 = userCmd0.getOptArgs((int) (byte) 0);
        java.lang.String str15 = userCmd0.getCmdLine();
        try {
            java.lang.String str17 = userCmd0.getOptArgs((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test193");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        boolean boolean11 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs((int) (byte) 100, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test194");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        char char7 = userCmd0.getCmdName();
        char char8 = userCmd0.getCmdName();
        boolean boolean9 = userCmd0.getOkSyntax();
        try {
            userCmd0.setOptArgs("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + ' ' + "'", char8 == ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test195");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getStrArgs(0);
        try {
            userCmd0.setOptArgs("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test196");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('a');
        userCmd0.setOptArgs("", 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test197");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        userCmd0.setCmdName('4');
        int int7 = userCmd0.getIntArgs((int) (short) 1);
        try {
            java.lang.String str9 = userCmd0.getOptArgs((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test198");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        try {
            java.lang.String str5 = userCmd0.getOptArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test199");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setCmdName(' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test200");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", (int) (short) 0);
        java.lang.Class<?> wildcardClass12 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test201");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test202");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        java.lang.String str8 = userCmd0.getCmdLine();
        boolean boolean9 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test203");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test204");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (byte) 1);
        java.lang.String str7 = userCmd0.getCmdLine();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test205");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdLine("");
        userCmd0.setOptArgs("", 0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test206");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        try {
            userCmd0.setOptArgs("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test207");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        java.lang.String str10 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test208");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (short) 0);
        char char7 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setStrArgs("hi!", (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test209");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        try {
            userCmd0.setOptArgs("", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test210");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        char char7 = userCmd0.getCmdName();
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertNotNull(wildcardClass8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test211");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        char char6 = userCmd0.getCmdName();
        userCmd0.setStrArgs("hi!", 1);
        try {
            userCmd0.setIntArgs((int) (short) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test212");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (short) 0);
        char char7 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        try {
            userCmd0.setStrArgs("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test213");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        java.lang.String str6 = userCmd0.getOptArgs(0);
        try {
            userCmd0.setStrArgs("", (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test214");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        userCmd0.setCmdLine("");
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test215");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        userCmd0.setCmdName(' ');
        boolean boolean11 = userCmd0.getOkSyntax();
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test216");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        java.lang.String str5 = userCmd0.getStrArgs(0);
        userCmd0.setIntArgs(100, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test217");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        int int13 = userCmd0.getIntArgs((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test218");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setOptArgs("hi!", (int) (short) 0);
        char char12 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + char12 + "' != '" + ' ' + "'", char12 == ' ');
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test219");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        java.lang.String str9 = userCmd0.getCmdLine();
        boolean boolean10 = userCmd0.getOkSyntax();
        java.lang.Class<?> wildcardClass11 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test220");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test221");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        try {
            userCmd0.setOptArgs("", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test222");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        boolean boolean3 = userCmd0.getOkSyntax();
        userCmd0.setOptArgs("hi!", 0);
        userCmd0.setCmdName('#');
        try {
            java.lang.String str10 = userCmd0.getOptArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test223");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setOkSyntax();
        try {
            userCmd0.setIntArgs((int) (byte) 0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test224");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (short) 0);
        char char7 = userCmd0.getCmdName();
        java.lang.String str9 = userCmd0.getOptArgs(1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test225");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        userCmd0.setCmdName('4');
        userCmd0.setCmdName(' ');
        boolean boolean11 = userCmd0.getOkSyntax();
        userCmd0.setCmdName('#');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test226");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("");
        java.lang.String str14 = userCmd0.getStrArgs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test227");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        int int8 = userCmd0.getIntArgs(0);
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test228");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        boolean boolean11 = userCmd0.getOkSyntax();
        userCmd0.setCmdName('4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test229");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOkSyntax();
        try {
            java.lang.String str10 = userCmd0.getStrArgs((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test230");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        char char5 = userCmd0.getCmdName();
        java.lang.String str6 = userCmd0.getCmdLine();
        try {
            userCmd0.setOptArgs("", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + 'a' + "'", char5 == 'a');
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test231");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        int int9 = userCmd0.getIntArgs((int) (byte) 1);
        try {
            java.lang.String str11 = userCmd0.getOptArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test232");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setCmdName('a');
        char char11 = userCmd0.getCmdName();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + 'a' + "'", char11 == 'a');
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test233");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setCmdName(' ');
        userCmd0.setCmdLine("");
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test234");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        java.lang.String str8 = userCmd0.getCmdLine();
        char char9 = userCmd0.getCmdName();
        try {
            int int11 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + ' ' + "'", char9 == ' ');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test235");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (short) 0);
        try {
            int int13 = userCmd0.getIntArgs((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test236");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        boolean boolean8 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test237");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("hi!");
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str13 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test238");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (short) 1, 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test239");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        java.lang.String str13 = userCmd0.getOptArgs((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test240");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        java.lang.Class<?> wildcardClass5 = userCmd0.getClass();
        boolean boolean6 = userCmd0.getOkSyntax();
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test241");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test242");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        try {
            int int10 = userCmd0.getIntArgs((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test243");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test244");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        int int12 = userCmd0.getIntArgs(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test245");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        java.lang.String str13 = userCmd0.getStrArgs(1);
        userCmd0.setOkSyntax();
        java.lang.String str15 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test246");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        try {
            userCmd0.setOptArgs("hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test247");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs((int) (short) 0);
        char char7 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        char char10 = userCmd0.getCmdName();
        boolean boolean11 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + ' ' + "'", char10 == ' ');
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test248");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setCmdName(' ');
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test249");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test250");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setOptArgs("", (int) (byte) 0);
        try {
            java.lang.String str9 = userCmd0.getStrArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test251");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        try {
            userCmd0.setOptArgs("", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test252");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        java.lang.String str8 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (short) 0);
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str14 = userCmd0.getOptArgs(0);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test253");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        java.lang.String str2 = userCmd0.getCmdLine();
        java.lang.String str3 = userCmd0.getCmdLine();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test254");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        char char6 = userCmd0.getCmdName();
        java.lang.String str7 = userCmd0.getCmdLine();
        try {
            int int9 = userCmd0.getIntArgs((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test255");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        boolean boolean13 = userCmd0.getOkSyntax();
        try {
            java.lang.String str15 = userCmd0.getOptArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test256");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((-1), (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test257");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        char char6 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test258");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        userCmd0.setCmdName('4');
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test259");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getCmdLine();
        java.lang.String str7 = userCmd0.getOptArgs(0);
        userCmd0.setOkSyntax();
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setIntArgs(10, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test260");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdLine("");
        try {
            java.lang.String str4 = userCmd0.getOptArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test261");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        try {
            int int10 = userCmd0.getIntArgs((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test262");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        userCmd0.setCmdName('4');
        int int7 = userCmd0.getIntArgs((int) (short) 1);
        userCmd0.setOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test263");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        java.lang.String str3 = userCmd0.getCmdLine();
        userCmd0.setCmdName('#');
        char char6 = userCmd0.getCmdName();
        java.lang.String str7 = userCmd0.getCmdLine();
        java.lang.String str8 = userCmd0.getCmdLine();
        try {
            userCmd0.setStrArgs("hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '#' + "'", char6 == '#');
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test264");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setCmdName('#');
        boolean boolean3 = userCmd0.getOkSyntax();
        userCmd0.setOptArgs("hi!", 0);
        userCmd0.setCmdName('#');
        char char9 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + char9 + "' != '" + '#' + "'", char9 == '#');
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test265");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setCmdName('a');
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test266");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.String str4 = userCmd0.getCmdLine();
        userCmd0.setStrArgs("hi!", 0);
        try {
            userCmd0.setOptArgs("hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test267");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdLine("");
        userCmd0.setCmdName(' ');
        try {
            java.lang.String str9 = userCmd0.getOptArgs((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test268");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass4 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test269");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        userCmd0.setCmdName('a');
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setOptArgs("hi!", 0);
        try {
            userCmd0.setOptArgs("", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test270");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        try {
            int int9 = userCmd0.getIntArgs((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test271");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        java.lang.String str4 = userCmd0.getCmdLine();
        boolean boolean5 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "hi!" + "'", str4.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test272");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        userCmd0.setCmdName(' ');
        userCmd0.setCmdName('a');
        char char8 = userCmd0.getCmdName();
        userCmd0.setOptArgs("", (int) (byte) 1);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + 'a' + "'", char8 == 'a');
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test273");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        char char6 = userCmd0.getCmdName();
        java.lang.String str8 = userCmd0.getStrArgs(1);
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + ' ' + "'", char6 == ' ');
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test274");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        boolean boolean1 = userCmd0.getOkSyntax();
        java.lang.String str2 = userCmd0.getCmdLine();
        try {
            int int4 = userCmd0.getIntArgs((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test275");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        userCmd0.setCmdName(' ');
        userCmd0.setCmdLine("hi!");
        try {
            userCmd0.setOptArgs("hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test276");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setStrArgs("hi!", (int) (short) 1);
        userCmd0.setCmdLine("hi!");
        int int11 = userCmd0.getIntArgs(0);
        userCmd0.setCmdName('a');
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test277");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        try {
            userCmd0.setIntArgs(0, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test278");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        userCmd0.setOptArgs("", (int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test279");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("");
        char char7 = userCmd0.getCmdName();
        boolean boolean8 = userCmd0.getOkSyntax();
        java.lang.Class<?> wildcardClass9 = userCmd0.getClass();
        java.lang.Class<?> wildcardClass10 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + '#' + "'", char7 == '#');
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test280");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        userCmd0.setStrArgs("hi!", (int) (byte) 1);
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test281");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        java.lang.Class<?> wildcardClass8 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test282");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setOkSyntax();
        char char3 = userCmd0.getCmdName();
        boolean boolean4 = userCmd0.getOkSyntax();
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test283");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        char char3 = userCmd0.getCmdName();
        java.lang.String str4 = userCmd0.getCmdLine();
        java.lang.String str6 = userCmd0.getStrArgs(0);
        char char7 = userCmd0.getCmdName();
        try {
            userCmd0.setOptArgs("hi!", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + ' ' + "'", char3 == ' ');
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + char7 + "' != '" + ' ' + "'", char7 == ' ');
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test284");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str4 = userCmd0.getOptArgs((int) (byte) 0);
        userCmd0.setCmdLine("");
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test285");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setStrArgs("", (int) (short) 0);
        boolean boolean12 = userCmd0.getOkSyntax();
        char char13 = userCmd0.getCmdName();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + char13 + "' != '" + '#' + "'", char13 == '#');
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test286");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        java.lang.Class<?> wildcardClass1 = userCmd0.getClass();
        userCmd0.setCmdName('#');
        java.lang.String str5 = userCmd0.getOptArgs(0);
        userCmd0.setOptArgs("", (int) (byte) 0);
        userCmd0.setCmdName('a');
        userCmd0.setIntArgs(1, (int) (byte) 0);
        userCmd0.setCmdLine("hi!");
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test287");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        boolean boolean10 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test288");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        char char5 = userCmd0.getCmdName();
        userCmd0.setCmdName('#');
        userCmd0.setCmdLine("");
        try {
            java.lang.String str11 = userCmd0.getOptArgs(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '#' + "'", char5 == '#');
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test289");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        userCmd0.setOkSyntax();
        java.lang.Class<?> wildcardClass2 = userCmd0.getClass();
        boolean boolean3 = userCmd0.getOkSyntax();
        java.lang.Class<?> wildcardClass4 = userCmd0.getClass();
        java.lang.Class<?> wildcardClass5 = userCmd0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test290");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        int int5 = userCmd0.getIntArgs((int) (byte) 0);
        java.lang.Class<?> wildcardClass6 = userCmd0.getClass();
        java.lang.String str8 = userCmd0.getOptArgs((int) (short) 1);
        java.lang.String str9 = userCmd0.getCmdLine();
        userCmd0.setCmdLine("");
        java.lang.String str13 = userCmd0.getStrArgs(1);
        userCmd0.setOkSyntax();
        userCmd0.setOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test291");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        userCmd0.setCmdName('#');
        userCmd0.setOptArgs("hi!", (int) (short) 1);
        boolean boolean8 = userCmd0.getOkSyntax();
        userCmd0.setCmdLine("hi!");
        try {
            java.lang.String str12 = userCmd0.getStrArgs((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test292");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        boolean boolean12 = userCmd0.getOkSyntax();
        java.lang.String str13 = userCmd0.getCmdLine();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test293");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.Class<?> wildcardClass3 = userCmd0.getClass();
        userCmd0.setOptArgs("", 0);
        boolean boolean7 = userCmd0.getOkSyntax();
        userCmd0.setIntArgs((int) (byte) -1, (int) (short) 1);
        char char11 = userCmd0.getCmdName();
        java.lang.Class<?> wildcardClass12 = userCmd0.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + ' ' + "'", char11 == ' ');
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "UserCmdTest.test294");
        LineEditor.UserCmd userCmd0 = new LineEditor.UserCmd();
        int int2 = userCmd0.getIntArgs((int) (byte) 1);
        java.lang.String str3 = userCmd0.getCmdLine();
        boolean boolean4 = userCmd0.getOkSyntax();
        boolean boolean5 = userCmd0.getOkSyntax();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }
}

