public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Sam", 25);
        Person p2 = new Person("Jane", 50);
        Person p3 = new Person("Eden", 30);

        System.out.println(p1.compareAge(p2));
        System.out.println(p2.compareAge(p1));
        System.out.println(p3.compareAge(p1));

    }
}