/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodatagramsocketemisor;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 *
 * @author otorradomiguez
 */
public class EjemploDatagramSocketEmisor {

    public static void main(String[] args) {
        try {
            System.out.println("Creando socket datagram");

            DatagramSocket datagramSocket = new DatagramSocket();

            System.out.println("enviando mensaje");

            String mensaje = "mensaje desde el emisor";

            InetAddress addr = InetAddress.getByName("10.0.160.113");
            DatagramPacket datagrama
                    = new DatagramPacket(mensaje.getBytes(),
                            mensaje.getBytes().length,
                            addr, 5555);
            datagramSocket.send(datagrama);

            System.out.println("Mensaje enviado");

            System.out.println("Cerrando el socket datagrama");

            datagramSocket.close();

            System.out.println("Terminado");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
