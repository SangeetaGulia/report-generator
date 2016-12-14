import java.util.ArrayList;
import java.util.List;

class ReportObject {
    int testCaseId;
    String query;
    int outputRows;
    String status;

    ReportObject(int testCaseId, String query, int outputRows, String status){
        this.testCaseId = testCaseId;
        this.query = query;
        this.outputRows = outputRows;
        this.status = status;
    }
}

public class Sample {
    List<ReportObject> createReportObjectList(){
        List<ReportObject> list = new ArrayList<ReportObject>();
        for(int i=0;i<20;i++ ){
            if(i%2==0) {
                ReportObject ro = new ReportObject(i, "query" + i, i, "Pass");
                list.add(ro);
            } else {
                ReportObject ro = new ReportObject(i, "query" + i, i, "Fail");
                list.add(ro);
            }
        }
        return list;
    }


    public static void main(String args[]){
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.initiateReportGeneration();

    }
}
