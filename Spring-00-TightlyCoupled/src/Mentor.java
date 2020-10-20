public class Mentor {

    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;
    //MI

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor){
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();//MI
        partTimeMentor.createAccount();
        //MI
    }
}
