package com.example.tugasprogmob4;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

public class Music3Activity extends AppCompatActivity {

    private Button playbutton;
    private SeekBar posisi;
    private SeekBar volumebar;
    private TextView waktumulai;
    private TextView waktusisa;
    private MediaPlayer mp;
    int totaltime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music1);
        //make back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Music Page");

        ImageView cover3 = (ImageView) findViewById(R.id.yourcovermusic);
        Bundle bundle = getIntent().getExtras();
        if (bundle!=null){
            int res_image = bundle.getInt("cover3");
            cover3.setImageResource(res_image);
        }

        playbutton= (Button) findViewById(R.id.playbutton);
        waktumulai= (TextView) findViewById(R.id.waktumulai);
        waktusisa= (TextView) findViewById(R.id.waktusisa);

        //media player
        mp = MediaPlayer.create(this, R.raw.tresna_mejohan);
        mp.setLooping(true);
        mp.seekTo(0);
        mp.setVolume(0.5f, 0.5f);
        totaltime= mp.getDuration();

        //Possition Bar
        posisi= (SeekBar) findViewById(R.id.posisi);
        posisi.setMax(totaltime);
        posisi.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        if (fromUser) {
                            mp.seekTo(progress);
                            posisi.setProgress(progress);
                        }
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );

        //volume
        volumebar = (SeekBar) findViewById(R.id.volumebar);
        volumebar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        float volumeNum = progress / 100f;
                        mp.setVolume(volumeNum, volumeNum);
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {

                    }
                }
        );
        //update
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (mp != null){
                    try {
                        Message msg = new Message();
                        msg.what = mp.getCurrentPosition();
                        handler.sendMessage(msg);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {}
                }
            }
        }).start();
    }

    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            int currentPosisition = msg.what;
            //update position bar
            posisi.setProgress(currentPosisition);

            //update labes
            String waktuMulai = createTimeLabel(currentPosisition);
            waktumulai.setText (waktuMulai);

            String waktuSisa = createTimeLabel(totaltime-currentPosisition);
            waktusisa.setText ("- " +waktuSisa);
        }
    };

    public String createTimeLabel(int time) {
        String timeLabel= "";
        int min = time / 1000 / 60;
        int sec = time / 1000 % 60;

        timeLabel = min + ":";
        if (sec < 10 ) timeLabel += "0";
        timeLabel += sec;

        return timeLabel;
    }

    public void playbutton (View v){

        if (!mp.isPlaying()){
            //stop play
            mp.start();
            playbutton.setBackgroundResource(R.drawable.pause);
        }else{
            //play
            mp.stop();
            playbutton.setBackgroundResource(R.drawable.playbutton);
        }
    }
    public void showlyrics (View v){

        if( v == findViewById(R.id.buttonlyric)){
            Lyrics3Fragment fragment = new Lyrics3Fragment();
            FragmentManager manager = getSupportFragmentManager();

            manager.beginTransaction().replace(R.id.fragmentlyric, fragment).commit();

        }
    }
    //button youtube
    public void onClick(View v) {
        if (v.getId() == R.id.buttonyoutube) {
            Intent intent = new Intent(this, Youtube3Activity.class);
            this.startActivity(intent);
        }
    }
}
