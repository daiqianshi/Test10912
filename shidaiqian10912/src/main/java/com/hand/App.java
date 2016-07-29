package com.hand;

/**
 * Hello world!
 *
 */

class App2{
	public static int number = 20;
	public static void print(){
		System.out.println(App2.number);
	}
}
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        print();
        App2.print();
    }
    public static void print(){
    	System.out.println("测试是否乱码");
    }
}
