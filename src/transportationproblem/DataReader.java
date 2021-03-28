package transportationproblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class DataReader {
    private List<Integer> suppliers;
    private List<Integer> customers;
    private List<List<Integer>> costsOnTrace;


    public DataReader(String filename) {
        try (Scanner sc = new Scanner(new File(filename))) {





        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

