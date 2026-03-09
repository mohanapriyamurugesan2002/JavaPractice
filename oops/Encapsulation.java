public class Encapsulation {

    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {

        Encapsulation ac = new Encapsulation();

        ac.setSalary(100000);

        System.out.println(ac.getSalary());
    }
}