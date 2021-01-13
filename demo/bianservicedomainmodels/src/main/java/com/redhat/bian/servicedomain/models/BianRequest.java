package com.redhat.bian.servicedomain.models;


// TODO: Auto-generated Javadoc
/**
 * The Class BianRequest.
 *
 * @param <T> the generic type
 */
public class BianRequest<T> {

    /** The Constant serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** The data. */
    T data;

    /**
     * Instantiates a new bian request.
     */
    public BianRequest() {

    }

    /**
     * Instantiates a new bian request.
     *
     * @param data the data
     */
    public BianRequest(T data) {
        this.data= data;
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

}
