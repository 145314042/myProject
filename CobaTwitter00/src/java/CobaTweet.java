/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import twitter4j.*;
import twitter4j.conf.*;

/**
 *
 * @author Kirizu
 */
public class CobaTweet {
    public static void main(String[] args) {
    String consumerKey = "ejlJRoqj4tozPbP5esGw4ifeq";
    String consumerSecret = "bHfcZZUA5O51o8curikFdCOi8hqUvrRx6xNl7LJzYyb4olIImm";
    String accessToken= "421779736-wEIwNOrATEokxRpnOTKExwAXhxCTJWNYTyyKRoVF";
    String accessTokenSecret = "L4MgdtDyjyOhaQgUPeXqnaEpmZNyf0LmSB4qFyzMgyTCF";
 
    ConfigurationBuilder cb = new ConfigurationBuilder();
 
    cb.setDebugEnabled(true)
      .setOAuthConsumerKey(consumerKey)
      .setOAuthConsumerSecret(consumerSecret)
      .setOAuthAccessToken(accessToken)
      .setOAuthAccessTokenSecret(accessTokenSecret);
 
    Twitter myTwitter = new TwitterFactory(cb.build()).getInstance();
 
    try {
//        Status myStatus = myTwitter.updateStatus("Test 2");
//        System.out.println("Lihat account Twitter Anda sekarang, status telah berhasil di-post.");
        TwitterStream twitterStream;
//        twitterStream;
        System.out.println();
    }
    catch (Exception ex) {
        System.out.println("Gagal melakukan aksi di Twitter. Pesan kesalahan:\n" + ex.getMessage());
    }
}
}
