package com.redhat.bian.servicedomain.models;


// TODO: Auto-generated Javadoc
/**
 * The Class ErrorDto.
 */
public class ErrorDto{

    /** The code. */
    private String code;

    /** The message. */
    private String message;

    /**
     * Instantiates a new error dto.
     */
    public ErrorDto() {

    }

    /**
     * Instantiates a new error dto.
     *
     * @param code the code
     * @param message the message
     */
    public ErrorDto(String code, String message) {
        this.code = code;
        this.message = message;
    }

    /* (non-Javadoc)
     * @see org.bian.dto.Dto#toString()
     */
    @Override
    public String toString() {
        return "ErrorDto{" + "code='" + code + '\'' + ", message='" + message + '}';
    }
}
