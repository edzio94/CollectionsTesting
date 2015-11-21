package Parser;

import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lukasz on 16.11.15.
 */
public class CSVParserClass {
    private  static final String LINE_SEPARATOR = "\n";
    private static final String WORD_SEPARATOR = ",";
    CSVPrinter printer;
    String line;

    public List<String> parseFile(BufferedReader file) throws IOException {
        file.readLine();
        List<String> records = new ArrayList<>();
        String tmp ;
        while ((tmp = file.readLine())!= null)
        {
            records.add(tmp);
        }
        return records;
    }


    public String[] getFields(String record)
    {
        String [] fields = record.split(WORD_SEPARATOR);
        return fields;
    }

}
