package sengar9.vivek.encrypt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edittxt;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittxt=findViewById(R.id.et_text);
        button=findViewById(R.id.btn_encrypt);
        textView=findViewById(R.id.textbox);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = edittxt.getText().toString().trim();
                StringBuffer sb=new StringBuffer();
                for(int i=0;i< a.length();i++) {
                    char c = a.charAt(i);
                    if (c == 122)
                        c = (char) (c - 25);

                    else {
                        if(c == 32)
                            c = (char) (c + 0);
                        else
                            c = (char) (c + 1);
                    }
                    sb.append(c);
                }
                textView.setVisibility(View.VISIBLE);
                textView.setText(sb.toString());

            }
        });
    }
}
