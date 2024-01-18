package com.anju.memoryleak;

public class FinallyTest {
    static void A() {
        try {
            System.out.println("inside A");
            throw new RuntimeException("demo");
        }
        finally{
            System.out.println("A's finally");
        }
    }
 
    static void B() {
        try {
            System.out.println("inside B");
            return;
        }
        finally {
            System.out.println("B's finally");
        }
    }
    
    static void C() {
    	try {
    		System.out.println("Inside C..");
    		throw new RuntimeException("Exception thrown from C..");
    	}catch (Exception e) {
    		//e.printStackTrace();
    		System.out.println("Exception caught from C..");
    	}finally {
    		System.out.println("Finally called in C..");
    	}
    }
 
    public static void main(String args[])
    {
        try {
            A();
        }
        catch (Exception e) {
            System.out.println("Exception caught");
        }
        B();
        C();
    }
}
