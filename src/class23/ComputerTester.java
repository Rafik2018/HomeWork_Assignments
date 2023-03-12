package class23;

public class ComputerTester {

    public static void main(String[] args) {


        Computer[] pc = {new Apple(), new Lenovo(), new HP(), new Dell()};
        for (Computer computer : pc) {
            computer.Hardware();
            computer.Software();
            computer.Application();


        }

    }

}
