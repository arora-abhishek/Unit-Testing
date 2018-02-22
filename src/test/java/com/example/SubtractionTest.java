package com.example;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class SubtractionTest {

    private Subtraction subtraction = new Subtraction();
    @Test
    public  void canaryTest(){
        Assert.assertTrue(true);
    }


    @Ignore
    @Test
    public  void testTheSubWithTwoInts(){
        int a=10;
        int b=20;
        Assert.assertEquals(10,subtraction.sub(20,10));

    }
    @Test
    public void testTheSubWithTwoFloat(){
        Assert.assertEquals(10.1,subtraction.subf(20.2f,10.1f),.05f);
    }

    @Test
    public void testTheSubWithTwoInteger(){
        Assert.assertEquals(Integer.valueOf(10),subtraction.sub_wrapper(Integer.valueOf(25),Integer.valueOf(15)));
    }
}