package Data;

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
}
