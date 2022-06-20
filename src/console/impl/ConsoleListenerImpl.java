package console.impl;

import console.ConsoleListener;
import control.KeyDecoder;
import control.impl.KeyDecoderImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ConsoleListenerImpl implements ConsoleListener {

    @Override
    public void listen() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        KeyDecoder keyDecoder = new KeyDecoderImpl();
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());
        while (true) {
            System.out.println(keyDecoder.decode(br.readLine()));
        }
    }


}
