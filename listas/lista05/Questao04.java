package lista05;

public class Questao04 {
    public static void main(String[] args){

        for (int hora = 0; hora<24; hora++){
            for (int minuto = 0; minuto < 60; minuto++){
                for (int seg = 0; seg < 60; seg++){
                    System.out.println(hora + ":" + minuto + ":" + seg);
                }
            }
        }
    }
}
