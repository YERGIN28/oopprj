package Assignment2;

public class Player extends Entity {
    private int age;
    private String position;

    public Player() {

    }

    public Player(int id, String name, int age, String position) {
        super(id, name);
        this.age = age;
        this.position = position;
    }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getPosition() { return position; }
    public void setPosition(String position) { this.position = position; }

    @Override
    public String toString() {
        return super.toString() + ", Age: " + age + ", Position: " + position;
    }
}
