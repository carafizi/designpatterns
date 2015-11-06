package tutorialspoint.builder2;

import tutorialspoint.builder.Computer;

public class BuilderDemo {


    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(12)
                .cheese(true)
                .pepperoni(true)
                .bacon(true)
                .build();

        System.out.println("Pizza is done. -" + pizza);
    }
}