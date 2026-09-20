public class ConsWallet extends AListOfPebbles{
    private APebble pebble;
    private AListOfPebbles rest;
    public ConsWallet(APebble pebble, AListOfPebbles rest){
        this.pebble = pebble;
        this.rest = rest;
    }
}
