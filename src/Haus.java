public class Haus {
    private int stockwerke;

    public Haus(int stockwerke) {
        this.stockwerke = stockwerke;
    }

    public int getStockwerke() {
        return stockwerke;
    }

    public void setStockwerke(int stockwerke) {
        if (stockwerke <= 0 || stockwerke > 16) {
            // Ausgabe gehört nicht hierher! (Single Responsibility)
            // System.out.println("Falsche Anzahl der Stockwerke!!");
            return;
        }
        this.stockwerke = stockwerke;
    }

    public void bauen() {
        System.out.println("Es wird eine Haus mit " + this.stockwerke +
                " Stockwerken gebaut.");
    }
}
