package net.daboross.airtablesapi;

public interface AirTablesClient {

    /**
     * Gets a table currently known to this client. The table is not guaranteed to be local or remote. If there are no
     * local or remote tables on this client, this will return null.
     *
     * @param tableName Table to retrieve
     * @return The table, or null if unknown
     */
    public AirTable getTable(String tableName);

    /**
     * Checks whether or not this client knows about a given table known to this client.
     *
     * @param tableName Table to check if exists
     * @return True if the table is currently known to this client as a local or remote table, false otherwise.
     */
    public boolean doesExist(String tableName);

    /**
     * Publishes a table on the network, or retrieves a network-side
     *
     * @param tableName Table to publish
     * @param callback  Callback to run when the table has been published, or failed to be published. Callbacks should
     *                  check table.getType() == TableType.LOCAL before modifying.
     */
    public void publishTable(String tableName, Callback<AirTable> callback);
}
