/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test
 */
public class NewClass {
    package javaapplication1;

// FileName: MyMath.java
public class MyMath
  {
    public static int myFactorial( Integer value )
      throws IllegalArgumentException
    {
     if( value == null )
       throw new IllegalArgumentException( "argument must not be NULL" );

    int intValue = value;

     if( intValue < 0 )
       throw new IllegalArgumentException( "argument must be >= 0" );

     if( intValue == 1 )
       return( 1 );
     else
     {
      int result;

       result = myFactorial(intValue - 1);
       result = result * intValue;

       return( result );
     }
  }
}

}
