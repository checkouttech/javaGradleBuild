package src.test.java;
import src.main.java.*;
//import packagedir.MathClass;
import java.io.*;
//import codedir.*;

//import junit.framework.Assert;
import  org.testng.annotations.*;
import org.testng.Assert;
import java.lang.*;

public class TestMathClass {
    
    @Test(groups = { "functest", "checkintest" })    

    public void testaddNumbers10 ()
    {
        MathClass m2 = new MathClass();
        int sumOfNumbers = m2.addNumbers(15, 20);
        Assert.assertEquals(35, sumOfNumbers);
        System.out.println("inside testaddNumbers");
    }
    

    public void testaddNumbers1 ()
    {
        MathClass m2 = new MathClass();
        int sumOfNumbers = m2.addNumbers(15, 20);
        Assert.assertEquals(35, sumOfNumbers);
        System.out.println("inside testaddNumbers");
    }
    
    @Test(groups = { "checkintest" })    
    public void testaddNumbers2 ()    
    {
        MathClass m2 = new MathClass();
        int sumOfNumbers = m2.addNumbers(15, 20);
        Assert.assertEquals(35, sumOfNumbers);
        System.out.println("inside testaddNumbers2");
    }        

    @Test(groups = { "functest" , "broken" })    
    public void testaddNumbers3 ()    
    {
        MathClass m2 = new MathClass();
        int sumOfNumbers = m2.addNumbers(15, 20);
        Assert.assertEquals(35, sumOfNumbers);
        System.out.println("inside testaddNumbers3");
    }        


    @Test
    public void testaddNumbers4 ()    
    {
        MathClass m2 = new MathClass();
        int sumOfNumbers = m2.addNumbers(15, 20);
        Assert.assertEquals(35, sumOfNumbers);
        System.out.println("inside testaddNumbers4");
    }        







}
    
//    @Test
//    public void testaddNumbers4 () throws IOException    
//    {    
//        Process p = Runtime.getRuntime().exec("touch /tmp/f9.out");
//        //p.
//    }            
//org.testng.FileAssert    
//FileAssert.assertFile    


