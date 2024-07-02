package bitcamp.project2.command;

import bitcamp.project2.util.Print;
import bitcamp.project2.util.PromptTodo;

public class ManagementCommand {

    public static void management() {
        String[] manageMenus = {"Todo 관리", "보관함 관리", ""};

        while (true) {
            Print.printTitle("관리");
            Print.printMenus(manageMenus);

            int menuNo = PromptTodo.inputInt("메인/관리 >>");

            switch (menuNo) {
                case 1:
                    manageTodoList();
                    break;
                case 2:
                    manageStorage();
                    break;
                default:
                    System.out.println("[System] 올바른 메뉴를 입력하세요.");
            }
        }
    }

    public static void manageTodoList() {
        Print.printTitle("Todo 관리");
    }

    public static void manageStorage() {
        Print.printTitle("보관함 관리");
    }

}
