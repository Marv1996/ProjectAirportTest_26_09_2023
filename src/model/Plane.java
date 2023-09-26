package model;

public class Plane {
    String model;
    String country;
    int year;
    int hours;
    boolean isMilitary;
    int weight;
    int wingspan;
    int topSpeed;
    int seats;
    double cost;

    public Plane() {
    }

    public Plane(
            String model,
            String country,
            int year,
            int hours,
            boolean isMilitary,
            int weight,
            int wingspan,
            int topSpeed,
            int seats,
            double cost
    ) {
        this.setModel(model);
        this.setCountry(country);
        this.setYear(year);
        this.setHours(hours);
        this.setMilitary(isMilitary);
        this.setWeight(weight);
        this.setWingspan(wingspan);
        this.setTopSpeed(topSpeed);
        this.setSeats(seats);
        this.setCost(cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1902 && year < 2022) {
            this.year = year;
        }
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 10001) {
            this.hours = hours;
        }
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 9999 && weight < 160001) {
            this.weight = weight;
        }
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        if (wingspan > 9 && wingspan < 46) {
            this.wingspan = wingspan;
        }
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        if (topSpeed >= 0 && topSpeed < 1001) {
            this.topSpeed = topSpeed;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats >= 0) {
            this.seats = seats;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }
    }
}
