package com.example.demoBugJarVerifier;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.security.KeyStore;

@SpringBootApplication
public class DemoBugJarVerifierApplication {

	public static void main(String[] args) throws Exception {
		System.out.println("hello");
		KeyStore pkcs12KeyStore = KeyStore.getInstance("PKCS12", new BouncyCastleProvider());
		InputStream str = Thread.currentThread().getContextClassLoader().getResourceAsStream("keystore.p12");
		pkcs12KeyStore.load(str, "x".toCharArray());
		//SpringApplication.run(DemoBugJarVerifierApplication.class, args);
	}

}
