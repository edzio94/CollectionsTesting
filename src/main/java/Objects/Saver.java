package Objects;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

/**
 * Created by lukasz on 21.11.15.
 */
public final class Saver {

    public Saver()
    {

    }

    public static void saveToFile(PrintWriter out,List<LineOutput> lineOutputs)
    {
        for (LineOutput output :lineOutputs)
        {
            System.out.println(output.text);

            if (output.printNewLine)
                out.println(output.text);
            else
                out.print(output.text);
        }
        out.close();

    }
}
