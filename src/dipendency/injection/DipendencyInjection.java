/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dipendency.injection;

/**
 *
 * @author User
 */
public class DipendencyInjection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DipendencyInjection.putTier(provideTier());
    }

    public static Tier provideTier() {
        return new Tier(0, 0);
    }

    public static void putTier(Tier myTier) {
        Car myCar = new Car(myTier);
        Lorry myLorry = new Lorry(myTier);
        Jeep myJeep = new Jeep(myTier);
    }

}
