package org.ingrahamrobotics.robottables.api.listeners;

import org.ingrahamrobotics.robottables.api.UpdateAction;

public interface TableUpdateListener {

    public void onUpdateKey(String table, String key, String value, UpdateAction action);

    public void onRemoveKey(String table, String key);
}
