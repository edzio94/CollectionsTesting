package Main;

import Datas.*;
import Objects.AbstractList;
import Objects.LineOutput;
import Objects.Saver;
import TimerFunctions.Timers;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * Created by lukasz on 16.11.15.
 */
public class Worker {
    DataHandler data;
    Parser.CSVParserClass parser;
    Timers timer;


    public Worker()
    {
        data = new DataHandler();
        parser = new Parser.CSVParserClass();
        timer = new Timers();

        try {
            data.records = parser.parseFile(data.reader);
        } catch (IOException e) {
            e.printStackTrace();
        }

        saveOutput();
        Saver.saveToFile(data.out, data.lineOutputs);



    }
    public void saveOutput()
    {

        for (AbstractList obj : data.collections.list)
        {

            System.out.println(obj.getID());
            data.lineOutputs.add(new LineOutput(obj.getID(), true));

            data.lineOutputs.add(new LineOutput("Adding Data: ",false));
            data.lineOutputs.add(new LineOutput(timer.addToCollection(obj.list, data, parser)
                    + "ms", true));
            data.lineOutputs.add(new LineOutput("Go through: ", false));
            data.lineOutputs.add(new LineOutput(timer.goThroughCollection(obj.list)
                    + "ms",true));

            data.lineOutputs.add(new LineOutput("Sort: ",false));
            if (obj.sortAble){
            data.lineOutputs.add(new LineOutput(timer.sortCollection(obj.list)
                    + "ms", true));
            } else
            {
                data.lineOutputs.add(new LineOutput("Cannot sort this collection",true));
            }
            data.lineOutputs.add(new LineOutput("Clear: ",false));
            data.lineOutputs.add(new LineOutput(timer.clearCollection(obj.list)
                    + "ms", true));

            data.lineOutputs.add(new LineOutput("===============",true));
        }
    }


}
