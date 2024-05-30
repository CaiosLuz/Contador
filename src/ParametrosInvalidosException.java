public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message){
        super(message);
    }

    public ParametrosInvalidosException() {
        System.out.println("O segundo parametro tem que ser maior que o primeiro");
    }
}
