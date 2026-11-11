import java.math.BigDecimal;

public class main {
    public static void main(String[] args) {
        //INITIALIZATION
        float floatVal = 0;
        double doubleVal = 0;
        BigDecimal BigDeciVal = BigDecimal.ZERO;

        //LOOP ONE
        for (int i = 0; i < 10; i++) {
            floatVal += 0.10f;
            System.out.println(floatVal);

            doubleVal += 0.10;
            System.out.println(doubleVal);

            BigDeciVal = BigDeciVal.add(new BigDecimal("0.10"));
            System.out.println(BigDeciVal);

            System.out.println("FLOAT: " + floatVal + "| DOUBLE: " + doubleVal + "| BIG DECIMAL: " + BigDeciVal + "\n" );
        }
        System.out.println("");
        System.out.println("#######################################################################################");
        System.out.println("");

        floatVal = 0;
        doubleVal = 0;
        BigDeciVal = BigDecimal.ZERO;

        for (int i = 0; i < 1000; i++) {
            floatVal += 19.99f;

            doubleVal += 19.99;

            BigDeciVal = BigDeciVal.add(new BigDecimal("19.99"));

        }
        System.out.println("FLOAT: " + floatVal + "| DOUBLE: " + doubleVal + "| BIG DECIMAL: " + BigDeciVal + "\n");

        // Convert the final values to BigDecimal to use compareTo()
        BigDecimal finalFloat = BigDecimal.valueOf(floatVal);
        BigDecimal finalDouble = BigDecimal.valueOf(doubleVal);


        // float compare with the double
        System.out.println("------------ FLOAT VS DOUBLE ------------");
        int floatVsDouble = finalFloat.compareTo(finalDouble);
        System.out.println("Float vs Double: " + floatVsDouble); // 0 if equal, -1 if float < double, 1 if float > double
        switch(floatVsDouble) {
            case 0 -> System.out.println("float and double have the same value");
            case -1 -> System.out.println("Float is less than double");
            case 1 -> System.out.println("Float is bigger than double");
            default -> {
                System.out.println("I dont know what's going on, good luck");
                System.exit(1);
            }
        }

        // double compare with the BigDecimal
        System.out.println("------------ DOUBLE VS BIG DECIMAL ------------");
        int doubleVsBigDecimal = finalDouble.compareTo(BigDeciVal);
        System.out.println("Double vs BigDecimal: " + doubleVsBigDecimal); // 0 if equal, -1 if double < BigDecimal, 1 if double > BigDecimal

        switch(doubleVsBigDecimal) {
            case 0 -> System.out.println("double and BigDecimal have the same value");
            case -1 -> System.out.println("double is less than BigDecimal");
            case 1 -> System.out.println("double is bigger than BigDecimal");
            default -> {
                System.out.println("I dont know what's going on, good luck");
                System.exit(1);
            }
        }

        // Compare Float vs. BigDecimal
        System.out.println("------------ FLOAT VS BIG DECIMAL ------------");
        int floatVsBigDecimal = finalFloat.compareTo(BigDeciVal);
        System.out.println("Float vs BigDecimal: " + floatVsBigDecimal);

        switch(floatVsBigDecimal) {
            case 0 -> System.out.println("Float and BigDecimal have the same value");
            case 1 -> System.out.println("float is bigger than BigDecimal");
            case -1 -> System.out.println("float is less than BigDecimal");
            default -> {
                System.out.println("I dont know what's going on, good luck");
                System.exit(1);
            }
        }
    }
}
