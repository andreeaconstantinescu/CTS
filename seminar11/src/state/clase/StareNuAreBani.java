package state.clase;

public class StareNuAreBani implements  iStare {
        @Override
        public void modificaStare(Bancomat bancomat){
            if (bancomat.getStare() instanceof StarePinIntrodus) {
                bancomat.setStare(this);
                System.out.println(this);
            }

        }
    }