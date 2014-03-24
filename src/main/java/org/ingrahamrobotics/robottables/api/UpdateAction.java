package org.ingrahamrobotics.robottables.api;

// Wish we could enum
public class UpdateAction {

    /**
     * Used when a key is assigned a value for the first time in this client
     */
    public static final byte NEW = 0x01;
    /**
     * Used when a key is already known to the client, and is updated
     */
    public static final byte UPDATE = 0x02;
    /**
     * Used when a key is deleted
     */
    public static final byte DELETE = 0x03;

    private UpdateAction() {
    }
}
