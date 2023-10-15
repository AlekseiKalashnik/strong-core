package ua.epam.javacore.lesson_09_lambda_stream_url;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {
    public static void main(String args[]) throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println(address);
        address = InetAddress.getByName("www.epam.ua");
        System.out.println(address);
        InetAddress sw[] = InetAddress.getAllByName("www.proselyte.net");
        for (InetAddress inetAddress : sw) System.out.println(inetAddress);
    }
}
