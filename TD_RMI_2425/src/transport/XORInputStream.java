package transport;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class XORInputStream extends FilterInputStream {
    private final byte key = 0x5A; // Clé XOR

    public XORInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int data = super.read();
        return (data == -1) ? data : (data ^ key);
    }
}
