package Data;

import java.util.Objects;

public final class Task {

    private final String name;

    private boolean isDone;

    public Task(String name, boolean isDone) {
        this.name = name;
        this.isDone = isDone;
    }

    public Task(String name) {
        this(name, false);
    }

    public String getName() {
        return name;
    }

    public boolean isDone() {
        return isDone;
    }

    public void toggleDone() {
        isDone = !isDone;
    }

    @Override
    public String toString() {
        String checkbox = isDone ? "[x]" : "[ ]";
        return checkbox + " " + name;
    }

    // TODO: TEST THIS
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        else if (other instanceof Task otherTask) {
            return Objects.equals(name, otherTask.name) && isDone == otherTask.isDone;
        }
        return false;
    }
}
