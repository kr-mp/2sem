package Entity;

public class Goblin {

   private String name;
   private int hp;

   private int df;

   private int mp;

   public Goblin(String newname, int newhpmgob, int newdfmgob, int newmpmgob){
      name = newname;
      hp = newhpmgob;
      df = newdfmgob;
      mp = newmpmgob;
   }
   public String getName(){
      return name;
   }
   public int getHp(){
      return hp;
   }
   public int getDf(){
      return df;
   }
   public int getMp(){
      return mp;
   }
   public void setName(String NewNamegob){
      name = NewNamegob;
   }
   public void plushpm(int sumhpgob){
      hp += sumhpgob;
   }
   public void plusdfm(int sumdfgob){
      df += sumdfgob;
   }
   public void plusmpm(int summpgob){
      mp += summpgob;
   }
   public void minushpm(int minhpgob){
      hp -= minhpgob;
   }
   public  void minusdfm(int mindfgob){
      df -= mindfgob;
   }
   public void minusmpm(int minmpgob){
      mp -=minmpgob;
   }


}