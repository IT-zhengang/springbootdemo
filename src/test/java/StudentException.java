public class StudentException extends RuntimeException {
    public StudentException() {
    }

    public StudentException(String s) {
        super(s);
    }

    public StudentException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public StudentException(Throwable throwable) {
        super(throwable);
    }

}
