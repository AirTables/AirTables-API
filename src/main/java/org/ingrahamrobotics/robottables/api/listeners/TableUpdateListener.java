package org.ingrahamrobotics.robottables.api.listeners;

import org.ingrahamrobotics.robottables.api.AirTable;
import org.ingrahamrobotics.robottables.api.UpdateAction;

public interface TableUpdateListener {

    public void onUpdateKey(AirTable table, String key, String value, UpdateAction action);

    public void onRemoveKey(AirTable table, String key);

    public void onTableCleared(AirTable table);
}
