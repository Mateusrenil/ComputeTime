public class ComputeTime {

    public static void main(String[] args) {
        
    int x1 = 1, y1 = 2; // coordenadas do ponto 1
        int x2 = 4, y2 = 6; // coordenadas do ponto 2
        int speed = 5; // velocidade do objeto em unidades por segundo

        double distance = getDistance(x1, y1, x2, y2);
        double time = distance / speed;

        System.out.println("A distância entre os pontos é: " + distance);
        System.out.println("Tempo para percorrer a distância a " + speed + " unidades por segundo é: " + time + " segundos");
    }

    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
        


