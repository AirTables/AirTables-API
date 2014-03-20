package net.daboross.airtablesapi.listeners;

import net.daboross.airtablesapi.TableType;

public interface ClientUpdateListener {

    public void onTableChangeType(String tableName, TableType oldType, TableType newType);

    public void onNewTable(String tableName, TableType tableType);
}
