package Observer;

public class ExecuteObserver {
    public static void main(String[] args) {
        User userOne = new User("Ahmed");
        User userTwo = new User("Ali");
        User userThree = new User("Mohammed");

        Blog blog = new Blog("Sport");
        blog.subscribe(userOne);
        blog.subscribe(userTwo);

        blog.blogUpdate(true);

    }
}
