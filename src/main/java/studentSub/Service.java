package studentSub;

public class Service {
    public void result(Sutudent sutudent1){
        for (Sub sub1:sutudent1.sub){
            if (sub1.markes>=35){
                System.out.println(sutudent1.name+"pass");
            }else {
                System.out.println("fail");

            }
        }
    }


}
