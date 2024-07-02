package bitcamp.project2.util;

public enum Ansi {

    REDYELLOW("\033[31;43"),
    INIT("\033[0m");

    private final String ansi;

    Ansi(String ansi) {
        this.ansi = ansi;
    }
}
