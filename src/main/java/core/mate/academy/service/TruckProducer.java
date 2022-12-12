package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        Truck firstTruck = new Truck();
        Truck secondTruck = new Truck();
        Truck thirdTruck = new Truck();
        List<Truck> trucks = new ArrayList<>();
        trucks.add(firstTruck);
        trucks.add(secondTruck);
        trucks.add(thirdTruck);
        return trucks;
    }
}