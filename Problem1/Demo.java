public class Demo {

    public static void main(String[] args) {

        Person bob = new Person("Coach Bob", 27, "M");
        System.out.println("=== Person ===");
        System.out.println(bob);

        Student lynne = new Student("Lynne Brooke", 16, "F", "HS95129", 3.5);
        System.out.println("\n=== Student ===");
        System.out.println(lynne);

        Teacher mrJava = new Teacher("Duke Java", 34, "M", "Computer Science", 50000);
        System.out.println("\n=== Teacher ===");
        System.out.println(mrJava);

        CollegeStudent ima = new CollegeStudent("Ima Frosh", 18, "F", "UCB123", 4.0, 1, "English");
        System.out.println("\n=== CollegeStudent ===");
        System.out.println(ima);
    }
}