package OOD;

public class test {
    public static void main(String[] args){
        User u = new User.UserBuilder("Yi", "Liu")
                            .age(29)
                            .build();
        System.out.println(u.getFirstName());
    }
}
