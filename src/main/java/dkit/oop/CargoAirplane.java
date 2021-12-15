package dkit.oop;
public class CargoAirplane extends Airplane {

    // fields (ref. Q1)
    int MAX_LOAD_KILOS;
    int currentLoad;

    // constructor

    public CargoAirplane(String type, int maxLoad) {
        super(type);
        this.MAX_LOAD_KILOS = maxLoad;
    }

    public int getMAX_LOAD_KILOS() {
        return MAX_LOAD_KILOS;
    }

    public void setMAX_LOAD_KILOS(int MAX_LOAD_KILOS) {
        this.MAX_LOAD_KILOS = MAX_LOAD_KILOS;
    }

    public int getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(int currentLoad) {
        this.currentLoad = currentLoad;
    }
// toString()


    @Override
    public String toString() {
        return "CargoAirplane{" +
                "MAX_LOAD_KILOS=" + MAX_LOAD_KILOS +
                ", currentLoad=" + currentLoad +
                '}';
    }
} // END of CargoAirplane class.
