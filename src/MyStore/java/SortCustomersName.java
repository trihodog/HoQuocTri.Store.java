package MyStore.java;

import java.util.Comparator;

public class SortCustomersName implements Comparator<Customers> {
    @Override
    public int compare(Customers o1, Customers o2) {
        return o1.getCustomerName().compareTo(o2.getCustomerName());
    }
}
