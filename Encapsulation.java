class Human {
    private int age;
    private String name;

    public Human()
    {
        age = 12;
        name = "Mohan";
    }




    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        System.out.println(obj.getName() + " " + obj.getAge());
        Human obj1 = new Human();

       obj1.setAge(30);
        obj1.setName("mohan");
     System.out.println(obj1.getName() + " " + obj1.getAge());
    }
}
