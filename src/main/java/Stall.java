public abstract class Stall {

    private String name;
    private String ownerName;
    private int parkingSpot;
    private int rating;

    public Stall(){
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
    }

    public String getName(){
        return this.name;
    }
}
