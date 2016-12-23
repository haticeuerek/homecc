package ExamA;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Q36 implements Serializable {
    public int x, y;
    public Q36(int x, int y){
        this.x = x; this.y = y;
   }
    
    private void writeObject(ObjectOutputStream s) 
        throws IOException{
        s.writeInt(x); s.writeInt(y);
    }
    
    private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
      x = s.readInt();
      y = s.readInt();
    }
 }
