public class SímboloArray {
    public static void main(String[] args) throws Exception {
        char[] simbolo= new char[10];
        simbolo[0]='a';
        simbolo[1]='x';
        simbolo[4]='@';
        simbolo[6]='`';
        simbolo[7]='+';
        simbolo[8]='Q';
        for (int i=0; i<10; i++) {
            System.out.println(simbolo[i]);
        }
    }
}
//a los valores que no han sido inicializados no se les asigna nada
