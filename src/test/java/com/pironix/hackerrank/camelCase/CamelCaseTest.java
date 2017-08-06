package com.pironix.hackerrank.camelCase;

import org.junit.*;

import static org.junit.Assert.assertEquals;

/**
 * The CamelCase Test class
 *
 * @author ibrahim KARAYEL
 * @version 1.0
 * @sice 9/10/2016
 */
public class CamelCaseTest {

    private static String input1;
    private static String input2;
    private static String input3;
    private static String input4;
    private static String input5;
    private static String input6;

    @BeforeClass
    public static void oneTimeSetUp() {
        // one-time initialization code
        System.out.println("@BeforeClass - oneTimeSetUp");
        input1 = "CamelCaseTest";
        input2 = "camelCaseInput";
        input3 = "camelCase";
        input4 = "camel";
        input5 = "";
        input6 = null;

    }

    @AfterClass
    public static void oneTimeTearDown() {
        // one-time cleanup code
        System.out.println("@AfterClass - oneTimeTearDown");
        input1 = null;
        input2 = null;
        input3 = null;
        input4 = null;
        input5 = null;
        input6 = null;
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before - CamelCaseTest setUp");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After - CamelCaseTest tearDown");
    }

    @Test
    public void testCamelCase() {
        assertEquals(CamelCase.writeCamelCase(input1), 3);
        assertEquals(CamelCase.writeCamelCase(input2), 3);
        assertEquals(CamelCase.writeCamelCase(input3), 2);
        assertEquals(CamelCase.writeCamelCase(input4), 1);
        assertEquals(CamelCase.writeCamelCase(input5), 0);
        assertEquals(CamelCase.writeCamelCase(input6), 0);
    }


}