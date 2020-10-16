package org.example;
import junit.framework.TestCase;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
public class TestMerkez2  {


    @Test(timeout = 1000,expected = Exception.class)
    public void metod1()
    {
        String test="oda";
        int sayi=20/Integer.valueOf(test);
        System.out.println("metod1 @test");
    }
    @Test(timeout = -10)
    public void metod2()
    {
        String test="oda";
        int sayi=30/15;
        System.out.println("metod1 @test");
    }

}
