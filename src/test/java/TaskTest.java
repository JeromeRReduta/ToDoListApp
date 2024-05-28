import Data.Task;
import Factories.TaskFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTest {

    /** To test:
     * 1. Create a fake task and check its attributes
     * 2. Toggle done and check attributes again
     * 3. Compare toString() to expected string
     */

    @Test
    void testTaskCreation() {
        Task testTask = TaskFactory.DEFAULT.create("Test task");

        assertEquals("Test task", testTask.getName());

        assertFalse(testTask.isDone());

        testTask.toggleDone();
        assertTrue(testTask.isDone());

        /** Testing toggle again to make sure we can freely toggle a task even after we mark it done */
        testTask.toggleDone();
        assertFalse(testTask.isDone());

        assertEquals("[ ] Test task", testTask.toString());
    }

}
