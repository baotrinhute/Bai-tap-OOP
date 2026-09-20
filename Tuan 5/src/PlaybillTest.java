import junit.framework.TestCase;

public class PlaybillTest extends TestCase {
    public void testConstructor(){
        People author = new People("Trinh","Bao");
        AHeader aheader = new AHeader(author,"turtle boss");
        Actor a1 = new Actor(new People("Hoang","Tri"),true);
        Actor a2 = new Actor(new People("Le","Liem"),true);
        Actor a3 = new Actor(new People("Tran","Nam"),true);
        Cast a1s = new Cast(a1,"Astra");
        Cast a2s = new Cast(a2,"Phoenix");
        Cast a3s = new Cast(a3,"Gekko");
        ACastList a = new ACastEmpty();
        ACastList A1 = new ACastCons(a1s,a);
        ACastList A2 = new ACastCons(a2s,A1);
        ACastList A3 = new ACastCons(a3s,A2);
        Playbill p = new Playbill(aheader,A3);
    }
}






