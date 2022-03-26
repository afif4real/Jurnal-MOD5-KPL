public class driverMain {
    public static void main(String[] args) {
        SayaTubeVideo vid1 = new SayaTubeVideo("Light switch cover by Xoos");
        SayaTubeVideo vid2 = new SayaTubeVideo("review Mac Studio by MKBHD");
        SayaTubeVideo vid3 = new SayaTubeVideo("how to play Hisoka theme by Afif");
        SayaTubeVideo vid4 = new SayaTubeVideo("Review linux fedora");
        SayaTubeVideo vid5 = new SayaTubeVideo("Review racun estetik matcha");
        SayaTubeVideo vid6 = new SayaTubeVideo("Review Its okay not to be okay Afif");
        SayaTubeVideo vid7 = new SayaTubeVideo("Review Ephiphone SG by afif");
        SayaTubeVideo vid8 = new SayaTubeVideo("Review materi alpro golang");
        SayaTubeVideo vid9 = new SayaTubeVideo("Review Ipad Air M1 by MKBHD");
        SayaTubeVideo vid10 = new SayaTubeVideo("Review vocal red velvet future");
        vid1.increasePlayCount(25000000);
        vid2.increasePlayCount(25000000);
        vid3.increasePlayCount(25000000);
        vid4.increasePlayCount(25000000);
        vid5.increasePlayCount(25000000);
        vid6.increasePlayCount(25000000);
        vid7.increasePlayCount(25000000);
        vid8.increasePlayCount(25000000);
        vid9.increasePlayCount(25000000);
        vid10.increasePlayCount(25000000);


        SayaTubeUser user1 = new SayaTubeUser("Afif");
        user1.addVideo(vid1);
        user1.addVideo(vid2);
        user1.addVideo(vid3);
        user1.addVideo(vid4);
        user1.addVideo(vid5);
        user1.addVideo(vid6);
        user1.addVideo(vid7);
        user1.addVideo(vid8);
        user1.addVideo(vid9);
        user1.addVideo(vid10);

        user1.printAllVideoPlaycount();
        System.out.println("Total playcount : "+user1.getTotalVideoPlayCount());

        for(int i = 0; i<85;i++){
            vid1.increasePlayCount(25000000);
        }
        System.out.println("Total playcount : "+user1.getTotalVideoPlayCount());
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeUser vid11 = new SayaTubeUser("");
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            SayaTubeVideo vid11 = new SayaTubeVideo("a");
            vid11.increasePlayCount(-5);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
