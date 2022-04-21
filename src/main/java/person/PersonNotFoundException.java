package person;

public class PersonNotFoundException extends Exception{

    public PersonNotFoundException(String message){
        super(message);
    }

    public PersonNotFoundException(String message, Throwable error){
        super(message, error);
    }
}
