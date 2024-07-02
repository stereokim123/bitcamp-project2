package bitcamp.project2.vo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.Objects;

public class Todo {

    static int seqNo;
    static LinkedList<String> storageList = new LinkedList<>();
    static LinkedList<String> tagList = new LinkedList<>();

    int no;
    boolean complete;
    String title;
    Calendar deadline;
    String storage;
    Priority priority;
    Repeat repeat;
    LinkedList<String> tags;

    public Todo(String title, Calendar deadline, String storage, Priority priority, Repeat repeat,
        LinkedList<String> tags) {
        ++seqNo;

        this.no = seqNo;
        this.title = title;
        this.deadline = deadline;
        this.storage = storage;
        this.priority = priority;
        this.repeat = repeat;
        this.tags = tags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Todo todo = (Todo) o;
        return no == todo.no && Objects.equals(title, todo.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(no, title);
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Calendar getDeadline() {
        return deadline;
    }

    public String getDeadlineDate() {
        Date date = deadline.getTime();

        // 원하는 형식으로 포맷팅
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        // 결과 출력
        return dateFormat.format(date);
    }

    public void setDeadline(Calendar deadline) {
        this.deadline = deadline;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public Repeat getRepeat() {
        return repeat;
    }

    public void setRepeat(Repeat repeat) {
        this.repeat = repeat;
    }

    public StringBuilder getTagList() {
        StringBuilder tag = new StringBuilder();
        for (int i = 0; i < tags.size(); i++) {
            tag.append(tags.get(i));
        }

        return tag;
    }

    public LinkedList<String> getTags() {
        return tags;
    }

    public void setTags(LinkedList<String> tags) {
        this.tags = tags;
    }

    public static void addStorageList(String... storage) {
        storageList.addAll(Arrays.asList(storage));
    }

    public static LinkedList<String> getStorageList() {
        return storageList;
    }

    public static void setStorageList(LinkedList<String> storageList) {
        Todo.storageList = storageList;
    }

    public static void setTagList(LinkedList<String> tagList) {
        Todo.tagList = tagList;
    }

    public boolean isComplete() {
        return complete;
    }

    public String getComplete() {
        return complete ? " 완료 " : "미완료";
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
