/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junittests;

/**
 *
 * @author Keith
 */
public class CalculateTripStats {

    public static int mpg(int milesDriven, int gallonsUsed) {
        if (gallonsUsed == 0) {
            return 0;
        }
        return milesDriven / gallonsUsed;
    }

    public static int mph(int milesDriven, int hoursDriven) {
        return milesDriven / hoursDriven;
    }
}
