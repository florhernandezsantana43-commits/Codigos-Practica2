import java.util.Scanner;

public class Calculo_salario {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int horas,pago,horasex,pagohex,horasnor;
        System.out.println("Ingresa tu nombre:");
        nombre= sc.nextLine();
        System.out.println("Cuantas horas trabajaste a la semana:");
        horas= sc.nextInt();
        System.out.println("Ingresa tu pago por hora:");
        pago= sc.nextInt();
        if (horas>=40){
            System.out.println("Tus horas normales son:40");
            System.out.println("Tus horas extras son:"+(horas-40));
            horasnor=horas*pago;
            horasex=horas-40;
            pagohex=horasex*pago;
            System.out.println("Tu salaraio total es de:"+(horasnor+pagohex));

        } else {
            System.out.println("Tus horas trabajadas son:"+horas);
            System.out.println("Tu salario total es de:"+horas*pago);
        }
    }

}