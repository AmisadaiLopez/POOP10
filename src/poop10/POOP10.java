/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop10;

/**
 *
 * @author López Hernández Miriam Amisadai
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Hola Mundo");
        String [] mensajes={"Primero", "Segundo", "Tercero"};
        try{
            for (int i = 0; i <= 3; i++) {
                System.out.println("Mensaje: "+mensajes[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Hola Mundo 2");
        }
        
        double x;
        try{
            x=0f/0;
        }catch (ArithmeticException e){
            System.out.println("Error");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("Error");
            System.out.println(e.getMessage());
        }finally{
            System.out.println("A pesar de todo, se ejecuta el bloque finally");
        }
        
        System.out.println("Hola Mundo 3");
        try{
            double division=metodoDivision(4f,6.0); 
        }catch (UnsupportedOperationException e){
            System.out.println(e.getMessage());
        }           
    }

    private static double metodoDivision(float f, double d) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Operacion no soportada"); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
