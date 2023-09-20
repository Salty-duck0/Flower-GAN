package JAVA;
import java.io.IOException;
public class Project{
    public static void load(){
        String Script_Path = "C:\\Users\\nitis\\OneDrive\\Desktop\\WorkSpace\\Project\\src\\JAVA\\model.py";
        ProcessBuilder Process_Builder = new ProcessBuilder("python",Script_Path).inheritIO();
        Process Demo_Process;
        try {
            Demo_Process = Process_Builder.start();
            Demo_Process.waitFor();
        } catch (InterruptedException|IOException e) {

            e.printStackTrace();
        }
    }
    
}