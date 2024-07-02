package bitcamp.project2.vo;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Todo {

    static int seqNo;

    int no;
    String title;
    Calendar deadline;
    String storage;
    Priority priority;
    boolean repeat;
    Date repeatTerm;
    String[] tags;

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

    public boolean isRepeat() {
        return repeat;
    }

    public void setRepeat(boolean repeat) {
        this.repeat = repeat;
    }

    public Date getRepeatTerm() {
        return repeatTerm;
    }

    public void setRepeatTerm(Date repeatTerm) {
        this.repeatTerm = repeatTerm;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
