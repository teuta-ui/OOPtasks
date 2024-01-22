public class Main {
    public static void main(String[] args) {

        Person personi1 = new Person("Teuta","Korce");
        Person personi2 = new Person("Eni","Tirane");

        System.out.println(personi1.toString());
        System.out.println(personi2.toString());

        Student studenti1 = new Student(personi1.getName(), personi1.getAddress(), "Informatike", 2,70000);
        Student studenti2 = new Student(personi2.getName(), personi2.getAddress(),"Infermieri", 4, 80000);

        System.out.println(studenti1.toString());
        System.out.println(studenti2.toString());

        Staff st1 = new Staff(personi1.getName(), personi1.getAddress(),"CyberSecurity Master", 1000000);
        Staff st2 = new Staff(personi2.getName(), personi2.getAddress(),"Master", 80000);

        System.out.println(st1.toString());
        System.out.println(st2.toString());
    }
}