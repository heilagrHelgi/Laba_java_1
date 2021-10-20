package com.company;

/**
 * This class is used to verify methods and output the message when sth goes wrong
 */
public class MyException extends Exception {
    public MyException(String description) {
        super(description);
    }

}
