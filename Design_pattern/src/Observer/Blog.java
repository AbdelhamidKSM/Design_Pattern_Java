package Observer;

import java.util.ArrayList;
import java.util.List;

public class Blog implements Observable {

    private String name;
    private String content;
    private List<Observer> users;

    public Blog(String name) {
        this.name = name;
        this.users = new ArrayList<>();
    }

    public void blogUpdate(boolean isUpdated) {
        this.content = (isUpdated ? "the Blog Is Updated with a New Article " : "still with the last Article ");
        notifyAllSubscribers();
    }

    @Override
    public void subscribe(Observer observer) {
        users.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        users.remove(observer);
    }

    @Override
    public void notifyAllSubscribers() {
        for (Observer observer : users) {
            observer.updateMessage(content);
        }
    }
}
