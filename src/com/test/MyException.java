package com.test;

/**
 * Created by zxc1996zxc on 2019-05-29.
 */
public class MyException extends NullPointerException {
    /**
     * Constructs a {@code NullPointerException} with no detail message.
     */
    public MyException() {
        super();
    }

    /**
     * Constructs a {@code NullPointerException} with the specified
     * detail message.
     *
     * @param   s   the detail message.
     */
    public MyException(String s) {
        super(s);
    }
}
