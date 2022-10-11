package phone;

public class SystemFactory {

    public OS getInstance(String str){
        if(str.equals("open"))
            return new Android();
        else if (str.equals("closed"))
            return new Ios();
        else
            return new Windows();
    }
}
