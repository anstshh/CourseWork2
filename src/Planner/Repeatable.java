package Planner;

import java.time.LocalDateTime;

public interface Repeatable {
    LocalDateTime getNextDeadline();
}