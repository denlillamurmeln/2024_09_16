package hotel;

//blir röd om man inte har en default konstruktor (heter samma sak, pga arv)
public class StandardRoom extends Room{
    //underklass
    private boolean hasTv;

    public StandardRoom(String roomNr, int capacity, boolean hasTv) {
        //när man ärver används "super", anropar. Super måste ligga först
        super(roomNr, capacity);
        //super kallar på basklassens (Room) konstruktor först
        this.hasTv = hasTv;

    }

    @Override
    public void displayRoomDetails() {
        //turnery, förkortad if-sats. används vid korta saker ex. ja/nej
        System.out.println("Standard room with " + getRoomNr() + " nr and capacity of " + getCapacity() + " guests. Tv: " + /*turneryförkortad if-sats. används korta saker ex->*/(hasTv ? "Ja" : "Nej"));
    }
}
