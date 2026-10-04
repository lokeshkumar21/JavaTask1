class Number {

    void result() {
        System.out.println(10 + 20);
    }
}

class Addition extends Number {

    @Override
    void result() {
        System.out.println(10 * 20);
    }
}

public class OverRiding {

    public static void main(String[] args) {

        Addition a = new Addition();
        a.result();

    }
}