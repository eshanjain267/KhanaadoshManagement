/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package khanaBadosh.Gui;

import static java.lang.System.out;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author HP
 */
public class testing {
     public static String add() throws Throwable{
         NetworkInterface nets = NetworkInterface.getByName("wlan1");
         
         return   displayInterfaceInformation(nets);
     }
    public static String displayInterfaceInformation(NetworkInterface netint) {
        Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
        String ip="";
        for (InetAddress inetAddress : Collections.list(inetAddresses))
        {
            ip = inetAddress.getHostAddress();
            break;
        }
            return ip;
            } 
}
  
    

