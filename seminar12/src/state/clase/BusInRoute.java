package state.clase;

public class BusInRoute implements iBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("The BUS "+bus.getLicensePlace()+"has left in a new route");
            bus.setState(this);
        }
        else {
            System.out.println("the bus "+bus.getLicensePlace()+"has left in a new route");
        }

    }
}
