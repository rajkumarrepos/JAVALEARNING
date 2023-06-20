import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
        public static void main(String[] args) {
            try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream("data.bin"))) {
                // Write various data types to the output stream
                dataOutputStream.writeInt(42);
                dataOutputStream.writeDouble(3.14);
                dataOutputStream.writeUTF("Hello, World");

                System.out.println("Data written");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


