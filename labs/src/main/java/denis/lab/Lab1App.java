package denis.lab;

public class Lab1App {

    public static void main(String[] argv) {

        if (argv.length != 2) {
            System.err.println("You should specify the following arguments: var1 var2");
            System.exit(-1);
        }

        // Stashing initial variable values
        int a0 = Integer.valueOf(argv[0]);
        int b0 = Integer.valueOf(argv[1]);

        int a = a0;
        int b = b0;
        System.out.println("Initial variable values: a = " + a + ", b = " + b);

        int c;

        c = b;
        b = a;
        a = c;

        System.out.println("The result of two number swapping by means of a temporary variable: a = "
                + a + ", b = " + b);

        // Restoring variable values from the initial ones
        a = a0;
        b = b0;

        a ^= b;
        b ^= a;
        a ^= b;

        System.out.println("The result of two number swapping without a temporary variable: a = "
                + a + ", b = " + b);

    }

}
