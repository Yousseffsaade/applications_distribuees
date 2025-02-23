package transport;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class XOROutputStream extends FilterOutputStream {
    private final byte key = 0x5A; // Clé XOR

    public XOROutputStream(OutputStream out) {
        super(out);
    }

    @Override
    public void write(int b) throws IOException {
        super.write(b ^ key);
    }
}
