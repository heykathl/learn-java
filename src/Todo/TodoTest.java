package Todo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TodoTest {

    @Test
    public void emptyTodoList() {
        Todo todo = new Todo();
        assertEquals("Starts with am empty todolist", 0, todo.getTodos().size());
    }

    @Test
    public void addOneTask() {
        Todo todo = new Todo();
        todo.addTodo("Laundry");
        assertEquals("Add laundry to todolist", 1, todo.getTodos().size());

    }

}