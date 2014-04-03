package org.ingrahamrobotics.robottables.api.listeners;

import org.ingrahamrobotics.robottables.api.RobotTable;
import org.ingrahamrobotics.robottables.api.UpdateAction;

public interface TableUpdateListener {

    public void onUpdateKey(RobotTable table, String key, String value, UpdateAction action);

    public void onTableCleared(RobotTable table);
}
