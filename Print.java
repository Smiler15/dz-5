import java.io.PrintStream;

public class Print {
    int a = 5;
    String b = "Give me";

    public PrintStream print(){
        return(System.out.printf("---<%s %d>---", b, a));
    }
}
