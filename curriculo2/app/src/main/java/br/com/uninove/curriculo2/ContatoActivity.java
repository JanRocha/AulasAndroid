package br.com.uninove.curriculo2;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ContatoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }

    public void enviarEmail(View view) {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", "janailson100@gmail.com", null));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Assunto do email");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "CORPO DO EMAIL");
        startActivity(Intent.createChooser(emailIntent, "enviando porra...."));
    }

    public void efetuarLigacao(View view) {
        Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("TEL:" + "952218950"));
        if (checkSelfPermission(Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    Activity#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for Activity#requestPermissions for more details.
            return;
        }
        startActivity(intent);
    }
}
