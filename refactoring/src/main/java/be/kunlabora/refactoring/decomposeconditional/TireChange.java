package be.kunlabora.refactoring.decomposeconditional;


import static java.util.Calendar.DECEMBER;
import static java.util.Calendar.FEBRUARY;

public class TireChange {

    private static final int WINTER_START = DECEMBER;
    private static final int WINTER_END = FEBRUARY;
    private int quantity;
    private int winterrate;
    private int winterservicecharge;
    private int summerrate;

    public TireChange(final int quantity, final int winterrate, final int winterservicecharge, final int summerrate) {
        super();
        this.quantity = quantity;
        this.winterrate = winterrate;
        this.winterservicecharge = winterservicecharge;
        this.summerrate = summerrate;
    }

    int charge(final int monthOfYear) {
        int charge;
        if (monthOfYear >= WINTER_START || monthOfYear <= WINTER_END) {
            charge = quantity * winterrate + winterservicecharge;
        } else {
            charge = quantity * summerrate;
        }
        return charge;
    }
}