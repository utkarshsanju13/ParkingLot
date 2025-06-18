package service.Strategy.SlotAllocationStrategy;

import exception.InvalidSlotAllocationStrategy;
import model.enums.SlotAllocationType;

public class SlotAllocationFactory {

    public static SlotAllocationStrategy getSlotAllocationStrategy(SlotAllocationType type) {

        switch (type) {
            case LINER_SLOT_ALLOCATION :
                return new LinerSlotAllocationStrategy();
            default :
                throw new InvalidSlotAllocationStrategy("Please choice the appropriate Slot Allocation Strategy...");
        }
    }
}
