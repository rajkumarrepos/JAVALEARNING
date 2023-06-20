import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArray {
        public static void main(String[] args) {
            byte[] data = { 82, 97, 106, 107, 117, 109,97,114,32,77};

            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);

               int byteCode;
               while((byteCode=byteArrayInputStream.read())!=-1){
                   System.out.print((char) byteCode);
               }

                byteArrayInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


