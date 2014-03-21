package net.daboross.airtablesapi;

public interface Callback<T> {

    /**
     * Run the callback with the given parameter
     *
     * @param parameter A parameter to this callback
     */
    public void run(T parameter);
}
