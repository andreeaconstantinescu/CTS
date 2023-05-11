package state.clase;

public class BusAtEndOfRoute implements iBusState{
    @Override
    public void changeState(Bus bus) {
        if(bus.getState() instanceof BusInRoute || bus.getState() instanceof BusInService){
            System.out.println("Autobuzul "+ bus.getLicensePlace()+ " has reached the end of the line");
            bus.setState(this);
        }
        else {
            System.out.println("Autobuzul"+ bus.getLicensePlace()+"has reached the end of the line");
        }

    }
}
