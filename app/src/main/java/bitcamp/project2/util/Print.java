package bitcamp.project2.util;

public class Print {

    public static void printTitle(String title) {
        System.out.println("------<< " + title + " >>------");
    }

    public static void printMenus(String[] menus) {
        for (int i = 0; i < menus.length; i++) {
            System.out.println(i + 1 + ". " + menus[i]);
        }
    }

    public static void printTodo() {
        // Todo를 출력하는 메서드
    }
}
