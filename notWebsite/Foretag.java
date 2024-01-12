import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;

public class Foretag {
    public String companyName;
    public String fileName;
    public String className;
    public String category;
    public String description;

    public Foretag(String companyName, String fileName, String className, String category, String description){
        this.companyName = companyName;
        this.fileName = fileName;
        this.className = className;
        this.category = category;
        this.description = description;
    }

    public void createWebsite(){
        FileWriter fWriter = null;
        BufferedWriter writer = null;
        try {
            fWriter = new FileWriter("foretag/"+className+".html");
            writer = new BufferedWriter(fWriter);
            writer.write("<span>This iss your html content here</span>");
            writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
            writer.write("<span>This iss your html content h/span>");
            writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
            writer.write("<span>This iss your html content here</span>");
            writer.newLine(); //this is not actually needed for html files - can make your code more readable though 
            
            
            writer.close(); //make sure you close the writer object 
        } catch (Exception e) {
            System.out.println(e);
        }
        try{
            FileReader fr = new FileReader(new File("../foretag/templateforetag.html"));   //reads the file  
            BufferedReader br=new BufferedReader(fr);  //creates a buffering character input stream  
            String line; 
            
            fWriter = new FileWriter("foretag/"+className+".java");
            writer = new BufferedWriter(fWriter);

            while((line=br.readLine())!=null)  
            {  
                writer.write("writer.write("+line+")");
                
                
                
            }  
            fr.close();    //closes the stream and release the resources  
            } catch(Exception e){
                System.out.print(e);
            }
    }
}
