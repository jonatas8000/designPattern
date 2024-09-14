package br.com.designPattern;

import java.util.ArrayList;
import java.util.List;

import br.com.designPattern.adapter.Motor;
import br.com.designPattern.adapter.MotorPadrao;
import br.com.designPattern.adapter.MotorTurbo;
import br.com.designPattern.adapter.SuperMotorVerde;
import br.com.designPattern.adapter.SuperMotorVerdeAdapter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        List<Motor> motores  = new ArrayList<>();
        
        motores.add(new MotorPadrao(1300));
        motores.add(new MotorPadrao(1600));
        motores.add(new MotorTurbo(2000));
        
        SuperMotorVerde motorVerde  = new SuperMotorVerde(1200);
        motores.add(new SuperMotorVerdeAdapter(motorVerde));
        
        motores.forEach(e->System.out.println(e));
    }
}
