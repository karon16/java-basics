package basics_all;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class numbers_operations {
    public static void main(String[] arg){
        int i = 20;

        BigDecimal rideFee = BigDecimal.valueOf(20).setScale(2);
        BigDecimal amountOfPeople = BigDecimal.valueOf(3);
        BigDecimal chargePerPerson = rideFee.divide(amountOfPeople, RoundingMode.HALF_UP);
        System.out.println(chargePerPerson);

        double d = 3.1;
        double d2 = 1.21;

        BigDecimal bd3 = BigDecimal.valueOf(d).setScale(2);
        BigDecimal bd4 = BigDecimal.valueOf(d2).setScale(2);
        System.out.println(bd3.subtract(bd4));
    }
}