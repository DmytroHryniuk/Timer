
        new CountDownTimer(30000, 1000) {

            public void onTick(long millisUntilFinished) {
               long j=millisUntilFinished/1000;
                Toast toast= Toast.makeText(getApplicationContext(), Long.toString(j) , Toast.LENGTH_SHORT);
                toast.show();
            }

            public void onFinish() {
              //  mTextField.setText("done!");
                Intent openMainActivity= new Intent(MainForm.this, MainForm.class);
                openMainActivity.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
                startActivity(openMainActivity);
            }
        }.start();
