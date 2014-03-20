package net.daboross.airtablesapi;

import java.util.Map;
import java.util.Set;

public interface AirTable {

    public TableType getType();

    public String get(String key);

    public String get(String key, String defaultValue);

    public int getInt(String key);

    public int getInt(String key, int defaultValue);

    public double getDouble(String key);

    public double getDouble(String key, double defaultValue);

    public boolean getBoolean(String key);

    public boolean getBoolean(String key, boolean defaultValue);

    public long getLong(String key);

    public long getLong(String key, long defaultValue);

    public boolean contains(String key);

    public boolean isInt(String key);

    public boolean isDouble(String key);

    public boolean isBoolean(String key);

    public void set(String key, String value);

    public Set<String> getKeys();

    public Set<String> getValues();

    public Map<String, String> asMap();
}
