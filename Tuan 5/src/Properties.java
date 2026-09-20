public abstract class Properties {
    protected Address address;
    protected double askingPrice;
    protected Properties(Address address, double askingPrice){
        this.address = address;
        this.askingPrice = askingPrice;
    }
}
