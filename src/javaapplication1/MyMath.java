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
