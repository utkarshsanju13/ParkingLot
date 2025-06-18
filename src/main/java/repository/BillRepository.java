package repository;

import exception.BillNotFoundException;
import model.Bill;

import java.util.HashMap;
import java.util.Map;

public class BillRepository {

    private Map<Integer, Bill> billsMap;
    public static int billCounter = 0;

    public BillRepository() {
        this.billsMap = new HashMap<>();
    }

    public Bill get(int id) {
        Bill bill = billsMap.get(id);
        if (bill == null) {
            throw new BillNotFoundException("NO bill found with id :" + id);
        }
        return bill;
    }

    public void put(Bill bill) {
        billsMap.put(++billCounter, bill);
    }
}
