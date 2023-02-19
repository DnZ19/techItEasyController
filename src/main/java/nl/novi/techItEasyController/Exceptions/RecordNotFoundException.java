package nl.novi.techItEasyController.Exceptions;

public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(){
        super();
    }

    public RecordNotFoundException(String message){
        super(message);
    }

}
