package org.ingrahamrobotics.robottables.api;

// Wish I could make this an enum
public class TableType {

    /**
     * Local table. A table with this stringRepresentation will be able to be modified by the client.
     */
    public static final TableType LOCAL = new TableType("Local");
    /**
     * Remote table. A table with this stringRepresentation is published by a remote client, and is unmodifiable.
     */
    public static final TableType REMOTE = new TableType("Remote");
    private final String stringRepresentation;

    private TableType(final String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    public String toString() {
        return stringRepresentation;
    }
}
