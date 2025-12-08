package com.nametag;

import java.io.IOException;
import java.net.ServerSocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NameTagServiceApplication {

	public static void main(String[] args) {
//		findAndSetAvailablePort(8080);
		SpringApplication.run(NameTagServiceApplication.class, args);
	}

	private static void findAndSetAvailablePort(int startPort) {
		int port = startPort;
		// Check ports sequentially
		while (port <= 65535) {
			try (ServerSocket serverSocket = new ServerSocket(port)) {
				// Port is available
				System.setProperty("server.port", String.valueOf(port));
				System.out.println("Found available port: " + port);
				return;
			} catch (IOException e) {
				// Port is in use, try next one
				System.out.println("Port " + port + " is in use. Checking next...");
				port++;
			}
		}
		// Fallback to random port if all else fails
		System.setProperty("server.port", "0");
	}

}
