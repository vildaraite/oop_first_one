package lt.code.academy.data;


public class Student {
    private final int id;
    private final String username;
    private final String name;
    private final String surname;
    private final String password;

    public Student(int id, String username, String name, String surname, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.password = password;
    }

}
