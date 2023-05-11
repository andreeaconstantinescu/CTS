package state.main;

import state.clase.Bus;
import state.clase.iBusState;

public class Main {
    public static void main(String[] args){
        Bus bus = new Bus("TL21DIU");
        bus.goInService();
        bus.arriveAtTheEndOdRoute();
        bus.arriveAtTheEndOdRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOdRoute();

    }
}
