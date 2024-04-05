package exercicioSet;

import java.util.Objects;

public class LogEntry {
    private String name;
    private String moment;

    public LogEntry(String name, String moment) {
        this.name = name;
        this.moment = moment;

    }

    public String getMoment() {
        return moment;
    }

    public void setMoment(String moment) {
        this.moment = moment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LogEntry logEntry = (LogEntry) o;
        return Objects.equals(getName(), logEntry.getName()) && Objects.equals(getMoment(), logEntry.getMoment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getMoment());
    }

}

