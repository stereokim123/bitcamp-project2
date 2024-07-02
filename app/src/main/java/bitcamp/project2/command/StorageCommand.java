package bitcamp.project2.command;

import bitcamp.project2.util.Print;
import bitcamp.project2.util.PromptTodo;

public class StorageCommand {

    public static void manageStorage() {
        String[] manageStorageMenus = {"보관함 생성", "보관함 조회", "보관함 수정", "보관함 삭제"};

        while (true) {
            Print.printTitle("보관함 관리");
            Print.printMenus(manageStorageMenus);

            int menuNo = PromptTodo.inputInt("메인/관리/보관함 관리 >>");

            switch (menuNo) {
                case 1:
                    createStorage();
                    break;
                case 2:
                    readStorage();
                    break;
                case 3:
                    updateStorage();
                    break;
                case 4:
                    deleteStorage();
                    break;
                default:
                    System.out.println("[System] 올바른 메뉴를 입력하세요.");
            }
        }
    }

    public static void createStorage() {

    }

    public static void readStorage() {

    }

    public static void updateStorage() {

    }

    public static void deleteStorage() {

    }
}
