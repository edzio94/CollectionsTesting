package Datas;

import Collections.CollectionsList;
import Objects.LineOutput;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 16.11.15.
 */
public class DataHandler {
    public final String csvFile = "MOCK_DATA.csv";
    public final String outFile = "TesterOutput.txt";


    public CollectionsList collections;
    public BufferedReader reader;
    public List<String> records;
    public PrintWriter out;
    public List<LineOutput> lineOutputs;


    public DataHandler()
    {
        try {
            reader = new BufferedReader(new FileReader(csvFile));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            out = new PrintWriter(outFile);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot create file");
            e.printStackTrace();
        }
        records = new ArrayList<>();
        collections = new CollectionsList();
        lineOutputs = new ArrayList<>();
    }
}
