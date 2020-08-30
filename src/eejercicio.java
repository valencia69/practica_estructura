import java.util.Scanner;

public class eejercicio {
    int[] notas;

    Scanner scanner;

    //metodo constructor
    public  eejercicio(){
        notas =new  int [5];
        scanner =new Scanner(System.in);
    }
    //metodod ejecutar
    public  void  ejecutar() {

        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: ");
            int nota = scanner.nextInt();

            notas[i] = nota;
        }
        double suma = 0;
        double promedio;
        int minimo = 10;
        int maximo = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("notas[" + i + "]: " + notas[i]);
            suma = suma + notas[i];
            if (notas[i] < minimo) {
                minimo = notas[i];

            }
            if (notas[i] > maximo) {
                maximo = notas[i];
            }
            promedio = suma / notas.length;
            System.out.println("promedio : " + promedio);
            System.out.println("maximo: " + maximo);
            System.out.println("minimo : " + minimo);

        }
     }

    }