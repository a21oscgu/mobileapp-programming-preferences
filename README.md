
# Rapport

# Assignment 6: Shared preferences

**Text**

**Denna kodsnutt visar det som sker när användaren trycker på knappen "CLOSE AND SUBMIT" på sidan <i>SecondActivity</i>:**

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

**Detta skärmklipp visar <i>SecondActivity.java</i> i appen:**

<img src="/Screenshot_20220504_150323.png" width="60%">

**Detta skärmklipp visar <i>MainActivity.java</i> i appen:**

<img src="/Screenshot_20220504_150338.png" width="60%">


_Du kan ta bort all text som finns sedan tidigare_.

## Följande grundsyn gäller dugga-svar:

- Ett kortfattat svar är att föredra. Svar som är längre än en sida text (skärmdumpar och programkod exkluderat) är onödigt långt.
- Svaret skall ha minst en snutt programkod.
- Svaret skall inkludera en kort övergripande förklarande text som redogör för vad respektive snutt programkod gör eller som svarar på annan teorifråga.
- Svaret skall ha minst en skärmdump. Skärmdumpar skall illustrera exekvering av relevant programkod. Eventuell text i skärmdumpar måste vara läsbar.
- I de fall detta efterfrågas, dela upp delar av ditt svar i för- och nackdelar. Dina för- respektive nackdelar skall vara i form av punktlistor med kortare stycken (3-4 meningar).

Programkod ska se ut som exemplet nedan. Koden måste vara korrekt indenterad då den blir lättare att läsa vilket gör det lättare att hitta syntaktiska fel.

```
function errorCallback(error) {
    switch(error.code) {
        case error.PERMISSION_DENIED:
            // Geolocation API stöds inte, gör något
            break;
        case error.POSITION_UNAVAILABLE:
            // Misslyckat positionsanrop, gör något
            break;
        case error.UNKNOWN_ERROR:
            // Okänt fel, gör något
            break;
    }
}
```

Bilder läggs i samma mapp som markdown-filen.

![](android.png)

Läs gärna:

- Boulos, M.N.K., Warren, J., Gong, J. & Yue, P. (2010) Web GIS in practice VIII: HTML5 and the canvas element for interactive online mapping. International journal of health geographics 9, 14. Shin, Y. &
- Wunsche, B.C. (2013) A smartphone-based golf simulation exercise game for supporting arthritis patients. 2013 28th International Conference of Image and Vision Computing New Zealand (IVCNZ), IEEE, pp. 459–464.
- Wohlin, C., Runeson, P., Höst, M., Ohlsson, M.C., Regnell, B., Wesslén, A. (2012) Experimentation in Software Engineering, Berlin, Heidelberg: Springer Berlin Heidelberg.
