public class Variables {
    public static void main(String[] args) {
        String fullName = "Christian Duong";
        int age = 26;
        double battery = 99.5;
        boolean isDeveloper = true;
        char myClass = 'S';

        System.out.println(fullName);
        System.out.println(age);
        System.out.println(battery);
        System.out.println(isDeveloper);
        System.out.println(myClass);

        if (age > 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a child");
        }

        if (isDeveloper == true) {
            System.out.println("You are a developer");
        } else {
            System.out.println("You are not a developer");
        }
    }
}
