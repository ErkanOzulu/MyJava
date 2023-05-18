package day42_Exeptions;

class FadyException extends RuntimeException{ // custom unchecked exception

    public FadyException(){
        super("Time for a short break");
    }

    public FadyException(String message){
        super(message);
    }

}


class NoBreakException extends Exception{ // custom checked exception
    /*
    if you want to print some message you should use this syntax
    public NoBreakException(){
        super("NoBreakEx");
    }

     */
}

public class CustomExceptions {

    public static void main(String[] args) {


            //throw new FadyException("It's time for lunch break");


        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }


    }
}