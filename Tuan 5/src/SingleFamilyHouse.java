public class SingleFamilyHouse extends Properties{
    private double landArea;
    private int roomNumber;
    public SingleFamilyHouse(Address address,double askingPrice,double landArea,int roomNumber){
        super(address,askingPrice);
        this.landArea = landArea;
        this.roomNumber = roomNumber;
    }
}
