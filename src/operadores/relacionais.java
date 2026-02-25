package operadores;

public class relacionais {
    
    public static void main(String[] args) {
       
       // Sempre irão retornar um valor booleano (true ou false)
        boolean isDezMaiorQueVinte = 10 >= 20;
        boolean isDezMenorQueVinte = 10 <= 20;
        boolean isDezIgualAVinte = 10 == 20;
        boolean isDezIgualADez = 10 == 10.0;
        boolean isDezdiferenteDeDez = 10 != 10.0;
        System.out.println("10 é maior que 20? " + isDezMaiorQueVinte);
        System.out.println("10 é menor que 20? " + isDezMenorQueVinte);
        System.out.println("10 é igual a 20? " + isDezIgualAVinte);
        System.out.println("10 é igual a 10? " + isDezIgualADez);
        System.out.println("10 é diferente de 10? " + isDezdiferenteDeDez);
    }
}
