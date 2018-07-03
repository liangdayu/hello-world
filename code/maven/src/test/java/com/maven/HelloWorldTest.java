package com.maven;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest{
    @Test
    public void testHello(){
        Assert.assertEquals("hello world!",new HelloWorld().sayHello());
    }
}
