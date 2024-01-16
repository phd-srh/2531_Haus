public class Main {
    public static void main(String[] args) {
        Haus bungalo = new Haus(1);
        Haus tower = new Haus(11);

        bungalo.setStockwerke(-1);
        bungalo.bauen();
        tower.bauen();
    }
}
