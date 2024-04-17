package db;

public class DbIntegrityException extends  RuntimeException{

    DbIntegrityException(String message){
        super(message);
    }
}
