public class Main {
    public static void main(String[] args) {
        RaceCar raceCar = new RaceCar();

        TyreTypes.SoftTyres softs = new TyreTypes.SoftTyres();
        TyreTypes.MediumTyres mediums = new TyreTypes.MediumTyres();
        TyreTypes.HardTyres hards = new TyreTypes.HardTyres();

        raceCar.changeTyres(softs);
        raceCar.changeTyres(mediums);
        raceCar.changeTyres(hards);
    }
}