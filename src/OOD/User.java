package OOD;

//builder pattern is a good way to handle object with many fields
public class User {
    private String firstName;
    private String lastName;
    private int age;

    private User(UserBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
    }

    public String getFirstName(){
        return firstName;
    }

    public static class UserBuilder{
        private final String firstName;
        private final String lastName;
        private int age = 0;

        public UserBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder age(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}
