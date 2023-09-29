package service;

import model.Plane;

public class PlaneService implements PlaneServiceInterface {
    public void Task1(Plane plane) {
        System.out.println("Model: " + plane.getModel());
        System.out.println("Country: " + plane.getCountry());
        System.out.println("Year: " + plane.getYear());
        System.out.println("Hours: " + plane.getHours());
        System.out.println("IsMilitary: " + plane.isMilitary());
        System.out.println("Weight: " + plane.getWeight());
        System.out.println("Wingspan: " + plane.getWingspan());
        System.out.println("TopSpeed: " + plane.getTopSpeed());
        System.out.println("Seats: " + plane.getSeats());
        System.out.println("Cost: " + plane.getCost());
    }

    public void Task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("Cost: " + plane.getCost() + " | TopSpeed: " + plane.getTopSpeed());
        } else {
            System.out.println("Model: " + plane.getModel() + " | Country: " + plane.getCountry());
        }
    }

    public Plane Task3(Plane planeFirst, Plane planeSecond) {
        if (planeSecond.getYear() > planeFirst.getYear()) {
            return planeSecond;
        }
        return planeFirst;
    }

    public String Task4(Plane planeFirst, Plane planeSecond) {
        if (planeFirst.getWingspan() > planeSecond.getWingspan()) {
            return planeFirst.getModel();
        }
        return planeSecond.getModel();
    }

    public void Task5(Plane planeFirst, Plane planeSecond, Plane planeThird) {
        if (planeFirst.getSeats() <= planeSecond.getSeats() &&
                planeFirst.getSeats() <= planeThird.getSeats()) {
            System.out.println(planeFirst.getCountry());
        } else if (planeSecond.getSeats() < planeFirst.getSeats() &&
                planeSecond.getSeats() < planeThird.getSeats()) {
            System.out.println(planeSecond.getCountry());
        } else {
            System.out.println(planeThird.getCountry());
        }
    }

    public void Task6(Plane[] planes) {
        for (Plane plane : planes) {
            if (!plane.isMilitary()) {
                Task1(plane);
            }
        }
    }

    public void Task7(Plane[] planes) {
        Plane militaryPlane = null;

        for (Plane plane : planes) {
            if (militaryPlane == null) {
                if (plane.isMilitary()) {
                    militaryPlane = plane;
                }
            } else if (plane.isMilitary() && plane.getHours() > 100) {
                militaryPlane = plane;
                Task1(militaryPlane);
            }
        }
        if (militaryPlane == null) {
            System.out.println("Don't have military plane");
        }
    }

    public Plane Task8(Plane[] planes) {
        Plane minWeightPlane = planes[0];
        for (int i = 1; i < planes.length; i++) {
            if (planes[i].getWeight() <= minWeightPlane.getWeight()) {
                minWeightPlane = planes[i];
            }
        }
        return minWeightPlane;
    }

    public Plane Task9(Plane[] planes) {
        Plane militaryPlaneMinCost = null;
        for (Plane plane : planes) {
            if (militaryPlaneMinCost == null) {
                if (plane.isMilitary()) {
                    militaryPlaneMinCost = plane;
                }
            } else if (plane.isMilitary() && plane.getCost() < militaryPlaneMinCost.getCost()) {
                militaryPlaneMinCost = plane;
            }
        }
        return militaryPlaneMinCost;
    }

    public void Task10(Plane[] planes) {
        Plane tempPlain;
        for (int i = 0; i < planes.length; i++) {
            for (int j = 1; j < planes.length - i; j++) {
                if (planes[i].getYear() < planes[j - 1].getYear()) {
                    tempPlain = planes[j];
                    planes[j] = planes[j - 1];
                    planes[j - 1] = tempPlain;
                }
            }
        }
        for (Plane plane : planes) {
            Task1(plane);
        }
    }
}
