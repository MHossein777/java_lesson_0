public class Mars{
    public static void main(String[] args) {

     float earthWeight;
     float marsWeight;
     double marsWeightindouble;
     int marsWeightinint;

     earthWeight = 60;
     marsWeight = (earthWeight * 0.38f);
        System.out.println(earthWeight + "kg on earth is" + marsWeight + "kg on mars");

        marsWeightindouble = marsWeight;
        System.out.println("kilograms on mars after converting to double "+ marsWeightindouble);
        System.out.printf("kilograms on mars displayed to 4 decimal places: %.4f %n", marsWeightindouble);

        marsWeightinint = (int) marsWeightindouble;
        System.out.println("kilograms on mars when casted to integer" + marsWeightinint);

        char c = (char)marsWeightinint;
        System.out.println("the ascii equvaelent of marsweightinint" + c);

        int exampleofmathonchar = c*c;
        System.out.println("an example of mathemathical operation on the char type" + exampleofmathonchar);
    }
}

