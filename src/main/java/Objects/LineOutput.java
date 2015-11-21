package Objects;

/**
 * Created by lukasz on 21.11.15.
 */
public class LineOutput {
    public String text;
    public boolean printNewLine;

    public LineOutput(String output, boolean printChoice)
    {
        this.text = output;
        this.printNewLine = printChoice;
    }
}
