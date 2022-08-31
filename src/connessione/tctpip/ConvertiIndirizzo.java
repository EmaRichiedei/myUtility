package connessione.tctpip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ConvertiIndirizzo {
    public static String convertiIP(String hostname) throws UnknownHostException {
        String indirizzoIP=null;
        InetAddress ip= InetAddress.getByName(hostname);
        indirizzoIP=String.valueOf(ip).substring(String.valueOf(ip).indexOf("/")+1);

        return indirizzoIP;
    }
}
