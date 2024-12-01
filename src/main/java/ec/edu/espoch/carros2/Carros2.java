/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.carros2;

import ec.edu.espoch.carros2.clases.SetyGet;



/**
 *
 * @author mundo
 */
public class Carros2 {

    public static void main(String[] args) {
        
        SetyGet objSetyGet = new SetyGet();
        
            objSetyGet.setMarca("KIA");
            objSetyGet.setModelo(2015);
            objSetyGet.setMotor(900);
            objSetyGet.setColor("Negro");
            objSetyGet.setTipoGasolina("Extra");
            objSetyGet.setTipoAutomovil("Auto");
            objSetyGet.setNumeroPuertas(5);
            objSetyGet.setNumeroAsientos(5);
            objSetyGet.setVelocidadMax(100);
            objSetyGet.setVelocidadAct(80);
           

            objSetyGet.mostrarDatos();
            objSetyGet.acelerar(100);
            objSetyGet.acelerar(20);
            objSetyGet.desacelerar(50);
            objSetyGet.tiempoLlegada(100); 
            objSetyGet.frenar();
    }
}