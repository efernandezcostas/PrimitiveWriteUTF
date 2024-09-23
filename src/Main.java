import java.io.*;

public class Main {
    public static void main(String[] args) {

        String cadea = "o tempo está xélido";

        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("/home/dam/Work/Clase/AccesoDatos/PrimitiveWriteUTF/texto3.txt", true)));
            for (int i=0; i<3; i++){
                dos.writeUTF(cadea);
                System.out.println((i+1)+" vez: "+cadea+"\nTamano do ficheiro: "+dos.size()+" bytes");
            }
            System.out.println("Tamano final do ficheiro: "+dos.size()+" bytes");
            dos.close();
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        try {
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("/home/dam/Work/Clase/AccesoDatos/PrimitiveWriteUTF/texto3.txt")));

            while (dis.available() != 0) {
                System.out.println("Quedan: "+dis.available()+" bytes\nCadea: " + dis.readUTF());
            }
            System.out.println("Xa non queda nada por ler");

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}

