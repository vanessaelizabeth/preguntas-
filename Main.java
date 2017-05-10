/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC-14
 */
import Pregunta2.Cuenta;
public class Main {
    
    public static void main (String[]args){
        Cuenta cta1= new Cuenta();
        cta1.setSaldo(1000);
        System.out.println("Saldo Inicial:"+cta1.getSaldo());
        System.out.println("retiro: 500");
        cta1.retiro(500);
        System.out.println("retiro: 50");
        cta1.retiro(50);
        System.out.println("Saldo:"+ cta1.getSaldo());
        System.out.println("deposito: 10");
        cta1.deposito(10);
        System.out.println("Saldo:"+ cta1.getSaldo());
        
        Cuenta cta2 = new Cuenta(0, 100);
        cta2.retiro(1000);
        System.out.println("Saldo:"+ cta2.getSaldo());
        
        
    }
}
