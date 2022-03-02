package homework.OOP.service;

import com.sun.media.sound.RIFFInvalidDataException;
import homework.OOP.IVerhicle;
import homework.OOP.model.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class VehicleService implements IVerhicle {

    List<Vehicle> vehicleList = new ArrayList<>();

//    @Override
//    public String displayTax() {
//        String result = "";
//        for (Vehicle vehicle : vehicleList){
//            if(vehicle.getCapacity()  < 100){
//                result += vehicle.getName() + " " + vehicle.getPriceBy() * 0.01 + "\n";
//            } else if(vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 200){
//                result += vehicle.getName() + " " + vehicle.getPriceBy() * 0.03 + "\n";
//            }else {
//                result += vehicle.getName() + " " + vehicle.getPriceBy() * 0.05 + "\n";
//            }
//        }
//        return result;
//    }


    @Override
    public void addNewVerhicle(Vehicle vehicle) {

        vehicleList.add(vehicle);
    }

    @Override
    public void displayTax() {
        for (Vehicle vehicle : vehicleList){
            if (vehicle.getCapacity() < 100){
                System.out.println(vehicle.getName() + " " + vehicle.getPriceBy() * 0.01);
            } else if (vehicle.getCapacity() >= 100 && vehicle.getCapacity() <= 200){
                System.out.println(vehicle.getName() + " " + vehicle.getPriceBy() * 0.03);
            } else {
                System.out.println(vehicle.getName() + " " + vehicle.getPriceBy() * 0.05);
            }
        }
    }
}
