public class MultiFamilyHouse extends Properties {
    private int numberOfApartments;
    public MultiFamilyHouse(Address address,double askingPrice,int numberOfApartments){
        super(address,askingPrice);
        this.numberOfApartments = numberOfApartments;
    }
}
