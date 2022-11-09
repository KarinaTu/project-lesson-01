public class Transport {
    private String name;
    private int seats;

    public Transport(String name, int seats) {
        this.name = name;
        this.seats = seats;
    }
    public Transport(){
        System.out.println("New transport is going to be constructed");
    }

    public void move (){
        System.out.println("Transport starting to move");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if(seats>=0){
            this.seats = seats;
        } else {
            System.out.println("Value must be positive!");
        }

    }
}
