import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class AsciiArt {
    private String inputText;

    public AsciiArt(String inputText) {
        this.inputText = inputText;
    }

    public String getInputText() {
        return inputText;
    }

    public void setInputText(String inputText) {
        this.inputText = inputText;
    }

    public String toAsciiArt()  {
        String asciiArt;
        try {
            asciiArt = FigletFont.convertOneLine(inputText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return asciiArt;
    }
}
