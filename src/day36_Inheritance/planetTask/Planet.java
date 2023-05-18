package day36_Inheritance.planetTask;

public class Planet {

    private String name, mass;
    private double radius;
    private String surfaceGravity, surfaceArea;
    private double volume;
    private int population;

    public void setInto(String name, String mass, double radius, String surfaceGravity, String surfaceArea, double volume, int population) {
        setName(name);
        setMass(mass);
        setRadius(radius);
        setSurfaceGravity(surfaceGravity);
        setSurfaceArea(surfaceArea);
        setVolume(volume);
        setPopulation(population);
    }

    public String getName() {
        return name;
    }

    public String getMass() {
        return mass;
    }

    public double getRadius() {
        return radius;
    }

    public String getSurfaceGravity() {
        return surfaceGravity;
    }

    public String getSurfaceArea() {
        return surfaceArea;
    }

    public double getVolume() {
        return volume;
    }

    public int getPopulation() {
        return population;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setSurfaceGravity(String surfaceGravity) {
        this.surfaceGravity = surfaceGravity;
    }

    public void setSurfaceArea(String surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", mass='" + mass + '\'' +
                ", radius=" + radius +
                ", surfaceGravity='" + surfaceGravity + '\'' +
                ", surfaceArea='" + surfaceArea + '\'' +
                ", volume=" + volume +
                ", population=" + population +
                '}';
    }
}
