package net.daboross.airtablesapi;

// Wish I could make this an enum
public class TableType {

    public static final TableType LOCAL = new TableType("Local");
    public static final TableType REMOTE = new TableType("remote");
    private final String type;

    private TableType(final String type) {
        this.type = type;
    }

    @Override
    public boolean equals(final Object o) {
        return this == o || ((o instanceof TableType) && type.equals(((TableType) o).type));
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }

    @Override
    public String toString() {
        return type;
    }
}
