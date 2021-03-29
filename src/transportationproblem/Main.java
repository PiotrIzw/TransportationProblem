package transportationproblem;

import transportationproblem.util.DataReader;

public class Main {

    public static void main(String[] args) {
        DataReader data = new DataReader("src/transportationproblem/resources/input_data.txt");
        TransportationProblemSolver transportation = new TransportationProblemSolver(data);
    }

}
