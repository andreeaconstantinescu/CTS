package state.clase;

public class BusInService implements iBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusAtEndOfRoute){
            System.out.println("the BUS "+bus.getLicensePlace()+" has left in a new route");
            bus.setState(this);
        }
        else {
            System.out.println("the BUS "+bus.getLicensePlace()+" cannot leave in the new route");
        }

    }
}
