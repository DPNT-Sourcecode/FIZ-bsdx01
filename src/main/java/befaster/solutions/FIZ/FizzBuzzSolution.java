package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if ( (number % 5 == 0) && (number % 3 == 0) ) {
            return "fizz buzz";
        }
        if ( (number % 3 == 0) ) {
            return "fizz";
        }
        if ( (number % 5 == 0) ) {
            return "buzz";
        }
        String result = "";
        result = result + number;

        return result;
    }

}
