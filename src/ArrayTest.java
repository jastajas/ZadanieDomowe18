public class ArrayTest {
    public static void main(String[] args) {

        MultiArray multi = new MultiArray(3,4);

        multi.print();

        multi.randomize();

        multi.print();

        System.out.println(multi.findMin());

        multi.print();

        System.out.println(multi.findMax());

        multi.print();


    }
}
