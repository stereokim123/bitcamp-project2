package bitcamp.project2.vo;

public enum Term {
    YEAR("Year "),
    MONTH("Month"),
    WEEK("Week "),
    DAY("Day  ");

    private final String term;

    Term(String term) {
        this.term = term;
    }

    // int period 반환하는 메서드
    public String getName() {
        return term;
    }

}
