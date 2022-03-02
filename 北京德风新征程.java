import java.util.LinkedList;

public class Test {


    public static void main(String[] args) {
        LinkedList<Print> prints = new LinkedList<>();
        prints.add(new Print3());
        prints.add(new Print5());
        prints.add(new Print3And5());

        for (int i = 1; i <= 100 ; i++) {
            for (Print print : prints) {
                if(print.support(i)){
                    print.print(i);
                }
            }
        }
    }

    static class Print3 implements Print {

        @Override
        public boolean support(int value) {
            return value % 3 == 0 || String.valueOf(value).contains("3");
        }

        @Override
        public void print(int value) {
            System.out.println("Fizz");
        }
    }

    static class Print5 implements Print {

        @Override
        public boolean support(int value) {
            return value % 5 == 0 || String.valueOf(value).contains("5");
        }

        @Override
        public void print(int value) {
            System.out.println("Buzz");
        }
    }

    static class Print3And5 implements Print {

        @Override
        public boolean support(int value) {
            return value % 5 == 0 && value % 3 == 0;
        }

        @Override
        public void print(int value) {
            System.out.println("FizzBuzz");
        }
    }

    interface Print {
        boolean support(int value);
        void print(int value);
    }


}
