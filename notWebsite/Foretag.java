import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.io.FileReader;
import java.io.File;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;

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
        OutputStreamWriter writer;
        //BufferedWriter writer = null;
        String newline = System.getProperty("line.separator");
        try {
            writer = new OutputStreamWriter(new FileOutputStream("foretag/"+className+".html"), StandardCharsets.UTF_8);
            writer.write("<!DOCTYPE html>");
            writer.write(newline);
            writer.write("<html>");
            writer.write(newline);
            writer.write("  <head>");
            writer.write(newline);
            writer.write("    <meta charset=\"UTF-8\">");
            writer.write(newline);
            writer.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            writer.write(newline);
            writer.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">");
            writer.write(newline);
            writer.write("    <link rel=\"stylesheet\" href=\"../Main.css\">");
            writer.write(newline);
            writer.write("    <link rel=\"stylesheet\" href=\"../FontFolder/FontCSS.css\">");
            writer.write(newline);
            writer.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN\" crossorigin=\"anonymous\">");
            writer.write(newline);
            writer.write("    <link rel=icon type=image/x-icon href=../ImgFolder/Favicon.ico>");
            writer.write(newline);
            writer.write("    <title>Företagskupan UF</title>");
            writer.write(newline);
            writer.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>");
            writer.write(newline);
            writer.write("  </head>");
            writer.write(newline);
            writer.write("  <body class=\"body-main\">");
            writer.write(newline);
            writer.write("    <script async src=\"https://www.googletagmanager.com/gtag/js?id=G-LYDLLFNNS5\"></script>");
            writer.write(newline);
            writer.write("    <script>");
            writer.write(newline);
            writer.write("      window.dataLayer = window.dataLayer || [];");
            writer.write(newline);
            writer.write("      function gtag(){dataLayer.push(arguments);}");
            writer.write(newline);
            writer.write("      gtag(\'js\', new Date());");
            writer.write(newline);
            writer.write("");
            writer.write(newline);
            writer.write("      gtag(\'config\', \'G-LYDLLFNNS5\');");
            writer.write(newline);
            writer.write("    </script>");
            writer.write(newline);
            writer.write("    <!--Navbar-->");
            writer.write(newline);
            writer.write("    <nav class=\"navbar navbar-expand-md navbar-dark navbarbg\">");
            writer.write(newline);
            writer.write("      <div class=\"container-fluid\">");
            writer.write(newline);
            writer.write("        <img src=\"../ImgFolder/LogoNoBackground.png\" alt=\"Avatar Logo\" style=\"width: 60px;\" class=\"navbar-brand\"> ");
            writer.write(newline);
            writer.write("        <span class=\"navbar-brand fs-1\">Företagskupan UF</span>");
            writer.write(newline);
            writer.write("        <button class=\"navbar-toggler\" type=\"button\" data-bs-toggle=\"collapse\" data-bs-target=\"#collapsibleNavbar\">");
            writer.write(newline);
            writer.write("          <span class=\"navbar-toggler-icon\"></span>");
            writer.write(newline);
            writer.write("        </button>");
            writer.write(newline);
            writer.write("        <div class=\"collapse navbar-collapse\" id=\"collapsibleNavbar\">");
            writer.write(newline);
            writer.write("          <ul class=\"navbar-nav\">");
            writer.write(newline);
            writer.write("            <li class=\"nav-item\">");
            writer.write(newline);
            writer.write("              <a class=\"nav-link\" href=\"../default.html\">Startsida</a>");
            writer.write(newline);
            writer.write("            </li>");
            writer.write(newline);
            writer.write("            <li class=\"nav-item\">");
            writer.write(newline);
            writer.write("              <a class=\"nav-link\" href=\"../foretagen.html\">Företagen</a>");
            writer.write(newline);
            writer.write("            </li>");
            writer.write(newline);
            writer.write("            <li class=\"nav-item\">");
            writer.write(newline);
            writer.write("              <a class=\"nav-link\" href=\"../forforetag.html\">För UF Företag</a>");
            writer.write(newline);
            writer.write("            </li>    ");
            writer.write(newline);
            writer.write("            <li class=\"nav-item\">");
            writer.write(newline);
            writer.write("              <a class=\"nav-link\" href=\"../omoss.html\">Om oss</a>");
            writer.write(newline);
            writer.write("            </li> ");
            writer.write(newline);
            writer.write("          </ul>");
            writer.write(newline);
            writer.write("        </div>");
            writer.write(newline);
            writer.write("      </div>");
            writer.write(newline);
            writer.write("    </nav> ");
            writer.write(newline);
            writer.write("    ");
            writer.write(newline);
            writer.write("    <div class=\"row\" style=\"margin:1px\"> ");
            writer.write(newline);
            writer.write("        <!--");
            writer.write(newline);
            writer.write("        <div class=\"col-md-6 hex-img mx-5 mt-2\" id=\"foretag-"+ className +"\"></div>");
            writer.write(newline);
            writer.write("        -->");
            writer.write(newline);
            writer.write("        <img src=\"../ImgFolder/foretag_loggor/"+fileName+"\" alt=\""+companyName+" logo\" class=\"col-md-6 px-2 my-4 \">");
            writer.write(newline);
            writer.write("");
            writer.write(newline);
            writer.write("        <div class=\"my-3 col-md-5 offset-1px-2 pe-5 mt-md-5 col-xs-11\">");
            writer.write(newline);
            writer.write("            <h1>"+companyName+"</h1>");
            writer.write(newline);
            writer.write("            <h3>"+category+"</h3>");
            writer.write(newline);
            writer.write("            <p class=\"fs-5\">"+description+"</p>");
            writer.write(newline);
            writer.write("");
            writer.write(newline);
            writer.write("            <h3>Länkar:</h3>");
            writer.write(newline);


            
            writer.write("            <p class=\"fs-5\"></p>");
            writer.write(newline);
            writer.write("        </div>");
            writer.write(newline);
            writer.write("        ");
            writer.write(newline);
            writer.write("    </div>");
            writer.write(newline);
            writer.write("");
            writer.write(newline);
            writer.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>");
            writer.write(newline);
            writer.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>");
            writer.write(newline);
            writer.write("");
            writer.write(newline);
            writer.write("  </body>");
            writer.write(newline);
            writer.write("</html>");

            
            writer.close(); //make sure you close the writer object 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
