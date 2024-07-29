package JavaDeveloperDio.src.metodos;

public class metodo1 {
    public static void main(String[] args) {

        public void varargs ( int...numeros){
            int soma = 0;
            for (int num : numeros) {
                soma += num;
            }

            System.out.println("Soma: " + soma);
        }
    }
}
