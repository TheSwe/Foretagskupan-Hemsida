public class htmlFiler2 {
    public static void main(String[] args) {
        
        String[] files = {"beautybox.jpg","biobags.jpg","doftljuskonstverk.jpg","headsup.png","lucida.jpg","lyckotassar.png","mothlightapparel.jpg","satine.jpg","wakehvirkning.jpg","pure.jpg", "aggu.png", "amarone.png", "pomelo3d.png","unpredictaboard.png"};
        String[] alts = {"Beautybox UF","Biobags UF","Doftljus Konstverk UF","Heads Up UF","Lucida UF","Lyckotassar UF","Mothlight Apparel UF","Satine UF","WAKEH Virkning UF","Pure Accessories UF", "Aggu UF","Amarone UF","Pomelo 3D UF", "UnpredictaBoard UF"};
        String[] foretag = {"beautybox","biobags","doftljuskonstverk","headsup","lucida","lyckotassar","mothlightapparel","satine","wakehvirkning","pure","aggu","amarone","pomelo3d","unpredicaboard" };
        String[] kategori = {"Skönhet","Tygväskor","Doftljus","Snickeri","Doftljus","Smycken","Kläder","Smycken","Gosedjur","Smycken", "Kläder", "Hem & Inredning", "3D modeller", "Brädspel"};
        String[] descriptions = {"Beauty Box UF säljer en beauty box med innehåll av sminkredskap & ett test av mineralsmink.", "Vi heter Romeo, Holger och Ludvig. Vi säljer kvalitativa, miljövänliga tygväskor som är designade med ett speciellt tryck.",
        "Vi erbjuder ett brett utbud av naturliga doftljus i olika former och dofter. Våra produkter hjälper kunder att skapa en trevlig och avkopplande atmosfär i sina hem, samtidigt som de kan fungera som gåvor eller dekorativa element.",
        "Vi är ett ny tänkande UF företag som fokuserar på hantverk och återvändning av spill material för att producera snygga men också funktionella dator stativ i trä.",
        "Lucida UF säljer hemmagjorda doftljus gjorda på åtevunnet stearin", 
        "Lyckotassar UF skapar smycken i form av en tass, produkten är helt egen och extra unit då detta inte finns ute på marknaden idag. Lyckotassar UF erbjuder tassar med två olika teman att välja på, måndens färg eller egen design.",
        "Mothlight Apparel UF är ett ungdomsföretag som drivs med målet att göra folket mer uttrycksfulla - speciellt när det gäller deras stil. Vi vill alltså se folk hitta sin egen stil med minimal budget och på ett hållbart sätt. Många av våra produkter är handgjorda av återvunnet Material från dels andrahand tyger och smycket.",
        "Vi på Satine UF vill bidra med något till samhället och psykiskt ohälsa samtidigt som vi vill göra personliga smycken. Därför har vi valt att stödja organisationen maskrosbarnen med att donera en del av vår vinst. Detta samtidigt som kunderna kan få personliga armband där kunden kan få sin eller någon annans initial.",
        "WAKEH Virkning UF gör virkade gosedjur av alla slag i olika färg och storlek. Allt dethär går att beställa och ändra på ifall man skulle vilja det.",
        "Pure Accessories UF designar smycken med hög kvalitet till överkomliga priser.",
        "Aggu fokuserar på att skapa kläder med tryck inspirerade av, kultur och natur genom att samarbeta med lokala konstnärer och designers, vilket låter kunderna välja från ett brett utbud av exklusiva tryck.",
        "Vår affärside är att omvandla och återanvända gamla glasflaskor för att tillverka stilrena och unika doftljus. Doftljusen är handgjorda och erbjuder ett miljövänligt alternativ som passar hållbarhetstänkande och miljömedvetna kunder. Våran affärside sträcker sig långt från att tillverka doftljus, vi vill inspirera och uppmuntra folk till en mer hållbar livsstil",
        "Vi erbjuder skräddarsydda 3D-modelleringar och visualiseringar som uppfyller kundens unika behov och önskemål. Genom att använda digitala verktyg skapar vi allt från interiördesignprojekt till små figuriner som 3D-utskrivs, och vi involverar kunden aktivt i hela processen för att säkerställa att resultatet lever upp till deras individuella vision.",
        "Vi planerar att göra ett överlevnads brädspel som har skräck element. Brädspelet är riktat mot ungdomar och vuxna"};
        String[] links = {""};
        //hexObj(foretag, alts, kategori, descriptions);
        //carouselImg(files, alts, kategori, descriptions);
        //carouselDesc(files, alts, kategori, descriptions);
        //hexClass(files, foretag, alts, kategori, descriptions);
        Foretag beautybox = new Foretag(alts[0], files[0], foretag[0], kategori[0], descriptions[0]);
        beautybox.createWebsite();
    }

    public static void Obj(String[] foretag, String[] alts) {
        for (int i = 0; i<foretag.length;i++){
            System.out.println("<li class=\"hex\">");
            System.out.println("  <div class=\"hexIn\">");
            System.out.println("    <a class=\"hexLink\" href=\"#\">");
            System.out.println("      <div class='hex-img' id='foretag-"+foretag[i]+"'></div>");
            System.out.println("      <h1 id=\"demo1\">"+alts[i]+"</h1>");
            System.out.println("    </a>");
            System.out.println("  </div>");
            System.out.println("</li>");
        }
    }
    public static void hexObj(String[] foretag, String[] alts, String[] kategori, String[] descriptions){
        for (int i = 0; i<foretag.length;i++){
            System.out.println("<li class=\"hex\">");
            System.out.println("  <div class=\"hexIn\">");
            System.out.println("    <a class=\"hexLink\" href=\"#\">");
            System.out.println("      <div class='hex-img' id='foretag-"+foretag[i]+"'></div>");
            System.out.println("      <h1 id=\"demo1\">"+alts[i]+"</h1>");
            System.out.println("    </a>");
            System.out.println("  </div>");
            System.out.println("</li>");
        }
    }
    public static void carouselImg(String[] files, String[] alts, String[] kategori, String[] descriptions){
        for (int i = 0; i<files.length;i++){
            System.out.println("<div class=\"carousel-item\">");
            System.out.println("  <img src=\"./ImgFolder/FöretagLoggor/"+files[i]+"\" alt=\""+alts[i]+"\" class=\"d-block w-100\" data-color=\"white\">");
            System.out.println("</div>");
        }
    }
    public static void carouselDesc(String[] files, String[] alts, String[] kategori, String[] descriptions){
        for (int i = 0; i<files.length;i++){
            System.out.println("<div class=\"carousel-item\">");
            System.out.println("  <div class=\"mt-5\">");
            System.out.println("    <h1>"+alts[i]+"</h1>");
            System.out.println("    <h3>"+kategori[i]+"</h3>");
            System.out.println("    <p>"+descriptions[i]+"</p>");
            System.out.println("  </div>");
            System.out.println("</div>");
        }
    }
    public static void hexClass(String[] files, String[] foretag, String[] alts, String[] kategori, String[] descriptions){
        for (int i = 0; i<files.length;i++){
            System.out.println("#foretag-"+foretag[i]+"{");
            System.out.println("    background-image: url(./ImgFolder/FöretagLoggor/"+files[i]+");");
            System.out.println("    background-repeat: no-repeat;");
            System.out.println("    background-size: cover;");
            System.out.println("}");
        }
    }
}

/* 
#foretag-doftljuskonstverk{
    background-image: url(./ImgFolder/FöretagLoggor/doftljuskonstverk.jpg);
    background-repeat: no-repeat;
    background-size: cover;
  }*/
