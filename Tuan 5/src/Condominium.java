public class Condominium extends Properties{
    private int roomNumber;
    private boolean accessibleWithoutClimbing;
    public Condominium(Address address, double askingPrice, int roomNumber, boolean accessibleWithoutClimbing){
        super(address,askingPrice);
        this.roomNumber = roomNumber;
        this.accessibleWithoutClimbing = accessibleWithoutClimbing;
    }
}
