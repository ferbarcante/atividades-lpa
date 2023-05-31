package lista05;

public class Questao04Teste {
    public static void main(String[] args){

        int h, m, s;
        h = 0;
        m = 0;
        s = 0;
        while(h != 24) {
            System.out.println(h+":"+m+":"+s);
            s++;
            if(s==60) {
                s=0;
                m++;
                if(m==60) {
                    m=0;
                    h++;
                }
            }

        }
    }
}
