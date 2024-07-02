package bitcamp.project2.util;

public class PromptTodo extends Prompt {

    public static int inputInt(String format, Object... args) {
        while (true) {
            try {
                return Integer.parseInt(input(format, args));
            } catch (NumberFormatException e) {
                System.out.println("[System] 숫자로 입력해 주세요.");
            }
        }
    }
}
