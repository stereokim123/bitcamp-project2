package bitcamp.project2.vo;

public enum Priority {
    HIGH("상"),
    MIDDLE("중"),
    LOW("하");

    private final String priority;

    Priority(String priority) {
        this.priority = priority;
    }

    // int priority를 반환하는 메서드
    public String getName() {
        return priority;
    }

}
