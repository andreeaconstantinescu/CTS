package state.main;

import state.clase.Bancomat;

public class Main {
   public static void main(String [] args){
       Bancomat bancomat= new Bancomat(1000);
       bancomat.introducePin();
       bancomat.retrageCard();
       bancomat.introducePin();
       bancomat.retragereBani(500);
       bancomat.introducePin();
       bancomat.retragereBani(1000);
       bancomat.retrageCard();
   }

}
