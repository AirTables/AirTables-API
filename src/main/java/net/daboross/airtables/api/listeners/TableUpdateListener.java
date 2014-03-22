package net.daboross.airtables.api.listeners;

import net.daboross.airtables.api.UpdateAction;

public interface TableUpdateListener {

    public void onUpdateKey(String table, String key, String value, UpdateAction action);

    public void onRemoveKey(String table, String key);
}
