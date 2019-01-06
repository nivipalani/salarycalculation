/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarycalculation;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Salarycalculation {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HourlyWorker hw=new HourlyWorker("nivi", 43);
        SalariedWorker sw=new SalariedWorker("abi", 63);
        hw.computepay(hw);
        sw.computepay(sw);
    }
    
}
class Worker
{
    String wname;
    int wsal;
    Worker()
    {
        
    }
    Worker(String wname,int wsal)
    {
        this.wname=wname;
        this.wsal=wsal;
    }
    
}
class HourlyWorker extends Worker
{
    HourlyWorker(String wname,int wsal)
    {
        super(wname,wsal);
    }
    static void computepay(Worker w)
    {
        int hours,hwage;
        System.out.println("Name="+w.wname);
        System.out.println("Hours=");
        Scanner sc=new Scanner(System.in);
        hours=sc.nextInt();
        if(hours<40)
        {
            hwage=hours*w.wsal;
            System.out.println("Salary Amount="+hwage);
            
        }
        else
        {
            int h=40;
            int c=h*w.wsal;
            hours+=1.5*(hours-40)*w.wsal;
            System.out.println("Salary Amount="+hours);
        }
             
    }
}
class SalariedWorker extends Worker
{

    SalariedWorker(String wname,int wsal) 
    {
        super(wname,wsal);
        
    }
    static void computepay(Worker s)
    {
        int amt=40*s.wsal;
        System.out.println("Name="+s.wname);
        System.out.println("Salary Amount="+amt);
        
    }
    
    
}