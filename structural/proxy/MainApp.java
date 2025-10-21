package structural.proxy;
import structural.proxy.example.internet.Internet;
import structural.proxy.example.internet.ProxyInternet; 
import structural.proxy.example.video.ProxyVideoDownloader;
import structural.proxy.example.video.VideoDownloader;
public class MainApp {

    public static void main(String[] args) {

        Internet internet = new ProxyInternet();
        internet.connectTo("google.com");
        internet.connectTo("banned.com");

        System.out.println("==========================================");

        VideoDownloader videoDownloader = new ProxyVideoDownloader();
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("geekific");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("likeNsub");
        videoDownloader.getVideo("geekific");

    }

}
