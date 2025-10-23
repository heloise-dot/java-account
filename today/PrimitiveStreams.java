import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveStreams {
    public static void main(String[] args) {
        File file = new File("primitives.dat");   
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream(file))){
            dos.writeInt(5);
            dos.writeUTF("hello");
            dos.writeBoolean(true);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
    

