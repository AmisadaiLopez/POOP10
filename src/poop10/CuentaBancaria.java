/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop10;

/**
 *
 * @author López Hernández Miriam Amisadai
 * clase Cuenta bancaria, recibe un saldo
 */
public class CuentaBancaria {
    private double saldo;
/**
 * constructor vacio con parametro de saldo=0
 */    
    public CuentaBancaria(){
        saldo=0;
    }
/**
 * 
 * @param monto recibe el monto
 */
    public void depositar(double monto){
        System.out.println("Depositado "+monto);
        saldo+=monto;
    }
/**
 * 
 * @param monto recibe el monto
 * @throws SaldoInsuficienteException lanza explicitamente la exepcion
 */
    public void retirar (double monto) throws SaldoInsuficienteException{
        System.out.println("Retirado "+monto);
        if (saldo<monto) 
            throw new SaldoInsuficienteException();
        else
        saldo-=monto;
     
    }
/**
 * 
 * @return retorna a saldo
 */
    public double getSaldo() {
        return saldo;
    }
}
