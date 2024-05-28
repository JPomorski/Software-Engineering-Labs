public class RaceCar {
    Tyres tyres;

    public void changeTyres(Tyres tyres) {
        this.tyres = tyres;
        tyres.showTyreType();
    }
}
