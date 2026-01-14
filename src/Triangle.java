public class Triangle {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {                   
		for (int j = 0; j < 2 * i + 1; j++) {  // stars: 1, 3, 5
                System.out.print("*");
            }
            System.out.println();           
        }
    }
}
