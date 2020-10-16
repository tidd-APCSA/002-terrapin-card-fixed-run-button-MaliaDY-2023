public class CardRunner {
    public static void main(String args[]){
        // ☕
    TerrapinCard Billy = new TerrapinCard(20);
    TerrapinCard Brian = new TerrapinCard(30);
    Billy.payGourmet();
    Brian.payEconomical();
    System.out.println("Billy: " + Billy);
    System.out.println("Brian: " + Brian);
    Billy.loadMoney(20);
    Brian.payGourmet();
    System.out.println("Billy: " + Billy);
    System.out.println("Brian: " + Brian);
    Billy.payEconomical();
    Billy.payEconomical();
    Brian.loadMoney(50);
    System.out.println("Billy: " + Billy);
    System.out.println("Brian: " + Brian);
    System.out.println(Brian.getBalance());
    }
}
