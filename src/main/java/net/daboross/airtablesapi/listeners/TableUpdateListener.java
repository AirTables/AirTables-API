package net.daboross.airtablesapi.listeners;

public interface TableUpdateListener {

    public void onNewKey(String table, String key, String value);

    public void onUpdateKey(String table, String key, String value);

    public void onRemoveKey(String table, String key);
}
