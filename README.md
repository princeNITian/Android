# Android
This Repository contains the source code for Explicit Intents.
#Important Links
https://developer.android.com/training/basics/intents/result

#Important Notes
We create a new Activity by right click on package where Main Activity resides.
# New->Activity->EmptyActivity.

To Open a Activity, Create a Intent Object.
Intent intent = new Intent();
We have to pass the parameters to Intent(), The first parameter is CurrentActivity.this and second parameter is PackageName.ActivityName.class
For e.g. 
Intent intent = new Intent(MainActivity.this,com.example.prince.explicitintent.Activity2.class);
intent.putEXtra("data",name);
startActivity(intent);

On Other Activity,
String name1 = getIntent().getStringExtra("data");
tvWelcome.setText(name1+"Welcome to Activity2");
