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
            fWriter = new FileWriter(className+".html");
            writer = new BufferedWriter(fWriter);
            
            writer.write("<!DOCTYPE html>");
            writer.newLine();
            writer.write("<html>");
            writer.newLine();
            writer.write("  <head>");
            writer.newLine();
            writer.write("    <meta charset=\"UTF-8\">");
            writer.newLine();
            writer.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            writer.newLine();
            writer.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
            writer.newLine();
            writer.write("    <link rel=\"stylesheet\" href=\"Main.css\">");
            writer.newLine();
            writer.write("    <link rel=\"stylesheet\" href=\"FontFolder/FontCSS.css\">");
            writer.newLine();
            writer.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">");
            writer.newLine();
            writer.write("    <link rel=icon type=image/x-icon href=ImgFolder/Favicon.ico>");
            writer.newLine();
            writer.write("    <title>Företagskupan UF</title>");
            writer.newLine();
            writer.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>");
            writer.newLine();
            writer.write("  </head>");
            writer.newLine();
            writer.write("  <body class=\"body-main\">");
            writer.newLine();
            writer.write("    <!--Navbar-->");
            writer.newLine();
            writer.write("    <nav class=\"navbar navbar-expand-md navbar-dark navbarbg\">");
            writer.newLine();
            writer.write("      <div class=\"container-fluid\">");
            writer.newLine();
            writer.write("        <img src=\"ImgFolder/LogoNoBackground.png\" alt=\"Avatar Logo\" style=\"width: 60px;\" class=\"navbar-brand\"> ");
            writer.newLine();
            writer.write("        <span class=\"navbar-brand fs-1\">Företagskupan UF</span>");
            writer.newLine();
            writer.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsibleNavbar\">");
            writer.newLine();
            writer.write("          <span class=\"navbar-toggler-icon\"></span>");
            writer.newLine();
            writer.write("        </button>");
            writer.newLine();
            writer.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">");
            writer.newLine();
            writer.write("          <ul class=\"navbar-nav\">");
            writer.newLine();
            writer.write("            <li class=\"nav-item\">");
            writer.newLine();
            writer.write("              <a class=\"nav-link\" href=\"default.html\">Startsida</a>");
            writer.newLine();
            writer.write("            </li>");
            writer.newLine();
            writer.write("            <li class=\"nav-item\">");
            writer.newLine();
            writer.write("              <a class=\"nav-link\" href=\"foretagen.html\">Företagen</a>");
            writer.newLine();
            writer.write("            </li>");
            writer.newLine();
            writer.write("            <li class=\"nav-item\">");
            writer.newLine();
            writer.write("              <a class=\"nav-link\" href=\"forforetag.html\">För UF Företag</a>");
            writer.newLine();
            writer.write("            </li>    ");
            writer.newLine();
            writer.write("            <li class=\"nav-item\">");
            writer.newLine();
            writer.write("              <a class=\"nav-link\" href=\"omoss.html\">Om oss</a>");
            writer.newLine();
            writer.write("            </li> ");
            writer.newLine();
            writer.write("          </ul>");
            writer.newLine();
            writer.write("        </div>");
            writer.newLine();
            writer.write("      </div>");
            writer.newLine();
            writer.write("    </nav> ");
            writer.newLine();
            writer.write("    ");
            writer.newLine();
            writer.write("    <div class=\"row\" style=\"margin:1px\"> ");
            writer.newLine();
            writer.write("        <!--");
            writer.newLine();
            writer.write("        <div class=\"col-md-6 hex-img mx-5 mt-2\" id=\"foretag-"+ className +"\"></div>");
            writer.newLine();
            writer.write("        -->");
            writer.newLine();
            writer.write("        <img src=\"ImgFolder/foretag_loggor/"+fileName+"\" alt=\""+companyName+" logo\" class=\"col-md-6 px-2 my-4 \">");
            writer.newLine();
            writer.write("");
            writer.newLine();
            writer.write("        <div class=\"my-3 col-md-5 offset-1px-2 pe-5 mt-md-5 col-xs-11\">");
            writer.newLine();
            writer.write("            <h1>"+companyName+"</h1>");
            writer.newLine();
            writer.write("            <h3>Skönhet</h3>");
            writer.newLine();
            writer.write("            <p class=\"fs-5\">"+description+"</p>");
            writer.newLine();
            writer.write("");
            writer.newLine();
            writer.write("            <h3>Länkar:</h3>");
            writer.newLine();
            writer.write("            <p class=\"fs-5\"></p>");
            writer.newLine();
            writer.write("        </div>");
            writer.newLine();
            writer.write("        ");
            writer.newLine();
            writer.write("    </div>");
            writer.newLine();
            writer.write("");
            writer.newLine();
            writer.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>");
            writer.newLine();
            writer.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>");
            writer.newLine();
            writer.write("");
            writer.newLine();
            writer.write("  </body>");
            writer.newLine();
            writer.write("</html>");

            
            writer.close(); //make sure you close the writer object 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
