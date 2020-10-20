import com.sun.xml.internal.ws.wsdl.writer.document.Part;

public class CybertekApp {

    public static void main(String[] args) {
        FullTimeMentor fullTime = new FullTimeMentor();
        PartTimeMentor partTime = new PartTimeMentor();

        Mentor mentor = new Mentor(fullTime, partTime);
        mentor.manageAccount();
    }
}
