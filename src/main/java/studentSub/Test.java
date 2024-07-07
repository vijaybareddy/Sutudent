package studentSub;

public class Test {
    public static void main(String[] args) {
        Sutudent sutudent=new Sutudent();
        sutudent.name="Vijay";


        Sub[] sub=new Sub[6];
        sub[0]=new Sub();
        sub[0].subName="telugu";
        sub[0].markes=70;

        sub[1]=new Sub();
        sub[1].subName="English";
        sub[1].markes=80;

        sub[2]=new Sub();
        sub[2].subName="Maths";
        sub[2].markes=25;  


        sub[3]=new Sub();
        sub[3].subName="Hindu";
        sub[3].markes=89;

        sub[4]=new Sub();
        sub[4].subName="Science";
        sub[4].markes=77;

        sub[5]=new Sub();
        sub[5].subName="Social";
        sub[5].markes=90;

        sutudent.sub=sub;
       Service service=new Service();
       service.result(sutudent);

    }
}
