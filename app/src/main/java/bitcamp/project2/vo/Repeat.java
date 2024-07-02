package bitcamp.project2.vo;

public class Repeat {

    boolean repeat;
    Term repeatTerm;

    public Repeat(boolean repeat, Term repeatTerm) {
        this.repeat = repeat;
        this.repeatTerm = repeatTerm;
    }

    public String stringRepeat() {
        if (repeat) {
            return "O, " + repeatTerm.getName();
        } else {
            return "X       ";
        }
    }

}
