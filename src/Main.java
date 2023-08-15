package Poo_Interfaces;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        double[] ne1 = { 4.2, 4.3,2.8 };
        Estudiante e1 = new Estudiante("Juan",16,"Masculino","1Q2E3E",ne1);
        ArrayList<String> mp1 = new ArrayList<>();
        mp1.add("Matemáticas");
        Profesor p1 = new Profesor("Rigo",48,"Masculino","Ingeniero Industrial",mp1);
        CursoPresencial curso1 = new CursoPresencial("Programacion","Diruno",p1);

        System.out.println(curso1.toString());
        System.out.println("el promedio del estudiante:"+e1.calcularPromedio());
        System.out.println("La nota mas alta del estudiante: "+e1.calcularMaximo());
        System.out.println("La nota mas baja del estudiante: "+e1.calcularMinimo());
    }
}
