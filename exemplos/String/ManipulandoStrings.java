package String;

public class ManipulandoStrings {
    public static void main(String[] args){
        String x = "Essa é uma String";

        //mostrando quantas letras tem
        System.out.println(x.length());

        //concatenando
        System.out.println(x + " concatenada");

        //ver se tem uma palavra contida na string
        System.out.println(x.contains("nova"));

        //quando a palava começa ou termina
        System.out.println(x.indexOf("é"));

        //manipulando caixa alta ou baixa
        System.out.println(x.toUpperCase());
    }
}
