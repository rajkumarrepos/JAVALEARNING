import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteOutput {
    public static void main(String[] args) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

            byteArrayOutputStream.write("Rajkumar ---- hai".getBytes());
            byte[] data = byteArrayOutputStream.toByteArray();
            System.out.print(new String(data));
            byteArrayOutputStream.close();
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
