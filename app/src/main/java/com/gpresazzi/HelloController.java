package com.gpresazzi;

import java.net.InetAddress;
import java.net.UnknownHostException;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {


        InetAddress ip;
        String hostname = "";
        try {
            ip = InetAddress.getLocalHost();
            hostname = ip.getHostName();
            System.out.println("Your current IP address : " + ip);
            System.out.println("Your current Hostname : " + hostname);

            String output = String.format("Greetings from Spring Boot ( %s %s )!", ip, hostname);
            return output;

        } catch (UnknownHostException e) {

            e.printStackTrace();
            return "Error while executing request !";
        }


    }

}