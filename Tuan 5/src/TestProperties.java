import junit.framework.TestCase;

public class TestProperties extends TestCase{
    public void testConstructor() {
        Address a1 = new Address("67", "Truong Dinh", "2", "Ho Chi Minh");
        Address a2 = new Address("68", "Truong Anh", "3", "Ho Chi Minh");
        Address a3 = new Address("57", "Truong Duc", "5", "Ho Chi Minh");
        Properties p1 = new SingleFamilyHouse(a1,67.36,500,3);
        Properties p2 = new Condominium(a2,36.67,2,true);
        Properties p3 = new MultiFamilyHouse(a3,56.56,5);
    }
}
