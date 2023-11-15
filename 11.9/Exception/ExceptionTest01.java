package Exception;

public class ExceptionTest01 {
    public static void main(String[] args) {

    }
}

class myException extends Exception{
    public myException() {
    }

    public myException(String message) {
        super(message);
    }
}

class myRunTimeException extends RuntimeException{
    public myRunTimeException() {
    }

    public myRunTimeException(String message) {
        super(message);
    }
}
