
# Rapport

# Assignment 6: Shared preferences

**Den här appen är forkad från LenaSYS/mobileapp-programming-preferences. Appen har två activities, "MainActivity" och "SecondActivity". På sidan "MainActivity" finns det en <i>TextView</i> och en knapp som heter "open". Om användaren klickar på "open" kommer ett <i>intent</i> att startas och sidan "SecondActivity" kommer att visas upp ovanför "MainActivity". På sidan "SecondActivity" finns det en <i>EditText</i> och en knapp som heter "close". Ifall användaren klickar på knappen "close" kommer intentet att avslutas, sidan "SecondActivity" kommer alltså att stängas ner, också kommer det skrivna värdet i <i>EditText</i> att skickas till den <i>TextView</i> som finns på sidan "MainActivity". Texten skickas med hjälp av <i>Shared Preferences</i>.**

**Denna kodsnutt visar det som sker när användaren trycker på knappen "close", "CLOSE AND SUBMIT" står det i appen, på sidan <i>SecondActivity</i>:**

```
Button close = findViewById(R.id.close2nd);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Shared preferences (initieras)
                SharedPreferences myPreferenceRef = getSharedPreferences("POSTNORD_OBJEKT",MODE_PRIVATE);
                SharedPreferences.Editor myPreferenceEditor = myPreferenceRef.edit();

                // Read a preference
                EditText prefTextRef;
                prefTextRef= findViewById(R.id.myedittext);

                // Sätter in text i nyckeln "username"
                myPreferenceEditor.putString("username", prefTextRef.getText().toString());
                myPreferenceEditor.apply();

                finish();
            }
        });
```

**Detta skärmklipp visar <i>SecondActivity</i> i appen, där användaren har skrivit in "Adam" i textfältet:**

<img src="/Screenshot_20220504_150323.png" width="60%">

**Detta skärmklipp visar <i>MainActivity</i> i appen, då användaren tidigare har skrivit in "Adam" i textfältet på sidan <i>SecondActivity</i>:**

<img src="/Screenshot_20220504_150338.png" width="60%">