package menuop;
//menú de opciones promedio de 3 calif, tabla de multiplicar de un numero e imprimir los num del 1 al 100
import javax.swing.JOptionPane;
public class MenuOp {
    public static void main(String[] args) {
       int opcion=0;
       int calf1,calf2,calf3,promedio; 
       do {
           opcion=Integer.parseInt(JOptionPane.showInputDialog("<<<<<<<<<<<<<<<<<<<menu>>>>>>>>>>>>>>>>>"
                   + "\n1.-promedio de 3 calificaciones"
                   + "\n2.-tabla de multiplicar de un número"
                   + "\n3.-imprimir del 1 al 100"
                   + "\n4.-salir"));
          switch(opcion){
              case 1:
                  JOptionPane.showMessageDialog(null, "Promedio");
                  calf1=Integer.parseInt(JOptionPane.showInputDialog("Dame la primer calificación"));
                  calf2=Integer.parseInt(JOptionPane.showInputDialog("Dame la segunda calificación"));
                  calf3=Integer.parseInt(JOptionPane.showInputDialog("Dame la última calificación"));
                  promedio=(calif1+calif2+calif3)/3;
                  JOptionPane.showMessageDialog(null, "El Promedio es: "+promedio+);
                  break;
              case 2:
                  JOptionPane.showMessageDialog(null, "Tabla");
                  break;
              case 3:
                  JOptionPane.showMessageDialog(null, "serie");
                  break;
              case 4:
                JOptionPane.showMessageDialog(null, "Adios");
                  break;
              default:
                JOptionPane.showMessageDialog(null, "Opcion no valida");
                  break;
          }
       }while(opcion != 4);
    }
}
