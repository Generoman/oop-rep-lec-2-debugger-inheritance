## Hvordan laste ned prosjektet:

### Metode 1:
* Trykk på den grønne "Code"-knappen oppe til høyre på GitHub
* Velg `Download ZIP`
* Pakk ut ZIP-filen i en egenvalgt mappe, og åpne prosjektet i IntelliJ

### Metode 2:
* Trykk på den grønne "Code"-knappen oppe til høyre på GitHub
* Trykk på knappen til høyre for linken
* Velg `New -> Project from Version Control...` i IntelliJ
* Lim inn linken i URL-feltet og velg mappa hvor prosjektet skal lagres

### Oppdatere allerede nedlastet prosjekt:
* Trykk på den blå pila ved siden av teksten "Git" oppe til høyre i IntelliJ
* Om dere har endret koden mellom nedlasting og oppdatering, kan det skje en merge-konflikt. En måte å løse det på er å laste ned prosjektet på nytt

## Ordliste
* Debugger:
  * Et verktøy for å finne logiske feil i koden vi skriver
  * Sett opp et Break Point i koden hvor du vil debuggeren skal pause programmet
  * Start debuggeren ved å klikke på den lille grønne billa oppe til høyre i IntelliJ
  * Bruk "Step Over" for å gå til neste steg/linje i koden
  * Bruk "Step Into" for å se nærmere på en metode som kjøres på linja du er på
    * Hvis flere metoder kjøres på samme linje, bruk piltastene og enter for å velge metode
  * Bruk "Resume Program" (nede til venstre i IntelliJ) for å fortsette å kjøre programmet til det enten stopper, eller kommer til et nytt break point
* Overklasse/Forelderklasse/Superklasse:
  * En klasse som en annen klasse arver fra
* `protected`-nøkkelordet:
  * Betyr at et field eller en metode er tilgjengelig for alle *subklasser*, og alle klasser som ligger i samme *pakke*
  * Brukes på samme måte som `public` og `private`
* Pakke/Package:
  * Mapper som brukes for å organisere klasser/filer i et prosjekt
* `import`-nøkkelordet
  * Brukes når man henter inn klasser fra en annen pakke enn den man befinner seg i
  * Eksempel:
    * `import packagename.nameofpackageinsidepackage.MyClass` - for å hente ut en spesifikk klasse fra en pakke
    * `import packagename.nameofpackageinsidepackage.*` -for å hente ut ALLE klasser i en pakke
  * IntelliJ fikser dette automatisk i de fleste tilfeller
* Underklasse/Barneklasse/Subklasse
  * En klasse som arver fra en annen klasse
  * Bruker `extends`-nøkkelordet for å vise hvilken klasse den arver fra
* `super`-nøkkelordet
  * Refererer til noe som ligger i superklassen
  * Brukes f.eks. til å få tak i fields definert i superklassen, eller for å kjøre en metode som virker på en annerledes måte i superklassen 
* Abstrakt Klasse
  * En klasse vi ikke kan lage et objekt av
* Abstrakt Metode
  * En metode uten "body", som ikke har noe funksjonalitet
  * Alle subklasser av superklassen med en abstrakt metode MÅ implementere en egen versjon av denne abstrakte metoden
* `abstract`-nøkkelordet
  * Brukes for å vise at en klasse eller en metode er abstrakt
* Interface
  * En slags "kontrakt" som skal oppfylles av klasser
  * Inneholder en samling av abstrakte metoder (uten bruk av `abstract`-nøkkelordet)
  * En klasse som *implementerer* et interface MÅ ha egne versjoner av alle metoder i det interfacet
  * Hvis en klasse skal implementere et interface, må man bruke `implements`-nøkkelordet
* `@Override`-annotasjonen
  * Brukes for å vise at vi har laget en egen versjon av en metode som fins i en superklasse (overriding av en metode)
  * Merk at metoder som IKKE er abstrakte kan også overrides
* `toString()`-metoden
  * En metode som brukes for å gi en tekstrepresentasjon av et objekt, ved å vise innholdet i objektets fields
  * Er definert i Object-klassen, og er ikke abstrakt
  * Overrides ofte, fordi man vil ha mer nøyaktig informasjon enn det man finner i Object-klassen sin implementasjon av metoden
* Implementasjon/Implementering
  * Et fancy ord i OOP med flere betydninger
  * I interface-sammenheng:
    * Vil si at en klasse bruker et interface
  * I metodesammenheng:
    * Vil si at en klasse har en egen versjon av en abstrakt eller allerede definert metode
  * I generell sammenheng:
    * Vil si at man lager en egen versjon av noe form for funksjonalitet
    * Eksempel: Hvis jeg lager en sorteringsmetode som bruker en kjent sorteringsalgoritme, så har jeg *implementert* denne algoritmen
  * Merk at denne forklaringen er langt fra komplett