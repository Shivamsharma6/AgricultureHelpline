package com.moon.shivam.agriculturehelpline;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Shivam on 21-03-2017.
 */
public class MyFirebaseMessagingService extends FirebaseMessagingService {
    //private static final String TAG = "FCM Service";
    String from,msg;
    long[] duration={500,1000000000};
    //int onms=5000;
    //int offms=5001;
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
          // TODO: Handle FCM messages here.
         //Log.d(TAG, "From: " + remoteMessage.getFrom());
        // Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());
        from=remoteMessage.getFrom();
        msg=remoteMessage.getNotification().getBody();
        // MyNotificationManager mNotificationManager = new MyNotificationManager(getApplicationContext());
       // Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setLargeIcon(BitmapFactory.decodeResource(getApplicationContext().getResources() ,R.drawable.ic_notif))
                        .setContentTitle("Madad aaya hai")
                        .setVibrate(duration)
                        .setLights(Color.RED,1000,1000)
                        .setSound(Uri.parse("android.resource://"+getPackageName()+"/raw/lmhy"))
                        .setContentText(msg);

        Notification notif = new Notification();
        notif.ledARGB = 0xFFff0000;
        notif.flags = Notification.FLAG_SHOW_LIGHTS;
        notif.ledOnMS = 100;
        notif.ledOffMS = 100;



        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
        // Toast.makeText(getApplicationContext(),"From:"+from,Toast.LENGTH_LONG).show();
        // Toast.makeText(getApplicationContext(),"Message:"+msg,Toast.LENGTH_LONG).show();



    }

}
