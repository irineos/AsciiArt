import com.github.lalyos.jfiglet.FigletFont;
import java.io.IOException;

public class AsciiArt {

    public static String textToArt(String inputText)  {
        String output;
        try {
            output = FigletFont.convertOneLine(inputText);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}
