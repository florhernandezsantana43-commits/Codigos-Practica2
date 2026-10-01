import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Compra_productos {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int precio,cant,sub;
        int total;
        int envio=80;
        double des=0.0;
        System.out.println("Ingrese el precio del producto:");
        precio= sc.nextInt();
        System.out.println("¿Cunatas cantidades deseas comprar?");
        cant= sc.nextInt();
        sub=precio*cant;
        System.out.println("tu subtotal es de:"+sub);
        if (sub>=1000) {
            des = sub * 0.10;
            System.out.println("tu descuento es de:"+des);
            System.out.println("El total del descuento es de:"+(sub-des));
        }else{
            System.out.println("Tu descuento es de:$0");

        }
        if (sub>=1500){
            System.out.println("Tu envio es de:$0");
            System.out.println("Tu total es de:"+(sub-des));
        }else{
            System.out.println("Tu envio es de:"+envio);
            System.out.println("Tu envio es de:"+(sub+envio));
        }
        }
    }

