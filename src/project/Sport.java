package project;

public class Sport extends Entity {
    private String type;

    public Sport() {

    }

    public Sport(int id, String name, String type) {
        super(id, name);
        this.type = type;
    }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    @Override
    public String toString() {
        return super.toString() + ", Type: " + type;
    }
}
