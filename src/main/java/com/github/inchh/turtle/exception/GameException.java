package com.github.inchh.turtle.exception;

/**
 * @author In_Chh
 */
public class GameException extends Exception {
    public static long serialVersionUID = 232323424343L;

    public GameException() {
    }

    public GameException(String message) {
        super(message);
    }
}
