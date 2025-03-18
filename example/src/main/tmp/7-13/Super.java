import java.io.*;
class Super {
    public void method() throws FileNotFoundException {}
}
class Sub extends Super {
    @Override
    // insert code here
}

/*
 * A. public void method() {}
 * B. public void method() throws ClassCastException {}
 * C. public void method() throws FileNotFoundException {}
 * D. public void method() throws ClassNotFoundException {}
 * E. public void method() throws IOException {}
 */