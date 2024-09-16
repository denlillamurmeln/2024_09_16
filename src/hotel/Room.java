package hotel;

//Basklass
//talar bara om det gemensamma beteenden
public /*abstract*/ class Room {
    //Room: basklass, innehåller alla egenskaper och beteende som alla rum har gemensamt
    //StandardRoom och Suite: underklasser till Room + egna unika egenskaper
    //BookingService: hantera bokningar, tillgänglighet mm.

    //markerar man klassen abstract kan man undvika att det går att skapa ett objekt av klassen

    //gäller för alla rum
    private String roomNr;
    private int capacity;
    private boolean isBooked;

    public Room(String roomNr, int capacity) {
        //this nyckelord, refererar till klassens egna objekt (instans)
        //i en konstruktor måste man använda "this." fattar inte skillnaden mellan (i detta fall private) och denna klass
        this.roomNr = roomNr;
        this.capacity = capacity;
        //standardvärde
        this.isBooked = false;
    }


    public String getRoomNr() {
        return roomNr;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    //Metod för att boka rum
    public void bookRoom() {
        if(!isBooked){
            isBooked = true;
            System.out.println("Room " + roomNr + " is booked");
        } else {
            System.out.println("Room " + roomNr + " is already booked");
        }
    }

    //metod för att avboka rum
    public void unBookRoom() {
        if(isBooked){
            isBooked = false;
            System.out.println("Room " + roomNr + " is unbooked");
        } else {
            System.out.println("Room " + roomNr + " is not booked");
        }
    }

    //metod för att visa detaljer om rummet

    /*@Override
    public String toString() {
        return "Room{" +
                "roomNr='" + roomNr + '\'' +
                ", capacity=" + capacity +
                ", isBooked=" + isBooked +
                '}';*/
    public void displayRoomDetails() {
        System.out.println("Room " + roomNr + " with capacity of " + capacity + " guests");
    }


    }

