package state.clase;

public class StareAreCard implements  iStare {

    @Override
    public void modificaStare(Bancomat bancomat) {
        if(bancomat.getStare() instanceof StareNuAreCard){
            bancomat.setStare(this);
            System.out.println("A fost introdus un card in bancomat!");
        }
        else{
            System.out.println("Are deja un card");
        }

    }
}
