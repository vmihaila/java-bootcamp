package exceptions.data.model;

import java.io.Closeable;
import java.io.IOException;

public class CustomResource implements Closeable {


    public void doStuff() {

        System.out.println("Pistoleto blindato");

    }

    @Override
    public void close() throws IOException {

        System.out.println("Closed the custom resource");

    }
}
