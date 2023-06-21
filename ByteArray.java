import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Optional;
import java.util.Vector;
import java.util.stream.Stream;

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


