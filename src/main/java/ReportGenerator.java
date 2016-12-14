import java.io.*;

public class ReportGenerator {

    void initiateReportGeneration()
    {
        try {
            File file = new File("index.html");
            OutputStream outputStream = new FileOutputStream(file);
            System.out.println("Output Stream" + outputStream);
            PrintWriter writer = new PrintWriter(outputStream);

            String indexContent = createLayout();
            writer.print(indexContent);

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


        String addScript = "<script>\n" +
                "\n" +
                "</script>\n";

        String startBody = "\n" +
                "</head>\n" +
                "\n" +
                "<body>\n";


        String closeBodyAndHtml = "\n" +
                "</body>\n" +
                "\n" +
                "</html>";

        String layout = htmlStart + addScript + startBody + addLeftSideBar() + addRightSidebar() + closeBodyAndHtml;

        return layout;

    }

    String addLeftSideBar() {
      return  "<div id=\"leftSidebar\">\n" +
              "leftSidebar\n" +
              "</div>";
    }

    String addRightSidebar(){
        return "\n" +
                "\n" +
                "<div id = \"rightSidebar\">\n" +
                "rightsidebar\n" +
                "</div>\n";
    }

    void createPerformanceSummaryReport(){

    }




}
