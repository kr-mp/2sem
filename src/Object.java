public class Object {
    private int du;

    private int ch;

    public Object(int newdu, int newch){
        du = newdu;
        ch = newch;
    }
    public int getDu(){
        return du;
    }
    public int getCh(){
        return ch;
    }
    public void plusdu(int sumdu){
        du += sumdu;
    }
    public void plusch(int sumch){
        ch += sumch;
    }
    public  void minusdu(int mindu){
        du -=mindu;
    }
    public void minusch(int minch){
        ch -=minch;
    }

}
