import java.util.Random;
import java.util.ArrayList;

public class SayaTubeVideo {
    private int id;
    private String title;
    private int playCount;

    public SayaTubeVideo(String title){
        if(title == "" || title == null || title.length() >= 200){
            throw new IllegalArgumentException("Title tidak boleh kosong! dan Title tidak boleh lebih dari 100 karakter");
        }
        Random rand = new Random();
        this.title = title;
        this.id = rand.nextInt(100000);
        this.playCount = 0;
    }

    public void increasePlayCount(int i){
        if(i > 25000000 || i < 0){
            throw new IllegalArgumentException("Penambahan View maksimal 25.000.000 dan tidak boleh negatif");
        }
        try {
            int x = this.playCount + i;
            if(x < 0){
                throw new Exception("Max Integer value reached!");
            }
            this.playCount += i;
        } catch (Exception e) {
            System.out.println("Gagal menambahkan view "+e);
        }
    }

    public void printVideoDetails(){
        System.out.printf("Title\t: %s\nId\t: %d\nViews\t: %d\n",this.title,this.id,this.playCount);
    }

    public int getPlayCount(){
        return this.playCount;
    }

    public String getTitle(){
        return this.title;
    }
}
