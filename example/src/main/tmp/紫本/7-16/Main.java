public class Main {
    public static void main(String[] args) {
        try {
            FirstException ex;
            // insert code here
            throw ex;
        } catch(FirstException ex) {}
    }
}
class FirstException extends RuntimeException {
    FirstException() {}
    FirstException(Throwable cause) { super(cause); }
    FirstException(String message) { super(message); }
}
class SecondException extends FirstException {
    SecondException(Throwable cause) { super(cause); }
}


/*
 * A ex = new FirstException();
 * B ex = new SecondException(new Exception());
 * C ex = new SecondException("Second");
 * D ex = new FirstException(new SecondException());
 * E ex = new SecondException(new FirstException("First"));
 */
