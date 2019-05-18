package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        String result = "";
        String comparisonValue = "";
        comparisonValue = comparisonValue + number;

        if ( (number % 3 == 0) || comparisonValue.contains("3") ) {
            result = result + "fizz";
        }

        if ( (number % 5 == 0) || comparisonValue.contains("5") ) {
            if ( result == "" ) {
                result = result + "buzz";
            } else {
                result = result + " buzz";

            }

        }


        if ( number > 10 ) {
            int testVar;
            int numCopy = number;
            testVar = numCopy%10;
            numCopy = numCopy/10;
            boolean check = true;

            while ( numCopy != 0 ) {
                if ( numCopy%10 != testVar ) {
                    check = false;
                    break;
                }
                numCopy = numCopy/10;
            }

            if ( ( check == true ) && ( result != "" ) ) {
                return result + " deluxe";
            }
            if ( ( check == true ) && ( result == "" ) ) {
                return result + number + " deluxe";
            }

        }




        if ( result == "" )
        {
            result = result + number;
        }



        return result;
    }
}





