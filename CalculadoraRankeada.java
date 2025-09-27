public class CalculadoraRankeada {

    public static void main(String[] args) {
        // dados para vários jogadores em arrays
        String[] herois = {"Aragorn", "Gimli", "Legolas", "Frodo"};
        int[] vitorias = {110, 85, 95, 15};
        int[] derrotas = {5, 10, 2, 8};

        // Laço de repetição "for" para passar por cada herói
        for (int i = 0; i < herois.length; i++) {
            
            // Pega os dados do herói da vez (na posição "i" do array)
            int vitoriasDoHeroi = vitorias[i];
            int derrotasDoHeroi = derrotas[i];
            String nomeDoHeroi = herois[i];

            // Reutiliza as mesmas funções que já criei
            int saldoVitorias = calcularSaldo(vitoriasDoHeroi, derrotasDoHeroi);
            String nivel = determinarNivel(vitoriasDoHeroi);

            // Exibe a mensagem para o herói atual
            System.out.println("O Herói " + nomeDoHeroi + " tem de saldo de " + saldoVitorias + " está no nível de " + nivel);
        }
    }

    // funções auxiliares 
    public static int calcularSaldo(int numVitorias, int numDerrotas) {
        return numVitorias - numDerrotas;
    }

public static String determinarNivel(int numVitorias) {
    String nivel;

    if (numVitorias <= 10) {
        nivel = "Ferro";
    } else if (numVitorias <= 20) {
        nivel = "Bronze";
    } else if (numVitorias <= 50) {
        nivel = "Prata";
    } else if (numVitorias <= 80) {
        nivel = "Ouro";
    } else if (numVitorias <= 90) {
        nivel = "Diamante";
    } else if (numVitorias <= 100) {
        nivel = "Lendário";
    } else {
        nivel = "Imortal";
    }
    
    return nivel;
}
}
