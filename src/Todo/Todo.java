package Todo;

import java.util.ArrayList;

public class Todo {
//    public static String[] todos;

    private ArrayList<String> todoList = new ArrayList<>();

    public ArrayList<String> getTodos(){
        return this.todoList;
    }

    public void addTodo(String todo){
        this.todoList.add(todo);
    }

}
