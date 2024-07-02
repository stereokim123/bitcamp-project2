package bitcamp.project2.command;

import bitcamp.project2.util.Print;
import bitcamp.project2.util.PromptTodo;
import bitcamp.project2.vo.Todo;
import bitcamp.project2.vo.TodoList;
import java.util.Calendar;
import java.util.LinkedList;

public class TodoCommand {

    static TodoList todos = new TodoList();
    static LinkedList<String> storages = new LinkedList<>();

    public static void createTodo() {
        Todo todo;
        t
        Print.printTitle("Todo 생성");

        String todoTitle = PromptTodo.input("Todo 제목 입력 >>");
        Calendar calendar = Calendar.getInstance();

        // calendar로 deadline 받기

        // String 으로 보관함 받기, 보관함 = default("기본")

    }


}
