package org.ingrahamrobotics.robottables.api;

import org.ingrahamrobotics.robottables.api.listeners.TableUpdateListener;

public interface AirTable {

    /**
     * Gets the type of this table. A LOCAL table will be modifiable, and is published locally. A REMOTE table is
     * published by a remote client, as in read-only.
     *
     * @return The type of this table
     */
    public TableType getType();

    /**
     * Gets the time since the last remote update of this table in milliseconds. Note that if this table is LOCAL, the
     * returned value is always 0.
     *
     * @return 0 if {@code getType() == LOCAL}. Time since last update if {@code getType() == REMOTE}.
     */
    public long getTimeSinceLastUpdate();

    /**
     * Adds a TableUpdateListener to this table. The listener will continue to recieve updates until {@code
     * removeUpdateListener()} is called with the listener.
     *
     * @param listener The listener to add
     */
    public void addUpdateListener(TableUpdateListener listener);

    /**
     * Removes a TableUpdateListener from this table. This will do nothing if the listener hasn't been added with {@code
     * addUpdateListener()}. The listener will not recieve updates from this table unless {@code addUpdateListener()} is
     * called again with the listener.
     *
     * @param listener The listener to remove
     */
    public void remoteUpdateListener(TableUpdateListener listener);

    /**
     * Gets the String value stored in this table under a given key
     *
     * @param key The key for the value to retrieve
     * @return The value stored in this table, or null if there is no value stored under the given key.
     */
    public String get(String key);

    /**
     * Gets the string value stored in this table under a given key, defaulting to a given defaultValue.
     *
     * @param key          The key for the value to retrieve
     * @param defaultValue The default value to return if the given key does not exist in this table
     * @return The value stored in this table, or the defaultValue if the key does not exist. key.
     */
    public String get(String key, String defaultValue);

    /**
     * Gets the integer value stored in this table under a given key, defaulting to 0
     *
     * @param key The key for the value to retrieve
     * @return The value stored in this table, or 0 if the given key does not exist, or the value stored is not parsable
     * as an integer
     */
    public int getInt(String key);

    /**
     * Gets the integer value stored in this table under a given key, defaulting to a given defaultValue.
     *
     * @param key          The key for the value to retrieve
     * @param defaultValue The default value to return if the given key does not exist, or the value is not parsable as
     *                     an integer.
     * @return The value stored in this table, or the defaultValue if the given key does not exist, or the value stored
     * is not parsable as an integer.
     */
    public int getInt(String key, int defaultValue);

    /**
     * Gets the double value stored in this table under a given key, defaulting to 0.0
     *
     * @param key The key for the value to retrieve
     * @return The value stored in this table, or 0.0 if the given key does not exist, or the value stored is not
     * parsable as a double
     */
    public double getDouble(String key);

    /**
     * Gets the double value stored in this table under a given key, defaulting to a given defaultValue.
     *
     * @param key          The key for the value to retrieve
     * @param defaultValue The default value to return if the given key does not exist, or the value is not parsable as
     *                     a double.
     * @return The value stored in this table, or the defaultValue if the given key does not exist, or the value stored
     * is not parsable as a double.
     */
    public double getDouble(String key, double defaultValue);

    /**
     * Gets the boolean value stored in this table under a given key, defaulting to false
     *
     * @param key The key for the value to retrieve
     * @return The value stored in this table, or false if the given key does not exist, or the value stored is not
     * parsable as a boolean
     */
    public boolean getBoolean(String key);

    /**
     * Gets the boolean value stored in this table under a given key, defaulting to a given defaultValue.
     *
     * @param key          The key for the value to retrieve
     * @param defaultValue The default value to return if the given key does not exist, or the value is not parsable as
     *                     a boolean.
     * @return The value stored in this table, or the defaultValue if the given key does not exist, or the value stored
     * is not parsable as a boolean.
     */
    public boolean getBoolean(String key, boolean defaultValue);

    /**
     * Gets the long value stored in this table under a given key, defaulting to 0l
     *
     * @param key The key for the value to retrieve
     * @return The value stored in this table, or 0l if the given key does not exist, or the value stored is not
     * parsable as a long
     */
    public long getLong(String key);

    /**
     * Gets the lonng value stored in this table under a given key, defaulting to a given defaultValue.
     *
     * @param key          The key for the value to retrieve
     * @param defaultValue The default value to return if the given key does not exist, or the value is not parsable as
     *                     a long.
     * @return The value stored in this table, or the defaultValue if the given key does not exist, or the value stored
     * is not parsable as a long.
     */
    public long getLong(String key, long defaultValue);

    /**
     * Checks whether or not the given key exists in this table.
     *
     * @param key The key to check
     * @return True if the key exists in this table, false otherwise
     */
    public boolean contains(String key);

    /**
     * Checks whether or not the given key exists in this table, and is parsable as an integer.
     *
     * @param key The key to check
     * @return True if the key exists in this table and is parsable as an integer, false otherwise
     */
    public boolean isInt(String key);

    /**
     * Checks whether or not the given key exists in this table, and is parsable as a double.
     *
     * @param key The key to check
     * @return True if the key exists in this table and is parsable as a double, false otherwise
     */
    public boolean isDouble(String key);

    /**
     * Checks whether or not the given key exists in this table, and is parsable as a boolean.
     *
     * @param key The key to check
     * @return True if the key exists in this table and is parsable as a boolean, false otherwise.
     */
    public boolean isBoolean(String key);

    /**
     * Sets the given key to the given value
     *
     * @param key   The key to set
     * @param value The value to set the key to
     */
    public void set(String key, String value);

    /**
     * Clears all values from this AirTable.
     */
    public void clear();
}
