package bitcamp.project2.command;

import bitcamp.project2.vo.Todo;
import bitcamp.project2.vo.TodoList;

public class TodoCommand {

    public static TodoList todos = new TodoList();

    public static void init() {
        Todo.addStorageList("기본");
    }

}
