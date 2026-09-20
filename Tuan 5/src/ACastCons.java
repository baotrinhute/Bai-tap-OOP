public class ACastCons extends ACastList {
    private Cast rest;
    private ACastList last;
    public ACastCons(Cast rest, ACastList last){
        this.rest = rest;
        this.last = last;
    }
}
