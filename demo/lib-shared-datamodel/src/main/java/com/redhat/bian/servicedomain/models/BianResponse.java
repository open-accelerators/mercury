package com.redhat.bian.servicedomain.models;

import java.util.Arrays;
import java.util.List;

// TODO: Auto-generated Javadoc
/**
 * The Class BianResponse.
 *
 * @param <T> the generic type
 */
public class BianResponse<T> {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The status. */
    private ResponseStatus status;

    /** The data. */
    private T data;

    /** The errors. */
    private List<ErrorDto> errors;

    /**
     * Instantiates a new bian response.
     */
    public BianResponse() {

    }

    /**
     * Instantiates a new bian response.
     *
     * @param status the status
     * @param data the data
     */
    public BianResponse(ResponseStatus status, T data) {
        this.status = status;
        this.data = data;
    }

    /**
     * Instantiates a new bian response.
     *
     * @param status the status
     * @param errors the errors
     */
    public BianResponse(ResponseStatus status, List<ErrorDto> errors) {
        this.status = status;
        this.errors = errors;
    }

    /**
     * For success.
     *
     * @param <T> the generic type
     * @param data the data
     * @return the bian response
     */
    public static <T> BianResponse<T> forSuccess(T data) {
        return new BianResponse(ResponseStatus.SUCCESS, data);
    }

    /**
     * For error.
     *
     * @param <T> the generic type
     * @param errors the errors
     * @return the bian response
     */
    public static <T> BianResponse<T> forError(ErrorDto... errors) {
        return new BianResponse(ResponseStatus.ERROR, Arrays.asList(errors));
    }

    /**
     * For error.
     *
     * @param <T> the generic type
     * @param errors the errors
     * @return the bian response
     */
    public static <T> BianResponse<T> forError(List<ErrorDto> errors) {
        return new BianResponse(ResponseStatus.ERROR, errors);
    }

    /**
     * Gets the status.
     *
     * @return the status
     */
    public ResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    /**
     * Gets the data.
     *
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * Sets the data.
     *
     * @param data the new data
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Gets the errors.
     *
     * @return the errors
     */
    public List<ErrorDto> getErrors() {
        return errors;
    }

    /**
     * Sets the errors.
     *
     * @param errors the new errors
     */
    public void setErrors(List<ErrorDto> errors) {
        this.errors = errors;
    }

    /**
     * Checks for errors.
     *
     * @return true, if successful
     */
    public boolean hasErrors() {
        return errors != null;
    }

}

