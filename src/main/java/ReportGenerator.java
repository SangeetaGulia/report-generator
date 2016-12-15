import java.io.*;

public class ReportGenerator {

    void initiateReportGeneration()
    {
        try {
            File file = new File("index.html");
            OutputStream outputStream = new FileOutputStream(file);
            PrintWriter writer = new PrintWriter(outputStream);

            String indexContent = createLayout();
            writer.print(indexContent);

            System.out.println("Generated index.html successfully");
            writer.close();
            outputStream.close();
        }
        catch (FileNotFoundException fileException) {
            System.out.println("File not found" + fileException);
        }catch (IOException ioException) {
            System.out.println("Input Output Exception occured ");
        }
    }

    String createLayout(){

       String htmlStart = "<html>\n" +
               "<head>\n" +
               "<title> Performance Report </title>\n" +
               "\n";

        String startBody = "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n";


        String closeBodyAndHtml = "\n" +
                "</body>\n" +
                "\n" +
                "</html>";



        String layout = htmlStart + addScript() + startBody + startContainer() + addLeftSideBar() + addRightSidebar() + closeContainer() + closeBodyAndHtml;

        return layout;

    }

    String addScript(){
        return "    <meta charset=\"utf-8\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "    <link rel=\"stylesheet\" href=\"src/main/resources/bootstrap-3.3.6-dist/css/bootstrap.min.css\">\n" +
                "    <script src=\"src/main/resources/jquery/jquery-2.2.0.min.js\"></script>\n" +
                "    <script src=\"src/main/resources/bootstrap-3.3.6-dist/js/bootstrap.min.js\"></script>\n" +
                "\n" +
                "    <script src=\"src/main/resources/custom/css/leftSidebar.css\"></script>\n" +
                "    <script src=\"src/main/resources/custom/css/rightSidebar.css\"></script>";
    }

    String startContainer() {
        return "\n" +
                "<div class=\"container\">\n" +
                "<div class=\"row\">\n" +
                "\n" +
                "    ";
    }

    String closeContainer() {
        return "\n" +
                "</div>\n" +
                "</div>\n" +
                "\n";
    }

    String addLeftSideBar() {
      return  "\n" +
              "    <div class=\"col-sm-4\">\n" +
              "    <div id=\"leftSidebar\">\n" +
              "        leftSidebar\n" +
              "    </div>\n" +
              "    </div>\n" +
              "    \n" +
              "   ";
    }

    String addRightSidebar(){
        return "\n" +
                "    <div class=\"col-sm-8\">\n" +
                "    <div id=\"rightSidebar\">\n" +
                "        rightSidebar\n" +
                "    </div>\n" +
                "    </div>\n" +
                "    ";
    }

}
