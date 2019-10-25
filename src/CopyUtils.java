import java.io.*;

public class CopyUtils implements Serializable  {

    public static Object deepCopy(Object object) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(object);
            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);
            return  ois.readObject();

        }
        catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
