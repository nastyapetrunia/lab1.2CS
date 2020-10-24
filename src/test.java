public class test {
    public static void main(String[] args) {
        Student stud1 = new Student("Mike", 345);
        Student stud2 = new Student("Mike", 345);
        Student stud3 = new Student("Nike", 345);
        Student stud4 = new Student("Mike", 346);
        Student stud5 = new Student("Jane", 347);

        System.out.println("Needs to be true: " + stud1.equals(stud2));
        System.out.println("Hash stud1: " + stud1.hashCode());
        System.out.println("Hash stud2: " + stud2.hashCode());
        System.out.println("Needs to be false: " + stud1.equals(stud3));
        System.out.println("Hash stud3: " + stud3.hashCode());
        System.out.println("Needs to be false: " + stud1.equals(stud4));
        System.out.println("Hash stud4: " + stud4.hashCode());
        System.out.println("Needs to be false: " + stud1.equals(stud5));
        System.out.println("Hash stud5: " + stud5.hashCode());
    }
}
