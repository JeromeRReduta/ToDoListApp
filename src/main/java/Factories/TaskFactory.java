package Factories;

import Data.Task;

public interface TaskFactory {

    Task createWithStatus(String name, boolean isDone);

    default Task create(String name) {
        return createWithStatus(name, false);
    }

    TaskFactory DEFAULT = Task::new;
}
