package transportationproblem.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private List<Integer> suppliers;
    private List<Integer> customers;
    private double[][] costsOnTrace;


    public DataReader(String filename) {

        suppliers = new ArrayList<Integer>();
        customers = new ArrayList<Integer>();

        try (Scanner scanner = new Scanner(new File(filename))) {

            int suppliersAmount = scanner.nextInt();
            int customersAmount = scanner.nextInt();

            for (int i = 0; i < suppliersAmount; i++) {
                suppliers.add(scanner.nextInt());
            }

            for (int i = 0; i < customersAmount; i++) {
                customers.add(scanner.nextInt());
            }

            balanceTheSystem();

            costsOnTrace = new double[suppliers.size()][customers.size()];

            for (int i = 0; i < suppliersAmount; i++) {
                for (int j = 0; j < customersAmount; j++) {
                    costsOnTrace[i][j] = scanner.nextDouble();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void balanceTheSystem(){
        int supply = 0;
        int demand = 0;
        for(int supplier : suppliers){
            demand += supplier;
        }

        for(int customer : customers){
            supply += customer;
        }

        if(supply > demand){
            suppliers.add(supply - demand);
        }
        else if(supply < demand){
            customers.add(demand - supply);
        }
    }



    public List<Integer> getSuppliers() {
        return suppliers;
    }

    public List<Integer> getCustomers() {
        return customers;
    }

    public double[][] getCostsOnTrace() {
        return costsOnTrace;
    }
}

