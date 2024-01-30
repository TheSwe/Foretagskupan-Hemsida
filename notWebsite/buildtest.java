
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
public class buildtest {
    public static void main(String[] args) {
        try{
            FileReader fr = new FileReader(new File("C://Users//arvid.kagedal//Documents//GitHub//Foretagskupan-Hemsida//notWebsite//templateforetag.html"));   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String line; 
            FileWriter fWriter = null;
            BufferedWriter writer = null;
            
            fWriter = new FileWriter("notWebsite/test.java");
            writer = new BufferedWriter(fWriter);
    
            while((line=br.readLine())!=null)  
            {  
                writer.write("writer.write(\""+line+"\");");
                writer.newLine();
                writer.write("writer.newLine();");
                writer.newLine();
            }  
            writer.close();
            fr.close();    //closes the stream and release the resources  
        } catch(Exception e){
            System.out.print(e);
        }
    }

}
