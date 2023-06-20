
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class JavaFilterOutputStream extends FilterOutputStream {


        private static final byte ENCRYPTION_KEY = 3;

    public JavaFilterOutputStream(OutputStream out) {
            super(out);
        }

        @Override
        public void write ( int b) throws IOException {
            byte encryptedByte = (byte) (b ^ ENCRYPTION_KEY);
            super.write(encryptedByte);
        }

        @Override
        public void write ( byte[] b, int off, int len) throws IOException {

            byte[] encryptedBytes = new byte[len];
            for (int i = 0; i < len; i++) {
                encryptedBytes[i] = (byte) (b[off + i] ^ ENCRYPTION_KEY);
            }
            super.write(encryptedBytes, 0, len);
        }
    }

