package com.crif.android.crif_library;

import android.app.IntentService;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Date;

public class DownloadService extends IntentService {


    private final IBinder binder = new LocalBinder();

    public DownloadService() {
        super("MyService");
        Toast.makeText(this, "Constructor", Toast.LENGTH_SHORT).show();
    }

    public class LocalBinder extends Binder {
        DownloadService getService() {
            Toast.makeText(getApplicationContext(), "LocalBinder", Toast.LENGTH_SHORT).show();
            return DownloadService.this;
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(this, "onBind", Toast.LENGTH_SHORT).show();
        return binder;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Toast.makeText(this, "onHandleIntent", Toast.LENGTH_SHORT).show();
    }

    public Date getCurrentDate() {
        return Calendar.getInstance().getTime();
    }


}
