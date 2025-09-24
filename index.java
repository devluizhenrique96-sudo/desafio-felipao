public class index {
    public static void main(String[] args) {
      
        String nomeDoHeroi = "Superman";
        int xpDoHeroi = 100000;
     
        String nivelDoHeroi = "";

        if (xpDoHeroi >= 10000) {
            nivelDoHeroi = "Supremo";

        } else if (xpDoHeroi >= 1001 && xpDoHeroi <= 2000) {
            nivelDoHeroi = "Bronze";

        } else if (xpDoHeroi >= 2001 && xpDoHeroi <= 3000) {
            nivelDoHeroi = "Prata";

        } else if (xpDoHeroi >= 3001 && xpDoHeroi <= 4000) {
            nivelDoHeroi = "Ouro";

        } else if (xpDoHeroi >= 4001 && xpDoHeroi <= 5000) {
            nivelDoHeroi = "Platina";

        } else if (xpDoHeroi >= 5001 && xpDoHeroi <= 6000) {
            nivelDoHeroi = "Diamante";

        } else if (xpDoHeroi >= 6001 && xpDoHeroi <= 7000) {
            nivelDoHeroi = "Mestre";

        } else if (xpDoHeroi >= 7001 && xpDoHeroi <= 8000) {
            nivelDoHeroi = "Grão-Mestre";

        } else if (xpDoHeroi >= 8001 && xpDoHeroi <= 9000) {
            nivelDoHeroi = "Lendário";

          }  else if (xpDoHeroi >= 9001 && xpDoHeroi <= 10000) { nivelDoHeroi = "Radiante";
            
        } else { 
            nivelDoHeroi = "Ferro";
    
        }

           System.out.println("O herói " + nomeDoHeroi + " está no nível: " + nivelDoHeroi);
            
        



        
    }
    
}
