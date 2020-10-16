package org.example;

import org.junit.*;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;

public class TestMerkez {

    Collection collection;

    @BeforeClass
    public static void metod1()
    {
        System.out.println("metod1");
    }
    @BeforeClass
    public static void metod2()
    {
        System.out.println("metod2");
    }
    @Before
    public  void metod3()
    {   collection=new ArrayList();
        System.out.println("metod3");
    }
    @After
    public  void metod4()
    {
        System.out.println("metod4");
    }



    @Test
    public void metod5()
    {
        assertTrue(collection.isEmpty());
        System.out.println("metod5");
    }


}
