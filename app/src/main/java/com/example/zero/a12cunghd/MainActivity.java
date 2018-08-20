package com.example.zero.a12cunghd;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView imgSelect;
    TextView txtTitleSelect, txtContentSelect;
    int mIdTextTitle, mIdImage, mIdTextContent;
    Button btnXem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_home);

        findViewById(R.id.iv_circle).startAnimation(AnimationUtils.loadAnimation(this, R.anim.anim_circle));

        imgSelect = findViewById(R.id.iv_select);
        txtTitleSelect = findViewById(R.id.tv_title_select);
        txtContentSelect = findViewById(R.id.tv_content_select);
        btnXem = findViewById(R.id.btnXemThem);

        findViewById(R.id.iv_bachduong).setOnClickListener(this);
        findViewById(R.id.iv_baobinh).setOnClickListener(this);
        findViewById(R.id.iv_bocap).setOnClickListener(this);
        findViewById(R.id.iv_cugiai).setOnClickListener(this);
        findViewById(R.id.iv_kimnguu).setOnClickListener(this);
        findViewById(R.id.iv_maket).setOnClickListener(this);
        findViewById(R.id.iv_nhanma).setOnClickListener(this);
        findViewById(R.id.iv_songngu).setOnClickListener(this);
        findViewById(R.id.iv_songtu).setOnClickListener(this);
        findViewById(R.id.iv_thienbinh).setOnClickListener(this);
        findViewById(R.id.iv_xunu).setOnClickListener(this);
        findViewById(R.id.iv_sutu).setOnClickListener(this);


        findViewById(R.id.btnXemThem).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_bachduong:
                showBriefContent(R.drawable.ic_bach_duong, R.string.bach_duong_title1, R.string.bach_duong_title2, R.string.bach_duong_text);
                break;
            case R.id.iv_nhanma:
                showBriefContent(R.drawable.ic_nhan_ma, R.string.nhan_ma_title1, R.string.nhan_ma_title2, R.string.nhan_ma_text);
                break;
            case R.id.iv_baobinh:
                showBriefContent(R.drawable.ic_bao_binh, R.string.bao_binh_title1, R.string.bao_binh_title2, R.string.bao_binh_text);
                break;
            case R.id.iv_bocap:
                showBriefContent(R.drawable.ic_bocap, R.string.bo_cap_title1, R.string.bo_cap_title2, R.string.bo_cap_text);
                break;
            case R.id.iv_cugiai:
                showBriefContent(R.drawable.ic_cu_giai, R.string.cu_giai_title1, R.string.cu_giai_title2, R.string.cu_giai_text);
                break;
            case R.id.iv_kimnguu:
                showBriefContent(R.drawable.ic_kim_nguu, R.string.kim_nguu_title1, R.string.kim_nguu_title2, R.string.kim_nguu_text);
                break;
            case R.id.iv_maket:
                showBriefContent(R.drawable.ic_ma_ket, R.string.ma_ket_title1, R.string.ma_ket_title2, R.string.ma_ket_text);
                break;
            case R.id.iv_songngu:
                showBriefContent(R.drawable.ic_song_ngu, R.string.song_ngu_title1, R.string.song_ngu_title2, R.string.song_ngu_text);
                break;
            case R.id.iv_sutu:
                showBriefContent(R.drawable.ic_su_tu, R.string.su_tu_title1, R.string.su_tu_title2, R.string.su_tu_text);
                break;
            case R.id.iv_songtu:
                showBriefContent(R.drawable.ic_song_tu, R.string.song_tu_title1, R.string.song_tu_title2, R.string.song_tu_text);
                break;
            case R.id.iv_thienbinh:
                showBriefContent(R.drawable.ic_thien_binh, R.string.thien_binh_title1, R.string.thien_binh_title2, R.string.thien_binh_text);
                break;
            case R.id.iv_xunu:
                showBriefContent(R.drawable.ic_xu_nu, R.string.xu_nu_title1, R.string.xu_nu_title2, R.string.xu_nu_text);
                break;
            case R.id.btnXemThem:
                if (btnXem.getText().toString().equals("Xem thêm")) showDetail();
                else hideDetail();
                break;
        }
    }

    private void hideDetail() {
        findViewById(R.id.item_1).setVisibility(View.VISIBLE);
        findViewById(R.id.item_2).setVisibility(View.VISIBLE);
        View view = findViewById(R.id.item_3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = 600;
        view.setLayoutParams(layoutParams);
        txtContentSelect.setTextSize(10);
        btnXem.setText("Xem thêm");
    }

    private void showDetail() {
        findViewById(R.id.item_1).setVisibility(View.GONE);
        findViewById(R.id.item_2).setVisibility(View.GONE);
        View view = findViewById(R.id.item_3);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = 0;
        view.setLayoutParams(layoutParams);
        txtContentSelect.setTextSize(16);
        btnXem.setText("Ẩn");
    }

    private void showBriefContent(int imageId, int icTitle1, int icTitle2, int idContent) {
        mIdTextTitle = icTitle1;
        mIdTextContent = idContent;
        mIdImage = imageId;
        imgSelect.setImageResource(imageId);
        txtTitleSelect.setText(icTitle2);
        txtContentSelect.setText(idContent);
    }
}
