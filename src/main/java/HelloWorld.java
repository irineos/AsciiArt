public class HelloWorld {

    public static void main(String[] args){

        String input = "Hello World!";
        AsciiArt text = new AsciiArt(input);
        String outputArt = text.toAsciiArt();

        System.out.println(outputArt);
    }
}
