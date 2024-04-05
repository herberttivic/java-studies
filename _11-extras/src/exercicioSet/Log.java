package exercicioSet;

import java.time.LocalDateTime;

public class Log {
    private String user;
    private LocalDateTime date;


    public Log(User user) {
        this.user = user.getName();
        this.date = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return user + " " + date.toString() + "\n";
    }
}
