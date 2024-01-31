public class HarmonicAverage {
    public static void main(String[] args) {

        int[] arr = {12, 10, 34, 56, 58};
        int elementsNumber = arr.length;
        double harmonic = 0;
        double harmonicAverage;
        for (double i: arr) {
            harmonic += 1.0/i;
        }
        harmonicAverage = elementsNumber / harmonic;
        System.out.print("HARMONİC AVERAGE : " + harmonicAverage);
    }
}
