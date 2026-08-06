package week_1.day_07;

public class UnitConverter {
    
    // --- Length Conversions ---

    /**
     * Converts kilometers to miles.
     * @param kilometers The distance in kilometers.
     * @return The equivalent distance in miles.
     */
    public static double kmToMi(double kilometers) {
        return kilometers * 0.621371;
    }

    /**
     * Converts miles to kilometers.
     * @param miles The distance in miles.
     * @return The equivalent distance in kilometers.
     */
    public static double miToKm(double miles) {
        return miles * 1.60934;
    }

    // --- Mass/Weight Conversions ---

    /**
     * Converts kilograms to pounds.
     * @param kilograms The weight in kilograms.
     * @return The equivalent weight in pounds.
     */
    public static double kgToLb(double kilograms) {
        return kilograms * 2.20462;
    }

    /**
     * Converts pounds to kilograms.
     * @param pounds The weight in pounds.
     * @return The equivalent weight in kilograms.
     */
    public static double lbToKg(double pounds) {
        return pounds * 0.453592;
    }

    // --- Volume Conversions ---

    /**
     * Converts liters to US gallons.
     * @param liters The volume in liters.
     * @return The equivalent volume in US gallons.
     */
    public static double lToGal(double liters) {
        return liters * 0.264172;
    }

    /**
     * Converts US gallons to liters.
     * @param gallons The volume in US gallons.
     * @return The equivalent volume in liters.
     */
    public static double galToL(double gallons) {
        return gallons * 3.78541;
    }
}
