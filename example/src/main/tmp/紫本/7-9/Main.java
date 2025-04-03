import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        new Main().test(args);
    }
    public void test(String... args) /* insert code here */ {
        throw new FileNotFoundException();
    }
}

/*
A. throws RuntimeException
B. throws IOException
C. throws Exception
D. throws FileNotFoundException, ClassNotFoundException
E. throws Error
*/