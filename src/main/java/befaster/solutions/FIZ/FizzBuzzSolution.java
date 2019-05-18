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



        if ( result == "" )
        {
            result = result + number;
        } else {
            if ( number > 10 && comparisonValue.split(0, ) ) {

            }
        }


        return result;
    }
}



