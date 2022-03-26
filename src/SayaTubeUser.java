import java.util.ArrayList;
import java.util.Random;

public class SayaTubeUser {
    private int id;
    private ArrayList<SayaTubeVideo> uploadedVideos;
    private String username;

    public SayaTubeUser(String name){
        if(name == "" || name == null || name.length() >= 100){
            throw new IllegalArgumentException("Nama tidak boleh kosong!! dan Title tidak boleh lebih dari 100 karakter");
        }
        Random rand = new Random();
        this.uploadedVideos = new ArrayList<SayaTubeVideo>();
        this.username = name;
        this.id = rand.nextInt(100000); // Not used
    }

    public int getTotalVideoPlayCount(){
        int total = 0;
        for(int i = 0; i<uploadedVideos.size();i++){
            try {
                int x = total + uploadedVideos.get(i).getPlayCount();
                if(x < 0){
                    throw new Exception("Max Integer value reached!!");
                }
                total = x;
            } catch (Exception e) {
                System.out.println("Gagal menambahkan view untuk video "+uploadedVideos.get(i).getTitle()+ " "+e);
            }
        }
        return total;
    }

    public void addVideo(SayaTubeVideo vid){
        if (vid.getPlayCount() >= Integer.MAX_VALUE){
            throw new IllegalArgumentException("Playcount melebihi batas integer !!");
        }
        uploadedVideos.add(vid);
    }

    public void printAllVideoPlaycount(){
        System.out.println("User : "+this.username);
        for (int i = 0; i<uploadedVideos.size()&&i<8;i++){
            System.out.printf("Video %d judul : %s\n",i+1,uploadedVideos.get(i).getTitle());
        }
    }
}
