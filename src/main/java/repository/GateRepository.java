package repository;

import exception.GateNotFound;
import model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    
    private Map<Integer, Gate> gatesMap;

    public GateRepository() {
        this.gatesMap = new HashMap<Integer, Gate>();
    }
    
    public Gate get(int id) {
        Gate gate = gatesMap.get(id);
        if(gate == null) {
            throw new GateNotFound("There is no such gateFound..");
        }
        return gate;
    }
    
    public void put(int id,Gate gate) {
        gatesMap.put(id, gate);
    }
}
