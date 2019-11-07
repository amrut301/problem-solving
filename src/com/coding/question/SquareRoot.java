package com.coding.question;

public class SquareRoot {


  public static double squareRoot( double x )
  {
	  System.out.println(x);
	  double temp = x / 2;

		while (true) {
			//System.out.println(x);
			double sqrRoot = temp - (temp * temp - x) / (2 * temp);
			double value = Math.abs(temp - sqrRoot);
			System.out.println(sqrRoot);
			if (value < 0.0001)
				return sqrRoot;
			else
				temp = sqrRoot;
		}
		
  }

  public static void main( String args[])
  {
    double[] inputs = {2, 4, 100,1.5};
    double[] expected_values = { 1.41421, 2, 10,1.2247 };
    double threshold = 0.001;
    
    squareRoot(16);
//    for(int i=0; i < inputs.length; i++)
//    {
//      if( Math.abs(squareRoot(inputs[i])-expected_values[i])>threshold )
//      {
//        System.out.printf( "Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i], squareRoot(inputs[i]) );
//      }
//    }
//    System.out.println( "All tests passed");
  }
}