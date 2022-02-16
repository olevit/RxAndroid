package com.example.rxandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private RecyclerView mRecyclerView;
    private SimpleStringAdapter mSimpleStringAdapter;

    // Sample 2
    private Subscription mCatShowSubscription;
    private ProgressBar mProgressBar;
    private RestClient mRestClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Sample 2
        mRestClient = new RestClient(this);
        mProgressBar = (ProgressBar) findViewById(R.id.progressBarLoader);

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mSimpleStringAdapter = new SimpleStringAdapter(this);
        mRecyclerView.setAdapter(mSimpleStringAdapter);

        createObservable();
}