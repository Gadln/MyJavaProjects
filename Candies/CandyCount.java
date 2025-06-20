class CandyCount {

  static double money = 12.4;
  static double price = 1.2;
  static int candies = 0;
  
  public static void main(String[] args) {
    if (money > 0 && price > 0) {
      while ((money - price) >= 0) {
        candies = candies + 1;
        money = money - price;
      }
      // Affichage du résultat après la boucle
      System.out.println("Nombre de bonbons achetés : " + candies);
      System.out.println("Argent restant : " + money);
    } else {
          System.out.println("Erreur : l'argent et le prix doivent être positifs");
        }
    }
  }