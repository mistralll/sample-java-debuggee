package types;

public class my_person {
    private String name;
    private int age;
    private int hight;

    public my_person() {
        reset();
    }

    public void reset() {
        this.name = "";
        this.age = -1;
        this.hight = -1;
    }

    // getter
    public String getName() {return name;}
    public int getAge() {return age;}
    public int getHight() {return hight;}

    // setter
    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public void setHight(int hight) {this.hight = hight;}
}
