import junit.framework.TestCase;

public class TestAListOfPebbles extends TestCase {
    public void testConstructor(){
        APebble p1 = new PebbleColor1("Blue");
        APebble p2 = new PebbleColor1("Red");
        APebble p3 = new PebbleColor1("Yellow");
        APebble p4 = new PebbleColor1("Green");
        APebble p5 = new PebbleColor1("Orange");
        AListOfPebbles a1 = new EmptyWallet();
        AListOfPebbles a2 = new ConsWallet(p1,a1);
        AListOfPebbles a3 = new ConsWallet(p2,a2);
        AListOfPebbles a4 = new ConsWallet(p3,a3);
        AListOfPebbles a5 = new ConsWallet(p4,a4);
        AListOfPebbles a6 = new ConsWallet(p5,a5);
    }
}
