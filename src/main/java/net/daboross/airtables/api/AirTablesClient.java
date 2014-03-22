package net.daboross.airtables.api;

import net.daboross.airtables.api.listeners.ClientUpdateListener;

public interface AirTablesClient {

    /**
     * Gets a table currently known to this client. The table is not guaranteed to be local or remote. If there are no
     * local or remote tables on this client under the given name, this will return null.
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
     * Publishes a table on the network,, or retrieves the table we know about (published or subscribed). If another
     * client replies that they are publishing the table, this table will change type from LOCAL to REMOTE within
     * 200ms.
     *
     * @param tableName Table to publish
     * @return The table ppublished / retrieved. You should check that {@code table.getType() == TableType.LOCAL} before
     * modifying.
     */
    public AirTable publishTable(String tableName);

    /**
     * Publishes a table on the network, or retrieves a network-side table. This is a method provided for convenience
     * that will run a callback when we are absolutely sure that we own this table.
     *
     * @param tableName Table to publish
     * @param callback  Callback to run when the table has been published, or failed to be published. Callbacks should
     *                  check {@code table.getType() == TableType.LOCAL} before modifying.
     */
    public void publishTable(String tableName, Callback<AirTable> callback);

    /**
     * Adds a ClientUpdateListener to this client. The listener will continue to recieve updates until {@code
     * removeClientListener()} is called with the listener.
     *
     * @param listener The listener to add
     */
    public void addClientListener(ClientUpdateListener listener);

    /**
     * Removes a ClientUpdateListener from this client. This will do nothing if the listener hasn't been added with
     * {@code addClientListener()}. The listener will not recieve updates from this client unless {@code
     * addClientListener()} is called again with the listener.
     *
     * @param listener The listener to remove
     */
    public void removeClientListener(ClientUpdateListener listener);
}
