package Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void updateMessage(String message) {
        System.out.println(this.name + " has notification" + message);

    }
}
