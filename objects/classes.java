package objects;

class Computer{
  public void PlayMusic(){
    System.out.println("Music is playing..");
  }
  public String getMeApen(int cost){
    return "pen";

  }
}

public class classes {
  public static void main(String[] args) {
    Computer obj = new Computer();

    obj.PlayMusic();
    String str = obj.getMeApen(45);
    System.out.println(str);

  }
}
