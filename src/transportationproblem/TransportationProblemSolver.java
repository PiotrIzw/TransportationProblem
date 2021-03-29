package transportationproblem;

import transportationproblem.util.DataReader;

import java.util.Arrays;
import java.util.List;

public class TransportationProblemSolver {

    private List<Integer> suppliers;
    private List<Integer> customers;
    private double[][] costsOnTrace;


    public TransportationProblemSolver(DataReader data){
        suppliers = data.getSuppliers();
        customers = data.getCustomers();
        costsOnTrace = data.getCostsOnTrace();

        printTheSystem();


    }

    private void printTheSystem() {
        System.out.println("Suppliers = " + suppliers.toString());
        System.out.println("Customers = " + customers.toString());
        System.out.println("Costs on trace = " + Arrays.deepToString(costsOnTrace));
    }




    public void calculateCosts(){

    }

    public void northWestCornerRule(){

    }
}
