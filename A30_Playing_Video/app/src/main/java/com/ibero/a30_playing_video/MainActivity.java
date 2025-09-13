package com.ibero.videodemo;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import com.ibero.a30_playing_video.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Referencia al VideoView
        VideoView videoView = findViewById(R.id.videoView);

        // Ruta del video en la carpeta raw
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.a30_playing_video);

        // Crear un MediaController para los controles del video
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);

        // Asignar el MediaController al VideoView
        videoView.setMediaController(mediaController);

        // Establecer el video en el VideoView
        videoView.setVideoURI(videoUri);

        // Iniciar la reproducción del video
        videoView.start();
    }
}
