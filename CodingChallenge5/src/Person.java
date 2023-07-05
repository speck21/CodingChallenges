public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //returns false if comparer is younger, true if older
    public String compareAge(Person person){
        if(this.age>person.age){
            return this.name + " is older than " + person.name + ".";
        }else{
            return this.name + " is younger than " + person.name + ".";
        }
    }
}
