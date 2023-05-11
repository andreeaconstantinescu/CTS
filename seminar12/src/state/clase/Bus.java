package state.clase;

public class Bus {
    private  iBusState state;
    private String licensePlace;

    public iBusState getState() {
        return state;
    }

    public String getLicensePlace() {
        return licensePlace;
    }

    protected void setState(iBusState state) {
        this.state = state;
    }

    public Bus(String licensePlace) {
        this.licensePlace = licensePlace;
        this.state= new BusAtEndOfRoute();
    }
    public void leaveForRoute(){
        iBusState route =new BusInRoute();
        route.changeState(this);
    }

    public void goInService(){
        iBusState route =new BusInService();
        route.changeState(this);
    }

    public void arriveAtTheEndOdRoute(){
        iBusState route =new BusAtEndOfRoute();
        route.changeState(this);
    }



}
