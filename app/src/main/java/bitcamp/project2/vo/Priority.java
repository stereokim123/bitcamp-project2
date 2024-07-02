package bitcamp.project2.vo;

public enum Priority {
    HIGH(1),
    MIDDLE(2),
    LOW(3);

    private final int priority;

    Priority(int priority) {
        this.priority = priority;
    }

    // int priority를 반환하는 메서드
    public int getName() {
        return priority;
    }

}
