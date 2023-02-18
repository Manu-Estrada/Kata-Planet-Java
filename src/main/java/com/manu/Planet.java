package com.manu;

public class Planet {
    String name = null;
    int numberSatellites = 0;
    double mass = 0;
    double volume = 0;
    int diameter = 0;
    int distanceSun = 0;
    enum typePlanet{ GASEOUS, TERRESTRIAL, DWARF }
    typePlanet type;
    boolean isObservable = false;


Planet (String name, int numberSatellites, double mass, double volume, int diameter, int distanceSun, typePlanet type, boolean isObservable) {
    this.name = name;
    this.numberSatellites = numberSatellites;
    this.mass = mass;
    this.volume = volume;
    this.diameter = diameter;
    this.distanceSun = distanceSun;
    this.type = type;
    this.isObservable = isObservable;
}

    public Planet(String string, int i, double d, double e, double f, int j, int k, typePlanet terrestrial, boolean b) {
}

    void println() {
        System.out.println("name of planet = "+ name);
        System.out.println("numberSatellites = "+ numberSatellites);
        System.out.println("mass of planet = "+ mass);
        System.out.println("planet of volume = "+ volume);
        System.out.println("diameter of planet = "+ diameter);
        System.out.println("distance of sun = "+ distanceSun);
        System.out.println("type of planet =" + type);
        System.out.println("isObservable ="+ isObservable);
    }

    double calculateDensity() {
        return mass/volume;
        }


        boolean isObservable(){
            float limit = (float) (149597870 * 3.4);
            if (distanceSun > limit) {
            return true;
            } else {
            return false;
            }
            }
          
            public static void main(String args[]) {
            Planet p1 = new Planet("Earth",1,5.9736E24,1.0832,
            1E12,12742,150000000,typePlanet.TERRESTRIAL,true);
            p1.println();
            System.out.println("density of the planet = " + 
            p1.calculateDensity());
            System.out.println("is outer planet = " + 
            p1.isObservable());
            System.out.println();
            Planet p2 = new Planet("Júpiter",79,1.899E27,1.431,
              3E15,139820,750000000,typePlanet.GASEOUS,true);
            p2.println();
            System.out.println("density of the planet = " + 
            p2.calculateDensity());
            System.out.println("is exterior planet = " + 
            p2.isObservable());
            }
         }

